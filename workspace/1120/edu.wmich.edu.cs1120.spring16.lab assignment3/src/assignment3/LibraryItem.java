package assignment3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class LibraryItem implements ILibrary {
	protected String itemType;
	private boolean checked;
	private GregorianCalendar out;
	private GregorianCalendar due;

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		checked=true;
		out = new GregorianCalendar();
	
		//System.out.println(String.format("Date Out: %tD\n", out));
		//call setDateDue(out);
		setDateDue(out);
		//due = (GregorianCalendar)out.clone(); 
		//due.add(Calendar.DAY_OF_YEAR, 50); String.format("Date Out: %tD\n", out);
	}
	@Override
	public String toString(){
		//need to get this to work
		//ILibrary book = new Book();
	//String everything=("Book Title: "+ +"Author: "+ +"Genre: "+ +"Call Number: "+ + "Checked Out: "+ +"Date Out: "+ +"Date Due: "+ ;
		
		return null;
	}
	@Override
	public String getCallNumber() {
		System.out.println("Enter the call number" );
		Scanner kbd=new Scanner(System.in);
		String cn = kbd.nextLine();
		//kbd.close();
		// TODO Auto-generated method stub
		return cn;
	}

	@Override
	public boolean isCheckedOut() {
	
		
		// TODO Auto-generated method stub
		return checked;
	}

	@Override
	public GregorianCalendar getDateCheckedOut() {
		// TODO Auto-generated method stub
		return out;
	}

	@Override
	public GregorianCalendar getDateDue() {
		
		
		
		// TODO Auto-generated method stub
		return due;
	}

	@Override
	public void setDateDue(GregorianCalendar dateDue) {
		//due=dateDue;
		
		//check if book or periodical by itemType
		due = (GregorianCalendar)dateDue.clone(); 
		//due.add(Calendar.DATE, 50); String.format("Date Out: %tD\n", dateDue);
		
		if(itemType.equals("b")){
			due.add(Calendar.DAY_OF_YEAR, 21); String.format("Date Out: %tD\n", dateDue);
			//System.out.println("book "+String.format("Date Out: %tD\n", due));
		}
		
		if(itemType.equals("p")){
			due.add(Calendar.DAY_OF_YEAR, 7); String.format("Date Out: %tD\n", dateDue);
		//	System.out.println(String.format("Date Out: %tD\n", due));
		}
		//setting based on book 21 or periodical 7
		// TODO Auto-generated method stub

	}

}
