package sorting;

import java.util.Collections;
import java.util.LinkedList;

public class Merge {

	public Merge() {
		// TODO Auto-generated constructor stub
	}

	public static void mergeSort(float[] a) {
		
		if (a.length >= 2) {
			float[] left = new float[a.length / 2];
			float[] right = new float[a.length - a.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = a[i];
			}
			for (int i = 0; i < right.length; i++) {
				right[i] = a[i + a.length / 2];
			}
			mergeSort(left);
			mergeSort(right);
			merge(a, left, right);
		}

	}

	public static void merge(float[] result, float[] left, float[] right) {
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < result.length; i++) {
			if (i2 >= right.length || (i1 < left.length && ((Comparable) left[i1]).compareTo(right[i1]) < 0)) {
				/**Compare in order to sort
				 * 
				 */
				result[i] = (float) left[i1];
				i1++;
			} else {
				result[i] = (float) right[i2];
				i2++;
			}
		}
	}

	public void mergelist(LinkedList l) {
		Collections.sort(l);

	}

}
