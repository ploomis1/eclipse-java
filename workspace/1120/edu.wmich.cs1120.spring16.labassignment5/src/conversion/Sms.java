package conversion;

import java.util.Scanner;

public class Sms implements ISms {

	@Override
	public void setInput(String myInput) {
		// TODO Auto-generated method stub
		//sets input to user input
	}

	@Override
	public String textToSMS() {
		// TODO Auto-generated method stub
		System.out.println("Input text to be converted to SMS:");
Scanner kbd=new Scanner(System.in);

String input=kbd.nextLine();
input=input.toLowerCase();
input = input.replace("what", "w@");
input = input.replace("incredible", "NcreDbl"); 
input = input.replace("best", "A1");
input = input.replace("the", "d");
input = input.replace("england", "UK");
input = input.replace("world", "wrld");
input = input.replace("and", "n");
input = input.replace("stuff", "stuf");
input = input.replace("that", "dat");
input = input.replace("game", "gme");
input = input.replace("has", "hs");
input = input.replace("twisted", "twistD"); 
input = input.replace("one", "1");
input = input.replace("ten", "10");
input = input.replace("another", "nothA"); 
input = input.replace("again", "agn");
input = input.replace("before", "B4");
input = input.replace("up", "^");
input = input.replace("even", "evn");
input = input.replace("great", "gr8");
input = input.replace("have", "av"); 
input = input.replace("night", "nite"); 
input = input.replace("good", "gud");
		//convert to sms by changing it and going through each word
		return input;
	}

	@Override
	public String smsToText() {
		System.out.println("Input SMS to be converted to text:");
		Scanner kbd=new Scanner(System.in);

		String input=kbd.nextLine();
		//input=input.toLowerCase();
		
		input = input.replace("w@", "what");
		input = input.replace("ncredbl", "incredible"); input = input.replace("a1", "best");
		input = input.replace(" d ", " the ");
		input = input.replace("uk", "England");
		input = input.replace("wrld", "world");
		input = input.replace(" n ", " and ");
		input = input.replace("stuf ", "stuff");
		input = input.replace(" dat ", " that ");
		input = input.replace("gme", "game");
		input = input.replace(" hs ", " has ");
		input = input.replace("twistd", "twisted"); input = input.replace("1", "one");
		input = input.replace("notha", "another"); input = input.replace("agn", "again");
		input = input.replace("b4", "before");
		input = input.replace("^", "up");
		input = input.replace("evn", "even");
		input = input.replace("gr8", "great");
		input = input.replace("av", "have");
		input = input.replace("nite", "night");
		input = input.replace("have", "av");
		input = input.replace("gud", "good");

		
		// TODO Auto-generated method stub
		//convert to text by if statement and changing it
		return input;
	}

}
