package assignment3;

public class Book extends LibraryItem {
	
	private String title;
	private String author;
	private String genre;
	private String callNumber;
	
	
	public Book(String c,String t, String a, String g){
		this.itemType="b";
		this.title=t;
		this.author=a;
		this.genre=g;
		this.callNumber=c;
	}
	
	//public Book(){
	//	
	//}
	@Override
	public String toString(){
		//LibraryItem dates=new LibraryItem();
		//System.out.println(String.format("Date Out: %tD\n", super.getDateCheckedOut()) +String.format("Date Due: %tD\n", super.getDateDue() ));
		String everything="Book Title: "+ title+" Author: "+author +" Genre: "+genre +" Call Number: "+callNumber + " Checked Out: "+super.isCheckedOut()+
				String.format(" Date Out: %tD\n", super.getDateCheckedOut()) +String.format(" Date Due: %tD\n", super.getDateDue() );
		return everything;
	}
	
	public String getTile() {
		return title;
		
	}
	public String getAuthor() {
		
		return author;
	}
	public String getGenre() {
	
	return genre;
	}
	public String getCallNumber() {
	return callNumber;
	
	}
	public void setTile(String t) {
		
		title=t;
	}
	public void setAuthor(String a) {
		
		author=a;
	}
	public void setGenre(String g) {
	
	genre=g;
	}
	public void setCallNumber(String c) {
	
	callNumber=c;
	}
	
	
	/**
	 * need 
	 * Book Title
	 *  Author
	 *  Genre  
	 * Call Number
	 * 
	 * getters and setters for all these and maybe a constructor?
	 * 
	 * 
	 * 
	 */

}
