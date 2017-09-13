package application;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;

import stacks.*;
import lists.IList;
import lists.LinkedList;
import queues.Queues;


public class Application implements IApplication {
	//IList inputStrings = app.readInputFile(); 
	
	
			//inputStrings.add(2,"String added to index 2"); 
//			IList reversedStrings = new LinkedList(); 
//			for(int i=0; i<inputStrings.size();i++){
//				reversedStrings.add(app.reverseString((String) inputStrings.get(i))); 
//				app.printToScreen(inputStrings.get(i), reversedStrings.get(i));
//			} 
//			
//			for(int i=0; i<inputStrings.size();i++){
//				reversedStrings.add(app.String((String) inputStrings.get(i))); 
//				app.printToScreen(inputStrings.get(i), reversedStrings.get(i));
//			} 
//			app.writeOutputFile(reversedStrings);
	LinkedList List = new LinkedList();
	Stack s = new Stack();
	@Override
	public IStack readInputFile() {
		File file= new File("TestForStackAndQueue.txt");
		try{
			Scanner kbd=new Scanner(file);
			//DataInputStream dStream = new DataInputStream(new FileInputStream("TestForStackAndQueue.txt"));
			//Stack s = new Stack();
			while(kbd.hasNextLine()){
				Object i=kbd.next();
				
				
			}
			
			kbd.close();
			
		}catch(Exception e){//catch if file is not found
			System.out.println("Error: File Not Found");
			
		}
				
		return	s ;
		
	}

	@Override
	public void writeOutputFile(IList output) {
		
		
		int index = 0;
		
		try{

			DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("output.bin"));
			while(index < output.size()){
	    	  dataOut.writeUTF((String) output.get(index));  
	    	  index++;

	    	  
	    	  
	      }
		  dataOut.close();  	  
		}catch(Exception e){
			System.out.println("Error writing to output file.");
		}
		 
		
	}

	

	@Override
	public String reverseString(String s) {
		
		
		int strLen = s.length();
		IStack stack = new Stack();
		
		String newStr = "";
		
		for(int i = 1; i <= strLen; i++){
			if(i == strLen){
				stack.push(s.substring(i - 1));
			}else{
				stack.push(s.substring(i-1, i));
			}
		}
		
		for(int i = 0; i < strLen; i++){
			newStr = newStr + stack.peek();
			stack.pop();
		}
		
		
		return newStr;
		
	}
public String String(String s) {
	Queues q =new Queues();
	int strLen = s.length();
		
		
		String newStr = "";
	for(int i=0;i<+strLen;i++){
		if(i == strLen){
			q.enqueue(s.substring(i-1));
		}else{
			q.enqueue(s.substring(i-1, i));
			
		}
	}
		
		for(int i = 0; i < strLen; i++){
			newStr = newStr + q.peek();
			q.dequeue();
		}
		
		return newStr;
		
	}

}
