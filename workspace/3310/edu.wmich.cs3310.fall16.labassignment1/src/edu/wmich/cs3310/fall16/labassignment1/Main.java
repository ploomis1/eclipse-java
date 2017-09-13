package edu.wmich.cs3310.fall16.labassignment1;

import java.util.Random;
import java.util.Scanner;

public class Main {
	private List list = new List();


	public static void main(String[] args) {

		Random rand = new Random();// call random class
		List list = new List();// call linked list
		Scanner kbd = new Scanner(System.in);
		System.out.println("Please enter the number m from which random integers will be generated from 1 to m");
		int i = kbd.nextInt();
		System.out.println("Please enter the number of integers you want");
		int k = kbd.nextInt();
		System.out.println("Please enter the number of times you want the program to run");
		int r = kbd.nextInt();
		kbd.close();
		int count = 0;
//gets user input
		int l;
		int h = 0;
		int[] array = new int[k + 1];
//generates random numbers. adds to list and array
		for (int j = 0; j < k; j++) {
			l = rand.nextInt(i);
			if (l > 50) {
				count += 1;
			}
			array[j] = l;
			list.add(h);
			// System.out.println(h);
			h = l;
		}
//repeats steps as many times as the user says
		for (int t = 0; t < r; t++) {
			list.add(10);
			array[k] = 10;
			sortList(list, count);
			sortArray(array, count);
			if (k <= 100) {
				list.outputList();
				System.out.println("");
				for (int p = 0; p < array.length; p++) {

					System.out.println(array[p]);
				}
			}
		}
	}

	public static int[] sortArray(int[] array, int count) {

		if (count > 5) {
			boolean swapped = true;
			int j = 0;
			int temp;
			while (swapped) {
				swapped = false;
				j++;
				for (int i = 0; i < array.length - j; i++) {
					if (array[i] > array[i + 1]) {
						temp = array[i];
						array[i] = array[i + 1];
						array[i + 1] = temp;
						swapped = true;
					}
				}
			}
			array[4] = 0;//sorts and deletes 5th element
		} else {
			boolean swapped = true;
			int h = 0;
			int temp;
			while (swapped) {
				swapped = false;
				h++;
				for (int i = 0; i < array.length - h; i++) {
					if (array[i] < array[i + 1]) {
						temp = array[i];
						array[i] = array[i + 1];
						array[i + 1] = temp;
						swapped = true;
					}
				}
			}
			array[1] = 0;
		}//sorts array and deletes 2nd position
		return array;
	}

	public static void sortList(List list, int count) {

		if (count > 5) {
			for (int k = 0; k < list.size(); k++) {
				for (int i = 1; i < list.size(); i++) {
					if (list.get(i) > list.get(i + 1)) {
						int l = list.get(i + 1);
						list.add(l, i);
						list.remove(i + 2);
					}
				}
			}
			list.remove(5);
			//sorts list an deletes 5th node
		} else {
			for (int k = 0; k < list.size(); k++) {
				for (int i = 1; i < list.size(); i++) {
					if (list.get(i) < list.get(i + 1)) {
						int l = list.get(i + 1);
						list.add(l, i);
						list.remove(i + 2);
					}
				}
			}
			list.remove(2);
			//sorts list and deletes 2nd node
		}

	}

}
