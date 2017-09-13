package sorting;

import java.util.Collections;
import java.util.LinkedList;

public class Bubble {

	public static void bubble(Object[] unsorted) {
		
		for (int iter = 1; iter < unsorted.length; iter++) {
			for (int inner = 0; inner < (unsorted.length - iter); inner++) {
				if ((((Comparable) (unsorted[inner])).compareTo(unsorted[inner + 1])) > 0) {
					/**Compare in order to sort
					 * 
					 */
					Object tmp = unsorted[inner];
					unsorted[inner] = unsorted[inner + 1];
					unsorted[inner + 1] = tmp;
				}
			}
		}
	}

	public void bubble(LinkedList l) {
		Collections.sort(l);

	}
				

}
