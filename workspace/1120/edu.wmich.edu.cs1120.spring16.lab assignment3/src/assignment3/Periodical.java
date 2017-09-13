package assignment3;

public class Periodical extends LibraryItem {
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
	
	private String title;
	private String volume;
	private String issue;
	private String subject;
	private String callNumber;
	
	public Periodical(String c,String t, String v,String i, String s ){
		this.title=t;
		this.volume=v;
		this.issue=i;
		this.subject=s;
		this.callNumber=c;
		this.itemType="p";
		
	}
	@Override
public String toString(){
		//LibraryItem dates=new LibraryItem();
		String everything="Book Title: "+ title+" Volume: "+ volume+" Issue: "+issue +"Subject: "+subject+ "Call Number: "+callNumber + 
				" Checked Out: "+super.isCheckedOut()+String.format(" Date Out: %tD\n", super.getDateCheckedOut()) +String.format(" Date Due: %tD\n", super.getDateDue() );
		return everything;
	}
	
	
	
	
	public String getTitle() {
		
		return title;
	}
	public String getVolume() {
		
		return volume;
	}
	public String getIssue() {
		
		return issue;
	}
	public String getSubject() {
	return subject;
	
	}
	public String getCallNumber() {
		
		return callNumber;
	}
	public void setTitle(String t) {
		
		title=t;
	}
	public void setVolume(String v) {
		
		volume=v;
	}
	public void setIssue(String i) {
		issue=i;
		
	}
	public void setSubject(String s) {
	subject=s;
	
	}
	public void setCallNumber(String c) {
		
		callNumber=c;
	}

}
