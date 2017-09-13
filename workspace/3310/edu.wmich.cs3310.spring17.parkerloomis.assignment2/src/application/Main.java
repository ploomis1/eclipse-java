package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

//import java.util.LinkedList;

import lists.IList;
import lists.LinkedList;
import queues.Queues;
import stacks.IStack;
import stacks.Stack;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		minvalue();
		readInputFile();
		 Stacks();
		 Queue();
		 twoStack();
		 twoQueue();

	}

	public static void Stacks() {
		Random rand = new Random();
		Stack s = new Stack();
		for (int i = 0; i < 10; i++) {
			int r = rand.nextInt(20);
			s.push(r);
			System.out.print(s.peek() + "");
		}
		for (int j = 0; j <= 9; j++) {
			System.out.print(s.peek() + "");
			s.pop();

		}

	}

	public static void readInputFile() {
		File file = new File("TestForStackAndQueue.txt");
		File f = new File("TestForMinVlue.txt");
		Stack s = new Stack();
		Queues q = new Queues();
		Stack s1 = new Stack();
		Queues q1 = new Queues();
		try {
			Scanner kbd = new Scanner(file);

			// DataInputStream dStream = new DataInputStream(new
			// FileInputStream("TestForStackAndQueue.txt"));

			while (kbd.hasNextLine()) {
				Object i = kbd.next();
				s.push(i);
				q.enqueue(i);

			}

			kbd.close();

		} catch (Exception e) {// catch if file is not found
			System.out.println("Error: File Not Found");

		}
		try {
			Scanner kbd = new Scanner(f);

			// DataInputStream dStream = new DataInputStream(new
			// FileInputStream("TestForStackAndQueue.txt"));

			while (kbd.hasNextLine()) {
				Object i = kbd.next();
				s1.push(i);
				q1.enqueue(i);

			}

			kbd.close();

		} catch (Exception e) {// catch if file is not found
			System.out.println("Error: File Not Found");

		}

		for (int j = 0; j <= 4; j++) {
			System.out.print(s.peek() + " ");

			s.pop();

		}
		System.out.println("");
		for (int j = 0; j <= 4; j++) {

			System.out.print(q.peek() + " ");
			q.dequeue();

		}

	}

	public static void Queue() {
		Queues q = new Queues();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int r = rand.nextInt(20);
			q.enqueue(r);

		}
		for (int j = 0; j <= 9; j++) {
			System.out.println(q.peek());
			q.dequeue();

		}

	}

	public static void minvalue() throws FileNotFoundException {
		Scanner fileScanner = new Scanner(new File("TestForMinVlue.txt"));
		Stack m = new Stack();
		Stack stack = new Stack();
		int[] temp = new int[50];
		int min = fileScanner.nextInt(); //
		System.out.print(fileScanner.next() + " ");
		m.push(min);
		stack.push(min);
		int i = 0;
		while (fileScanner.hasNextInt()) {
			temp[i] = fileScanner.nextInt();
			stack.push(temp[i]);
			System.out.print(temp[i] + " ");
			if (temp[i] >= min) {
				m.push(min);
			} else {
				min = temp[i];
				m.push(min);
			}
			i++;
		}
		System.out.println("\n" + m.peek());
	}

	public static void twoStack() {
		Stack s = new Stack();
		Stack s1 = new Stack();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int r = rand.nextInt(20);
			s.push(r);
			System.out.print(r + " ");

		}
		System.out.println(" ");
		for (int i = 0; i < 10; i++) {
			Object r = s.peek();
			s1.push(r);
			s.pop();

		}
		for (int i = 0; i < 10; i++) {
			System.out.print(s1.peek() + " ");
			s1.pop();

		}

	}

	public static void twoQueue() {
		Queues q = new Queues();
		Queues q1 = new Queues();

		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int r = rand.nextInt(20);
			System.out.print(r + " ");
			q.enqueue(r);

		}
		System.out.println(" ");
		Object last;
		Object[] temp = new Object[20];
		for (int i = 0; i < 10; i++) {
			while (q.size() > 1) {
				last = q.peek();
				q.dequeue();
				q1.enqueue(last);
			}
			System.out.print(q.peek() + " ");
			q.dequeue();
			Queues tem = q;
			q = q1;
			q1 = tem;

		}

	}
}
