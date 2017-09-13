package main;

public class BSTS {

	private int[][] Heap;
	private int size;
	private int maxsize;
	private int minCount;
	private int maxCount;
	private int minKey;
	private int maxKey;

	private static final int FRONT = 1;

	public BSTS(int maxsize) {
		/*
		 * create all values and set them
		 */
		this.maxsize = maxsize;
		this.minCount = 2;
		this.minKey = 10;
		this.maxCount = 0;
		this.maxKey = 0;
		this.size = 0;
		Heap = new int[this.maxsize + 1][2];
		Heap[0][0] = Integer.MIN_VALUE;
	}

	/*
	 * gets parent
	 */
	private int parent(int pos) {
		return pos / 2;
	}

	/*
	 * gets left child
	 */
	private int leftChild(int pos) {
		return (2 * pos);
	}

	/*
	 * gets right child
	 */
	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	/*
	 * makes sure there is a node
	 */
	private boolean isLeaf(int pos) {
		if (pos >= (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}

	/*
	 * swaps nodes for heaping
	 */
	private void swap(int fpos, int spos) {
		int tmp;
		int tmp2;
		tmp = Heap[fpos][0];
		tmp2 = Heap[fpos][1];
		Heap[fpos][0] = Heap[spos][0];
		Heap[fpos][1] = Heap[spos][1];
		Heap[spos][0] = tmp;
		Heap[spos][1] = tmp2;
	}

	/*
	 * heaps tree
	 */
	private void minHeapify(int pos) {
		if (!isLeaf(pos)) {
			if (Heap[pos][0] > Heap[leftChild(pos)][0] || Heap[pos][0] > Heap[rightChild(pos)][0]) {
				if (Heap[leftChild(pos)][0] < Heap[rightChild(pos)][0]) {
					swap(pos, leftChild(pos));
					minHeapify(leftChild(pos));
				} else {
					swap(pos, rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	}

	/*
	 * inserts vairables into tree
	 */
	public void insert(int element, int counter) {
		counter += 1;
		if (size == maxsize) {
			expand();
		}
		Heap[++size][0] = element;
		Heap[size][1] = counter;
		if (counter < this.minCount) {
			if (element < this.minKey) {
				this.minCount = counter;
				this.minKey = element;
			}
		}
		if (counter >= this.maxCount) {
			this.maxCount = counter;
			this.maxKey = element;
		}
		int current = size;
		while (Heap[current][0] < Heap[parent(current)][0]) {
			swap(current, parent(current));
			current = parent(current);
		}
		// int current = size;

		// current = parent(current);

	}

	/*
	 * expands if need be
	 */
	public void expand() {
		int[][] newArray = new int[Heap.length + 1][2];
		// System.arraycopy(Heap, 0, newArray, 0, Heap.length);
		int j = 0;
		// an alternative to using System.arraycopy would be a for-loop:
		for (int i = 0; i < this.Heap.length; i++) {

			newArray[i][0] = this.Heap[i][0];

			newArray[j][1] = this.Heap[j][1];
		}
		this.Heap = newArray;
		this.maxsize++;
		j++;
	}

	/*
	 * prints out tree and gets min and max key as well as deletes
	 */
	public void print() {// System.out.print("\n");
							 for (int i = 1; i <= size; i++ )
							 {
							// System.out.print(" PARENT : " + Heap[i][0] + "
							// LEFT CHILD : " + Heap[2*i] [0]
							// + " RIGHT CHILD :" + Heap[2 * i + 1][0]);
							 System.out.println(Heap[i][0]+", "+Heap[i][1]);
							 }//System.out.print("\n");
							// for (int i = 1; i <= size; i++ )
							// {
							// System.out.print(" PARENT : " + Heap[i][0] + "
							// LEFT CHILD : " + Heap[2*i] [0]
							// + " RIGHT CHILD :" + Heap[2 * i + 1][0]);
							// // System.out.println(Heap[i][0]+",
							// "+Heap[i][1]);
							// }

		
	}
	public void printl(){
		System.out.print("\nKey with smallest count " + this.minKey + " Key with largest count " + this.maxKey + "\n");
		remove(this.minKey);
		remove(this.maxKey);
		System.out.println("removed them");
		System.out.println("The fifth element is "+Heap [5][0]+" the 20th element is "+Heap [20][0]+" the 30th element is "+Heap [30][0]+" the 70th element is "+Heap [70][0]);
	}

	/*
	 * calls min heap
	 */
	public void minHeap() {
		for (int pos = (size / 2); pos >= 1; pos--) {
			minHeapify(pos);
		}
	}

	/*
	 * removes node
	 */
	public int remove(int key) {
		int popped = Heap[FRONT][1];
		Heap[FRONT] = Heap[size--];
		minHeapify(FRONT);
		return popped;
	}

	/*
	 * calculates the min node
	 */
	public int min() {
		int popped = Heap[FRONT][0];
		minHeapify(FRONT);
		return popped;
	}

	/*
	 * gets size of tree
	 */
	public int getsize() {
		return size;
	}

	/*
	 * gets count of how many of that node are in the tree already
	 */
	public int getCount(int key) {
		int count = 0;
		for (int i = 0; i <= size; i++) {
			if (Heap[i][0] == key)
				count++;
		}

		return count;
	}

	/*
	 * gets a sum of the key values
	 */
	public int sumKeys() {
		int count = 0;
		for (int i = 1; i <= size; i++) {
			count += Heap[i][0];
		}

		return count;

	}

	/*
	 * gets sum of counts
	 */
	public int sumCount() {
		int count = 0;
		for (int i = 0; i <= size; i++) {
			count += Heap[i][1];
		}

		return count;
	}
	/*
	 * prints inorder
	 */
	// public void inorder()
	// {
	// inorder(root);
	// }
	/// *
	// * prints inorder
	// */
	// private void inorder(Node r)
	// {
	// if (r != null)
	// {
	// inorder();
	// System.out.print(r.data +" ");
	// inorder(r.right);
	// }
	// }
	/// * Function for preorder traversal */
	// public void preorder()
	// {
	// preorder(root);
	// }
	/// *
	// * prints in preorder
	// */
	// private void preorder(Node r)
	// {
	// if (r != null)
	// {
	// System.out.print(r.data +" ");
	// preorder(r.left);
	// preorder(r.right);
	// }
	// }
	/// * Function for postorder traversal */
	// public void postorder()
	// {
	// postorder(root);
	// }
	/// *
	// * prints in postorder
	// */
	// private void postorder(Node r)
	// {
	// if (r != null)
	// {
	// postorder(r.left);
	// postorder(r.right);
	// System.out.print(r.data +" ");
	// }
	// }
}