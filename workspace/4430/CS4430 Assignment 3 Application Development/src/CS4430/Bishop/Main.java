package CS4430.Bishop;

import java.sql.*;
import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in); // global scanner
	public static mySQLConnector table;

	public static void main(String[] args) throws SQLException {
		table = new mySQLConnector();
		chooser();
	}

	private static void chooser() throws SQLException {
		while (true) {
			System.out.print("1 add a customer       4 add an order\n"
					+ "2 remove an order      5 ship an order\n"
					+ "3 print pending order  6 restock parts\n" + "7 exit\n"
					+ "What would you like to do: ");
			int choice = input.nextInt();
			input.nextLine();
			switch (choice) {
			case 1:
				addACustomer();
				break;
			case 2:
				removeAnOrder();
				break;
			case 3:
				printPendingOrder();
				break;
			case 4:
				addAnOrder();
				break;
			case 5:
				shipAnOrder();
				break;
			case 6:
				restockParts();
				break;
			case 7:
				exit();
				return;
			default:
				System.out.println("Not a valid choice\n\n");
				break;
			}
		}
	}

	private static void addACustomer() throws SQLException {
		String command = "insert into customers (cname, street, zip, phone) values ('";
		System.out.print("Enter Customers Name: ");
		command += input.nextLine() + "', '";
		System.out.print("Enter Customers Street: ");
		command += input.nextLine() + "', '";
		System.out.print("Enter Customers Zipcode: ");
		String zip = input.nextLine();
		command += zip + "', '";
		ResultSet zipQ = table
				.executeQuery("select zip from zipcodes where zip = " + zip
						+ ";");
		if (!zipQ.first()) {
			System.out.print("Enter Customers City: ");
			table.executeUpdate("insert into zipcodes (zip, city) values ('"
					+ zip + "', '" + input.nextLine() + "');");
		}
		zipQ.close();
		System.out.print("Enter Customers Phone (###-###-####): ");
		command += input.nextLine() + "');";
		table.executeUpdate(command);
		System.out.print("Customer Added\n\n");
		
		
		
		
	}
		
		private static void sale() throws SQLException {
			ResultSet orderQ;
			try {
				String command = "";
				System.out.print("Enter Vendor Number: ");//if it exists keep going
				int vno =
				input.nextInt();
				System.out.print("Enter Part Number: ");//if it exists keep going
				int pnum = input.nextInt();
				
				input.nextLine();
				ResultSet partQ = table.executeQuery("select * from parts "
						+ "where vno = "+vno+" and pno = " + pnum + ";");
				if (//isnt an empty set) {
					command = "insert into sale (eno, cno, cname, vno, pno, qty, price, total,date) values ("
							+ pnum + ", '";
					System.out.print("Enter Employee Number: ");//if it exists keep going
				String eno=	input.nextLine();
					command += eno + "', ";
					System.out.print("Enter Customer Number: ");
					command += input.nextLine() + "', ";//if it exists keep going
					orderQ = table.executeQuery("select e.ename from employees e  where e.eno= " +eno +";");
					orderQ.next();
					String ename=orderQ.getString(1);
					command += ename+"',";
					command += vno + "', ";
					command += pnum + "', ";
					System.out.print("Enter Quanity: ");
					command += input.nextInt() + ", '";
					input.nextLine();
					
						
						orderQ = table.executeQuery("select p.price from parts p where vno = "+vno+" and pno = " + pnum + ";");
					
					
					orderQ.next();
					int price = orderQ.getInt(1);
					orderQ.close();
					command += price + "', ";
					
					command += input.nextInt() + ");";
				
				partQ.close();
				input.nextLine();
				table.executeUpdate(command);
				System.out.print("Parts Updated\n\n");
			} catch (SQLException e) {
				System.out.print("Bad information Entered\n");
			}
			
		}
	

	private static void removeAnOrder() throws SQLException {
		try {
			System.out.print("Enter Order Number for deletion: ");
			int ono = input.nextInt();
			input.nextLine();
			try {
				String command = "delete from order_line where ono=" + ono
						+ ";";
				table.executeUpdate(command);
			} catch (Exception e) {
			}
			String command = "delete from orders where ono=" + ono + ";";
			table.executeUpdate(command);
			System.out.print("Order deleted\n\n");
		} catch (Exception e) {
			System.out.print("Order number does not match records\n\n");
			return;
		}
	}

	private static void addAnOrder() throws SQLException {
		String command2 = "";
		int pno, amount, current;
		ResultSet orderQ;
		try {
			System.out.print("Enter Part Number: ");
			pno = input.nextInt();
			command2 += pno + ", ";
			input.nextLine();
			orderQ = table.executeQuery("select * from parts where pno = "
					+ pno + ";");
		} catch (Exception e) {
			System.out.print("Part number does not match records\n\n");
			return;
		}
		System.out.print("Enter Amount of Part Ordered: ");
		amount = input.nextInt();
		command2 += amount + ");";
		input.nextLine();
		orderQ.next();
		current = orderQ.getInt(3);
		if (current < amount) {
			System.out.print("Not enough parts to complete order\n\n");
			return;
		}
		orderQ.close();
		String command = "insert into orders (cno, eno) values (";
		try {
			System.out.print("Enter Customers Number: ");
			command += input.nextInt() + ", ";
			input.nextLine();
			System.out.print("Enter Employees Number: ");
			command += input.nextInt() + ");";
			input.nextLine();
			table.executeUpdate(command);
		} catch (Exception e) {
			System.out
					.print("Customer or Employee number does not match records\n\n");
			return;
		}
		orderQ = table.executeQuery("select max(ono) from orders;");
		orderQ.next();
		int ono = orderQ.getInt(1);
		orderQ.close();
		table.executeUpdate("insert into order_line (ono, pno, qty) values ("
				+ ono + ", " + command2);
		table.executeUpdate("update parts set qoh=" + (current - amount)
				+ " where pno=" + pno + ";");
		System.out.print("Orders Updated\n\n");
	}

	private static void shipAnOrder() {
		try {
			System.out.print("Enter Order Number to ship: ");
			String command = "update orders set shipped=now() where ono="
					+ input.nextInt() + ";";
			input.nextLine();
			table.executeUpdate(command);
			System.out.print("Order Shipped\n\n");
		} catch (Exception e) {
			System.out.print("Order number does not match records\n\n");
			return;
		}
	}

	// list with customer information
	private static void printPendingOrder() throws SQLException {
		ResultSet orderQ = table
				.executeQuery("select o.cno, c.cname, c.street, c.zip, "
						+ "o.ono, o.received from orders o, customers c where shipped <> true"
						+ " group by o.received;");
		System.out
				.printf("-------------------------------------------------------------------------\n"
						+ "| %5s | %-30s | %-30s | %9s | %5s | %21s |\n"
						+ "-------------------------------------------------------------------------\n", 
						"C Num", "C Name", "Street","Zipcode","O Num","Date Recived");
		for (int i = 1; orderQ.absolute(i); i++) {
			System.out.printf("| %5d | %-30s | %-30s | %9d | %5d | %21s |\n",orderQ.getInt(1),
					orderQ.getString(2),orderQ.getString(3),orderQ.getInt(4),orderQ.getInt(5),
					orderQ.getString(6));
			System.out
			.printf("-------------------------------------------------------------------------\n");
		}
		System.out.println("End Order List\n");
	}

	private static void restockParts() throws SQLException {
		try {
			String command = "";
			System.out.print("Enter Part Number: ");
			int pnum = input.nextInt();
			input.nextLine();
			ResultSet partQ = table.executeQuery("select * from parts "
					+ "where pno = " + pnum + ";");
			if (!partQ.first()) {
				command = "insert into parts (pno, pname, qoh, price, level) values ("
						+ pnum + ", '";
				System.out.print("Enter Part Name: ");
				command += input.nextLine() + "', ";
				System.out.print("Enter Quanity on Hand: ");
				command += input.nextInt() + ", '";
				input.nextLine();
				System.out.print("Enter Part Price: ");
				command += input.nextLine() + "', ";
				System.out
						.print("Enter Quanity Level (1 high, 2 mid, 3 low): ");
				command += input.nextInt() + ");";
			} else {
				command = "update parts set qoh=";
				System.out.print("Enter New Quanity on Hand: ");
				command += input.nextInt() + ", price=";
				input.nextLine();
				System.out.print("Enter New Part Price: ");
				command += input.nextDouble() + ", level=";
				input.nextLine();
				System.out.print("Enter New Quanity Level (1, 2, 3): ");
				command += input.nextInt() + " where pno = " + pnum + ";";
			}
			partQ.close();
			input.nextLine();
			table.executeUpdate(command);
			System.out.print("Parts Updated\n\n");
		} catch (SQLException e) {
			System.out.print("Bad information Entered\n");
		}
	}

	private static void exit() throws SQLException {
		System.out.print("Exiting Program\n\n");
		table.conn.close();
	}
}
