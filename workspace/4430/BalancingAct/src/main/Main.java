package main;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * read in file
		 */
		Scanner kbd = new Scanner(System.in);
		// for (int i = 0; i < 10; i++) {
		System.out.println("Please enter your depth and input string");
		String input = kbd.nextLine();
		ArrayList<Tree> list = new ArrayList<Tree>();
		String[] array = new String[2];
		array = input.split(", ");
		int depth = Integer.parseInt(array[0]);
		// int trees = (array[1].length() / depth);
		String[] word = new String[array[1].length()];
		word = array[1].split("");
		Tree hey = new Tree(depth,word[0]);
		list.add(hey);
		// need to add first node to tree
		// for loop to add other nodes
		// need to find some way
		
		for (int k = 1; k < word.length; k++) {
			for(int numb=0; numb<;numb++){
			
			
		}
			if ((hey.getString(k, j).compareToIgnoreCase(word[numb]) < 0) && (hey.getString(k, (2*j)+2)==null)) {
			
			
			
			/*for(int numb=0; numb<word.length;numb++){
				for (int j = 0; j < depth; j++) {
					if (hey.isFull(k)==false) {
						System.out.print("boy");
						if(j==0){
						if ((hey.getString(k, j).compareToIgnoreCase(word[numb]) < 0) && (hey.getString(k, (2*j)+2)==null)) {
							hey.addNode(k,word[numb], (2*j)+1);
							System.out.println("right");
							numb++;
							j=depth;
						}else if((hey.getString(k, (2*j)+1)==null)){
							hey.addNode(k,word[numb], (2*j));
							System.out.println("left");
							numb++;
							j=depth;
						}
					}else{
						if ((hey.getString(k, j).compareToIgnoreCase(word[numb]) < 0) && (hey.getString(k, (2*j)+1)==null)) {
							hey.addNode(k,word[numb], (2*j)+1);
							System.out.println("right");
							numb++;
							j=depth;
						}else if((hey.getString(k, (2*j))==null)){
							hey.addNode(k,word[numb], (2*j));
							System.out.println("left");
							numb++;
							j=depth;
						}
						
					}
					*/
		

		// }
		kbd.close();
	}
}
}

