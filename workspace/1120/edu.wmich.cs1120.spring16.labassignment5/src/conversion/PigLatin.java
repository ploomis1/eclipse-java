package conversion;

import java.util.Scanner;

public class PigLatin implements IPigLatin {

	@Override
	public void setInput(String myInput) {
		// TODO Auto-generated method stub
		
		//set input to user input

	}

	@Override
	public String textToPigLatin() {
		// TODO Auto-generated method stub
		//split by to string. then a for loop changing to a char array and then change arrangment and back to a string
		System.out.println("Input text to be converted to PigLatin:");
		Scanner kbd=new Scanner(System.in);

		String input=kbd.nextLine();
		
		
		char v= input.charAt(0);
		// id = input.charAt(0);
		// Gets the first part
		//str = "MyNamespace.SubNameSpace.MyClassName";
		//String
		String str = input.substring(1);
	//	String left=input.replace(input.charAt(0),"");
	//	input=input.toLowerCase();
		input=(str+ Character.toString(v)+"ay");
		//char [] hello=input.toCharArray();
		//int i=hello.length;
//		for(int i)
		
	//input=input.replace(input, newChar)
		
		//changes input to pig latin
		return input;
	}

}
