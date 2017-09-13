package conversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller implements IController {
	ISms convert;
	IPigLatin converts;
	
	
	public Controller(ISms convert,IPigLatin converts){
		this.convert=convert;
		this.converts=converts;
	}

	@Override
	public void setSmsObject(ISms mySms) {
		this.convert=mySms;
		
		// TODO Auto-generated method stub
//sets the sms object
	}

	@Override
	public void setPigLatinObject(IPigLatin myPigLatin) {
		// TODO Auto-generated method stub
//sets the piglatin input
	}

	@Override
	public void runProgram() {
		// TODO Auto-generated method stub
		
		
		boolean end = true;
		while (end){
		System.out.println("What would you like to do? Choose from the following menu:"
				+ "\n1 - Text to SMS conversion"
				+ "\n2 - SMS to Text conversion"
				+ "\n3 - Text to PigLatin conversion"
				+ "\n0 - Quit");
		Scanner kbd=new Scanner(System.in);
		try{
			int choice =kbd.nextInt();
			
			if(choice==1){
			convertTextToSMS();
		}
		if(choice==2){
			convertSMSToText();
		}
		if(choice==3){
			convertTextToPigLatin();
		}
		if(choice==0){
			System.out.println("Program termintating...");
			end=false;
			break;

		}
		//if((String.valueOf(choice).equals(""))){	
			//throw EmptyStringException();}
		
		
		
		
		
		}catch(InputMismatchException e2){
			System.out.println("Invalid option. Please enter  0 1,2,or 3");
		}catch(IllegalArgumentException e3 ){
			System.out.println("Invalid option. Please enter  0 1,2,or 3");
		}
			//catch(EmptyStringException e1){
			//System.out.println("Invalid option. Please enter  0 1,2,or 3");
			
		
			
		}// i cant get my empty string exception to work. everything works besides that
				
		
		
			
		}

		
				
		
		
		//where the menu and program will run
		//have a loop to repeat and throw exceptions

//}

	@Override
	public void convertTextToSMS() {
		// TODO Auto-generated method stub
		
		//ISms convert= new Sms();
		String ans =convert.textToSMS();
		//gets user input to convert and calls appropriate classes
System.out.println(ans);
return;
	}

	@Override
	public void convertSMSToText() {
		

		//ISms convert= new Sms();
		
		
		String ans =convert.smsToText();
		//gets user input to convert and calls appropriate classes
System.out.println(ans);
return;
		// TODO Auto-generated method stub
		//gets user input to convert and calls appropriate classes
	}

	@Override
	public void convertTextToPigLatin() {
		
		//IPigLatin convert= new PigLatin();
		
		String ans =converts.textToPigLatin();
		System.out.println(ans);
		return;
		// TODO Auto-generated method stub
		//gets user input to convert and calls appropriate classes
	}

}
