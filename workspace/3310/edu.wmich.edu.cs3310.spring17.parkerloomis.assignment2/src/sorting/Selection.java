package sorting;

import java.util.Collections;
import java.util.LinkedList;

public class Selection {

	public Selection() {
		// TODO Auto-generated constructor stub
	}

	public static void selectionSort(float[] list) {
		
		for (int i = 0; i < list.length - 1; i++) {
			int iSmallest = i;

			for (int j = i + 1; j < list.length; j++) {
				if (((Comparable) list[iSmallest]).compareTo((list[j])) > 0) {
					iSmallest = j;
					/**Compare in order to sort
					 * 
					 */
				}
			}
			float iSwap = list[iSmallest];
			list[iSmallest] = list[i];
			list[i] = iSwap;

		}
	}

	public static void selection(float[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int iSmallest = i;

			for (int j = i + 1; j < list.length; j++) {
				if (((Comparable) list[iSmallest]).compareTo((list[j])) > 0) {
					iSmallest = j;
					/**Compare in order to sort
					 * 
					 */
				}
			}
			float iSwap = list[iSmallest];
			list[iSmallest] = list[i];
			list[i] = iSwap;

		}

	}
}





