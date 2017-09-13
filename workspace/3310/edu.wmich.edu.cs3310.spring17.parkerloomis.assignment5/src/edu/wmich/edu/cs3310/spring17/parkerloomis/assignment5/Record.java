package edu.wmich.edu.cs3310.spring17.parkerloomis.assignment5;

public class Record {
	short value;
	short key;
	
	
	public Record(short key, short value){
		
		this.key=key;
		this.value=value;
	}
	
	public short getValue(){
		
		return this.value;
		
	}
	public short getKey(){
		
		return this.key;
		
	}
	//Record (rec is just a single instance of Record), is just a simple record class consisting of a short int key and short int value.

}
