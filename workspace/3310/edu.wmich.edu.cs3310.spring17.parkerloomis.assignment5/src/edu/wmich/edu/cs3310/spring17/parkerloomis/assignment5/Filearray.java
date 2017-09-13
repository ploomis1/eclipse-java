package edu.wmich.edu.cs3310.spring17.parkerloomis.assignment5;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;

public class Filearray {
	int index;
	//start and end of arry
	Record rec;
	BufferPool buff;
	
	public Filearray(File file) throws IOException{
		buff=new BufferPool(file);
		
	}
	
	
	public void SetRecord(int index, Record rec){
		
		
		//
		//find what record is in index. and replace it in buffer
		//mark buffer dirty
		//this.index=index;
		//this.rec=rec;
		
		/*
		 * checks to see if iqndex is in existing buffer
		 * check by calculculating offset
		 * if it is, nothing is done, else 
		 */
	}
	
	//revesrse them
	//mark buffer dirty then 
	public Record getRecord(int index) throws IOException{
		//buff.checkBuffers(index);
		//buff=new BufferPool();
		//System.out.println("f");
		Record rec = buff.checkBuffers(index);
		//System.out.println("f");
		if(rec.getKey()==-1){
		Record recs = buff.doLRU(index);
			return recs;
		}
		
		//buff.checkBuff(index)
		
		
		return rec;
		
		//looks to see if index is in buffer length.
		//if not. checks which buffer is dirty
		//if none, still write buffer back to file if all are full
		//then read in what hasnt been read from index
		
		
	}
	public int getSize(File file) throws IOException{
		int size = buff.getSize(file);
		return size;
	}
	public void print(File file) throws IOException{
		buff.print(file);
	}
//	public void begin(File file) throws IOException{
	//	buff.begin(file);
	//}
//

}
