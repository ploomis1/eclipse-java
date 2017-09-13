package application;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

import queues.Queues;
import sorting.Bubble;
import sorting.Insertion;
import sorting.Merge;
import sorting.Selection;
import stacks.Stack;

public class Controller {

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readInputFile();

	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public static void readInputFile() {
		File file = new File("NameList.txt");
/**Read input file
 * 
 */
		@SuppressWarnings("rawtypes")
		// LinkedList l = new LinkedList();
		LinkedList l = new LinkedList();
		try {
			Scanner kbd = new Scanner(file);
			while (kbd.hasNextLine()) {
				Object i = kbd.next();
				l.add(i);
				/*add to linked list
				 * 
				 */
			}

			kbd.close();

		} catch (Exception e) {// catch if file is not found
			System.out.println("Error: File Not Found");

		}
		Object[] array = new Object[l.size()];
		try {
			Scanner kbd = new Scanner(file);

			int j = 0;
			while (kbd.hasNextLine()) {
				Object i = kbd.next();
				array[j] = i;
				/**add to an array
				 * 
				 */
				j++;
			}

			kbd.close();

		} catch (Exception e) {// catch if file is not found
			System.out.println("Error: File Not Found");

		}
		
		@SuppressWarnings("rawtypes")
		Bubble bubble = new Bubble();
		Selection sel = new Selection();
		Merge merge = new Merge();
		Insertion insert = new Insertion();
		 print(array);
		 //print(l);
		 insert.sort(array);
		// insert.sort(l);
		// sel.selectionSort(array);
		// sel.selection(l);
		// merge.mergeSort(array);
		// merge.mergelist(l);
		// bubble.bubbleSort(array);
		// bubble.bubble(l);
		 print(array);
		// print(l);

	}

	public static void print(Object[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + "." + a[i] + " ");
		}
	}

	public static void print(LinkedList a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.println(i + "." + a.get(i) + " ");
		}
	}
}
