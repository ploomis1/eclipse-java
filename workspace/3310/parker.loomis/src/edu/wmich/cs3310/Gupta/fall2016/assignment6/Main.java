package edu.wmich.cs3310.Gupta.fall2016.assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Menu();
	}

	public static void Menu() throws IOException {
		@SuppressWarnings("resource")
		Scanner kbd = new Scanner(System.in);
		String answer = null;
		String[] array = new String[20];
		do {
			System.out.println(
					"What would you like todo next?\nAdd(1), Find(2), Delete(3), " + "Show Table(4), Exit(5) ");
			answer = kbd.next();
			if (answer.equals("1")) {
				array = add(array);
			} else if (answer.equals("2")) {
				find();
			} else if (answer.equals("3")) {
				array = delete(array);
			} else if (answer.equals("4")) {
				showTable();
			} else if (answer.equals("5")) {
				break;
			} else {
				System.out.println("Incorrect entry");
			}
		} while (!answer.equals("5"));
		System.out.println("Here is the array in its hash order");
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static String[] add(String[] store) throws IOException {
		@SuppressWarnings("resource")
		Scanner take = new Scanner(System.in);
		File outFile = new File("hashTable.txt");
		FileWriter write = new FileWriter(outFile);
		PrintWriter pWriter = new PrintWriter(write);
		String yes;
		System.out.println("Add all names before exiting the name entry program");
		do {
			System.out.println("What name would you like to encrypt?");
			String str = take.nextLine();
			pWriter.print(str + " ");
			int hash = 7;
			int hashValue = 0;
			for (int i = 0; i < str.length(); i++) {
				hash = hash ^ str.charAt(i);
				hashValue = +hash;
			}
			System.out.println();
			hashValue = hashValue % store.length;
			store[hashValue] = str;
			System.out.println("The Name was Encrypted with the hash value of " + hashValue);
			pWriter.print(hashValue + "\n");
			System.out.println();
			System.out.println("Would you like to add anymore names?");
			yes = take.nextLine().toLowerCase();
		} while (yes.equals("yes") || yes.equals("y"));
		System.out.println("Successfully wrote name and hashcode to the file\n");
		pWriter.close();
		return store;
	}

	public static void find() throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner kbd = new Scanner(System.in);
		System.out.println("Would you like to search by hash or by name?");
		String here = kbd.nextLine().toLowerCase();
		if (here.equals("hash")) {
			System.out.println("What is the hash number you are searching for?");
			String hashSearch = kbd.nextLine();
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(new File("hashTable.txt"));
			while (scan.hasNext()) {
				String name = scan.next();
				if (scan.next().equals(hashSearch)) {
					System.out.println(hashSearch + " was found as " + name);
				}
			}
		} else if (here.equals("name")) {
			@SuppressWarnings("resource")
			Scanner kbd1 = new Scanner(System.in);
			System.out.println("What name are you searching for?");
			String nameSearch = kbd1.nextLine();
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(new File("hashTable.txt"));
			while (scan.hasNext()) {
				if (scan.next().equals(nameSearch)) {
					System.out.println(nameSearch + " was found under the hash value of " + scan.next());
				}
			}
		}
		else {
			System.out.println("Incorrect entry");
		}
	}

	public static String[] delete(String[] store) throws IOException {
		@SuppressWarnings("resource")
		Scanner kbd = new Scanner(System.in);
		System.out.println("Would you like to delete by hash or name?");
		String here = kbd.nextLine();
		if (here.equals("Hash")) {
			System.out.println("What is the has value you are searching for?");
			int hashSearch = kbd.nextInt();
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(new File("hashTable.txt"));
			while (scan.hasNext()) {
				String name = scan.next();
				if (scan.next().equals(hashSearch)) {
					System.out.println(hashSearch + " was found with the hash value of " + name);
					System.out.println("The Student was deleted");
					store[hashSearch] = "null";
				}
			}
		} else if (here.equals("Name")) {
			@SuppressWarnings("resource")
			Scanner kbd1 = new Scanner(System.in);
			System.out.println("What is the name you are searching for?");
			String nameSearch = kbd1.nextLine();
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(new File("hashTable.txt"));
			while (scan.hasNext()) {
				if (scan.next().equals(nameSearch)) {
					int alright = Integer.parseInt(scan.next());
					System.out.println(nameSearch + " was found with the hash value of " + alright);
					System.out.println("The name was deleted");
					store[alright] = "null";
				}
			}
		}
		return store;
	}

	public static void showTable() throws FileNotFoundException {
		File in = new File("hashTable.txt");
		@SuppressWarnings("resource")
		Scanner into = new Scanner(in);
		while (into.hasNextLine()) {
			String line = into.nextLine();
			System.out.println(line);
		}

	}
}
