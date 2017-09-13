package edu.wmich.edu.cs3310.spring17.parkerloomis.assignment5;

import java.nio.ByteBuffer;


public class MyBuffer{
	ByteBuffer bites;
	int begin;
	int end;
	boolean dirty;
	int access;
	boolean empty;
	
	public MyBuffer(int bufferSize, int begin )
	{ 
		this.begin=begin;
		this.end=begin+bufferSize-1;
		this.bites= ByteBuffer.allocate(bufferSize);
		 access=bufferSize;
		dirty=false;
		empty=false;
	}
	public void setBegin(int index){
		this.begin=index;
		this.end=begin+access-1;
	}
	public boolean isEmpty(){
		
		if (bites.remaining()==0){
			empty=true;
			
		}
		return empty;
			
		
	}
	
	public void setDirty(){
		this.dirty=true;
	}
	public boolean getDirty(){
		return dirty;
	}
	public Range getRange(){
		Range range=new Range(begin,end);
		return range;
		
	}
	public short getShort(int index){
		return bites.getShort(index);
	}
	
	public void addAccess(){
		access+=1;
	}
	
	public int getAccess(){
		return this.access;
	}
	public void setAccess(int value){
		this.access=value;
	}
	public void putShort(short value){
		bites.putShort(value);
		
	}
	public void clear(){
		bites.clear();
	}
	public void putShort(int index,short value){
		bites.putShort(index,value);
		
	}
	//public val
	//set beggining and end bytes from where you read
	// send a buffer into here
	//send buffer back and copy it?

}
