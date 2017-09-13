package sorting;

public class Quick {

	public Quick() {
		// TODO Auto-generated constructor stub
	}
	public static void Sort(float [] unsorted) {
		System.out.print("\n");
		
		for (int iter = 1; iter < unsorted.length; iter++) {
			for (int inner = 0; inner < (unsorted.length - iter); inner++) {
				if ((((Comparable) (unsorted[inner])).compareTo(unsorted[inner + 1])) > 0) {
					/**Compare in order to sort
					 * 
					 */
					float tmp = unsorted[inner];
					unsorted[inner] = unsorted[inner + 1];
					unsorted[inner + 1] = tmp;
				}
			}
		}
	}

}
