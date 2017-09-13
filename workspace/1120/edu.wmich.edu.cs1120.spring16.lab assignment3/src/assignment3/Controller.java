package assignment3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller implements IController {
	
	private Scanner kbd;
	//private  ArrayList<String> books;
	//private ArrayList<String> periodicals;
	private Periodical []p;
	private Book []b;
	private String call;
	//ILibrary book = new Book();
	//Ilibrary periodical = new Periodical();
	public Controller(Scanner kbd){
		this.kbd=kbd;
	}

	@Override
	public void displayCollection() {
		
		
		for(int i=0;i<b.length;i++){
			System.out.println(b[i].toString());
			
			
			
		}
		//two for loops. call each array and check for call number.
		for(int i=0;i<p.length;i++){
			System.out.println(p[i].toString());
		}
		//this isnt right but it works.needs due date and checkout date need to call toString()
		
			
		
		//	String everything=("Book Title: "+ Book+"Author: "+ +"Genre: "+ +"Call Number: "+ + "Checked Out: "+ +"Date Out: "+ +"Date Due: "+ ;
			
	//call book then periodical and then call toString
		
		
		//System.out.println(x);
		// TODO Auto-generated method stub

	}

	@Override
	public void checkoutMaterials() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the call number:");
		Scanner kbd1=new Scanner(System.in);
		call =kbd1.nextLine();
		//System.out.println(call);
		ILibrary hello=findItem(call);
		
		if (hello==null){
			System.out.println("That is not a correct call number");
		}
		//ILibrary hello = new LibraryItem();//this is where it is messing up
		else{
			boolean hi=hello.isCheckedOut();
		System.out.println(hi);
				if (hi==true){
					System.out.println("This item has been checked out alreay");
				}
				else{
					hello.checkOut();
					//hello.toString();
					System.out.println("You have succesfully checkout the book. The "+String.format(" Date Due is: %tD\n", hello.getDateDue() ));
				//	hello.getDateDue();
					//hello.getDateCheckedOut();
				}
				
		}
		//hello.toString();
		
	
	}

	@Override
	public ILibrary findItem(String callNum) {
		//for loop then split then check for call num. then for loop for the next thing in line
		//String []hello= new  String [5];
	for(int i=0;i<b.length;i++){
		if (b[i].getCallNumber().equals(callNum)){
			System.out.print(b[i]);
			return b[i];
			
		}
		
			//if found return. need two for loops to find call number
			//return book;//return b[]
			}
	
	for(int i=0;i<p.length;i++){
		
		//ILibrary periodical = new Periodical(hello[0],hello[1],hello[2],hello[3],hello[4]);
		if (p[i].getCallNumber().equals(callNum)){
			System.out.print(p[i]);
			return p[i];//return p[]
			
		}
	}
	
		return null;
	}

	@Override
	public void showMenu() {
		//this works
		System.out.println("1) Display Collection \n"
				+ "2) Check Out Materials \n"
				+ "3) Exit ");
		// TODO Auto-generated method stub

	}

	@Override
	public void readInput(String fileName) throws IOException {
		// TODO Auto-generated method stub
		//this works
		String hello;
		String[] all =new String [6];
		int i=0;
		int h=0;
		File file = new File(fileName);
		kbd=new Scanner(file);
		Book []bo= new Book [kbd.nextInt()];
		this.b=bo;
		
		Periodical []pe = new Periodical[kbd.nextInt()];
		this.p= pe;
		while (kbd.hasNext()) {
		hello=kbd.nextLine();
		
		all=hello.split(",");
				//System.out.println(all[0]);
		if(all[0].equals("B")){
			
				//System.out.println(all[j]);
			b[i]=new Book(all[1],all[2],all[3],all[4]);	
			//books.add(all[j]);
			//System.out.println(b[i]);
			i++;
			
			
		}
		else if(all[0].equals("P")){
			
				//System.out.println(all[j]);
				p[h]=new Periodical(all[1],all[2],all[3],all[4],all[5]);
				//periodicals.add(all[j]);
				
				//System.out.println(p[i]);
				h++;
				
		}
		
			
		///i++;
		//h++;
		}
		
		
//kbd.close();
	}

}
