package assignment1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();// call random class
		Scanner kbd = new Scanner(System.in);
		System.out.println("Please enter the number m from which random integers will be generated from 1 to m");/** gives number range **/
		int i = kbd.nextInt();
		System.out.println("Please enter the number of integers you want");/** gives number of numbers **/
		int k = kbd.nextInt();
		System.out.println("Please enter the number you want to search for");/** gets number **/
		int x = kbd.nextInt();
		System.out.println("Please enter the number you want to be the last number to search for");/** gets range high number **/
		int y = kbd.nextInt();
		kbd.close();
		// gets user input
		int l;
		int[] array = new int[k];
		// generates random numbers. adds to list and array
		for (int j = 0; j < k - 1; j++) {
			l = rand.nextInt(i);
			array[j] = l;
			// System.out.println(l);
		}
		sortArray(array);
		for (int p = 0; p < array.length; p++) {
			System.out.print(array[p] + ", ");
		}

		if (bsearch(array, x) == -1) {
			System.out.println("\nNumber not found");
			System.exit(0);
		}
		System.out.println("\nNumber of integers between range of " + x + " and " + y + " is "
				+ bsearch(array, bsearch(array, x), y));
		System.out.println("Binary recursive returns " + bsearch(array, x, 0, array.length - 1));
		System.out.println("Ternary recursive returns " + tsearch(array, x, 0, array.length - 1));
		System.out.println("Quad recursive returns " + qsearch(array, x, 0, array.length - 1));
		System.out.println("Binary iterative returns " + bsearch(array, x));
		System.out.println("Ternary iterative returns " + tsearch(array, x));
		System.out.println("Quad iterative returns " + qsearch(array, x));
		
		
		
		

	}

	public static int[] sortArray(int[] array) {

		boolean swapped = true;
		int j = 0;
		int temp;
		while (swapped) {
			swapped = false;
			j++;/** sort the array **/
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
				}
			}

		} // sorts array
		return array;
	}

	public static int bsearch(int[] A, int x, int y) {
		int count = 0;
		for (int i = x; i <= A.length; i++) {
			if (A[i] == y || A[i] > y) {
				return count;
			} else {
				/** add to count **/
				count = count + 1;
			}
		}

		return -1;
	}

	public static int bsearch(int[] array, int x) {
		int low = 0;
		int high = array.length - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (array[middle] == x) {
				return middle;
			}/** Search each range **/
			if (array[middle] < x) {
				low = middle + 1;
			}
			if (array[middle] > x) {
				high = middle - 1;
			}
		}

		return -1;
	}

	public static int bsearch(int[] sorted, int value, int leftIndex, int rightIndex) {

		// 1. index check
		if (leftIndex > rightIndex) {
			return -1;
		}
		int middle = (rightIndex + leftIndex) / 2;
		if (sorted[middle] == value) {
			return middle;/** Search each range **/
		} else if (sorted[middle] > value) {
			return bsearch(sorted, value, leftIndex, middle - 1);
		} else if (sorted[middle] < value) {
			return bsearch(sorted, value, middle + 1, rightIndex);
		} else {
			return -1;
		}
	}

	public static int tsearch(int[] A, int x) {
		int low = 0;
		int high = A.length - 1;

		while (high > low) {
			int mid1 = (low + high) / 3;
			int mid2 = 2 * ((low + high) / 3);
			if (A[mid1] == x) {
				return mid1;
			}
			if (A[mid2] == x) {
				return mid2;
			}
			/** Search each range **/
			if (A[mid1] < x) {
				low = mid1 + 1;
			}
			if (A[mid1] > x) {
				high = mid1 - 1;
			}
			if (A[mid2] < x) {
				low = mid2 + 1;
			}
			if (A[mid2] > x) {
				high = mid2 - 1;
			}

		}
		return -1;
	}

	public static int tsearch(int[] A, int value, int start, int end) {
		if (start > end)
			return -1;

		/** First boundary: add 1/3 of length to start **/
		int mid1 = start + (end - start) / 3;
		/** Second boundary: add 2/3 of length to start **/
		int mid2 = start + 2 * (end - start) / 3;

		if (A[mid1] == value)
			return mid1;

		else if (A[mid2] == value)
			return mid2;
		/** Search 1st third **/
		else if (value < A[mid1])
			return tsearch(A, value, start, mid1 - 1);
		/** Search 3rd third **/
		else if (value > A[mid2])
			return tsearch(A, value, mid2 + 1, end);
		/** Search middle third **/
		else
			return tsearch(A, value, mid1+1, mid2-1);
	}

	public static int qsearch(int[] A, int x) {
		int low = 0;
		int high = A.length - 1;

		while (high > low) {
			int mid1 = (low + high) / 4;
			int mid2 = 2 * ((low + high) / 4);
			int mid3 = 3 * ((low + high) / 4);
			if (A[mid1] == x) {
				return mid1;
			}
			if (A[mid2] == x) {
				return mid2;
			}
			if (A[mid3] == x) {
				return mid3;
			}/** Search each range **/
			if (A[mid1] < x) {
				low = mid1 + 1;
			}
			if (A[mid1] > x) {
				high = mid1 - 1;
			}
			if (A[mid2] < x) {
				low = mid2 + 1;
			}
			if (A[mid2] > x) {
				high = mid2 - 1;
			}
			if (A[mid3] < x) {
				low = mid3 + 1;
			}
			if (A[mid3] > x) {
				high = mid3 - 1;
			}

		}
		return -1;

	}

	public static int qsearch(int[] A, int value, int start, int end) {
		if (start > end)
			return -1;

		/** First boundary: add 1/4 of length to start **/
		int mid1 = start + (end - start) / 4;
		/** Second boundary: add 2/4 of length to start **/
		int mid2 = start + 2 * (end - start) / 4;
		/** Second boundary: add 3/4 of length to start **/
		int mid3 = start + 3 * (end - start) / 4;

		if (A[mid1] == value)
			return mid1;
		else if (A[mid2] == value)
			return mid2;
		else if (A[mid3] == value)
			return mid3;
		/** Search each range **/
		else if (value < A[mid1])
			return tsearch(A, value, start, mid1 - 1);
		else if (value > A[mid1])
			return tsearch(A, value, mid1+1, mid2);
		else if (value < A[mid2])
			return tsearch(A, value, mid1, mid2 - 1);
		else if (value < A[mid3])
			return tsearch(A, value, mid2, mid3 - 1);
		else if (value > A[mid2])
			return tsearch(A, value, mid2 + 1, mid3);
		else if (value > A[mid3])
			return tsearch(A, value, mid3+1, end);
		else
			return tsearch(A, value, mid1+1, mid2-1);
	}
}
