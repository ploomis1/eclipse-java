package sorting;

import java.util.Collections;
import java.util.LinkedList;

public class Insertion {

	public Insertion() {
		// TODO Auto-generated constructor stub
	}

	public static void sort(Object[] inputArray) {
		
		Object temp;
		int i;
		for (int j = 1; j < inputArray.length; j++) {
			temp = inputArray[j];
			i = j - 1;
			while (i >= 0) {
				if (((Comparable) temp).compareTo(inputArray[i]) > 0) {
					break;
					/**Compare in order to sort
					 * 
					 */
				}
				inputArray[i + 1] = inputArray[i];
				i--;
			}
			inputArray[i + 1] = temp;
		}

	}

	public void sort(LinkedList l) {
		Collections.sort(l);

	}

}
