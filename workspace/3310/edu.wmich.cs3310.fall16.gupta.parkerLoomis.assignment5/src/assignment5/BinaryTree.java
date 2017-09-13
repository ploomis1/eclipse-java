package assignment5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Stack;

public class BinaryTree<T extends Comparable<T>> implements Iterable<T> {
	private Node<T> root;
	private Comparator<T> compare;

	public BinaryTree() {
		root = null;
		compare = null;
	}

	public BinaryTree(Comparator<T> comp) {
		root = null;
		compare = comp;
	}

	private int compare(T p, T n) {
		if (compare == null)
			return p.compareTo(n);
		else
			return compare.compare(p, n);
		/*
		 * campares nodes
		 */
	}

	public void insert(T data) {
		root = insert(root, data);
		//calls insert ,ethod
	}

	private Node<T> insert(Node<T> p, T insert) {
		/*
		 * this method inserts the node into the tree
		 */
		if (p == null)
			return new Node<T>(insert);

		if (compare(insert, p.data) == 0)
			return p;

		if (compare(insert, p.data) < 0)
			p.left = insert(p.left, insert);
		else
			p.right = insert(p.right, insert);

		return p;
	}

	public boolean search(T toSearch) {
		return search(root, toSearch);
	}

	private boolean search(Node<T> p, T toSearch) {
		/*
		 * searches to find the desired node and returns a boolean
		 */
		if (p == null)
			return false;
		else if (compare(toSearch, p.data) == 0)
			return true;
		else if (compare(toSearch, p.data) < 0)
			return search(p.left, toSearch);
		else
			return search(p.right, toSearch);
	}

	public void delete(T toDelete) {
		root = delete(root, toDelete);//calls the delete method
	}

	private Node<T> delete(Node<T> p, T toDelete) {
		/*
		 * searches tree and deletes the desired node
		 */
		if (p == null)
			System.out.println("This node doesn't exist in the tree");
		else if (compare(toDelete, p.data) < 0)
			p.left = delete(p.left, toDelete);
		else if (compare(toDelete, p.data) > 0)
			p.right = delete(p.right, toDelete);
		else {
			if (p.left == null)
				return p.right;
			else if (p.right == null)
				return p.left;
			else {
				p.data = retrieveData(p.left);// get data from the rightmost node in the left subtree

				p.left = delete(p.left, p.data);// delete the rightmost node in the left subtree
			}
		}
		return p;
	}

	private T retrieveData(Node<T> p) {
		while (p.right != null)
			p = p.right;

		return p.data;
	}

	public String toString() {
		/*
		 * Makes it into one string
		 */
		StringBuffer buff = new StringBuffer();
		for (T data : this)
			buff.append(data.toString());

		return buff.toString();
	}

	public void preOrderTraversal() {
		preOrder(root);//calls the preOrder method
	}

	private void preOrder(Node p) {
		/*
		 * files through tree recursivley and prints the tree in preOrder
		 */
		if (p != null) {
			System.out.print(p + " ");
			preOrder(p.left);
			preOrder(p.right);
		}
	}

	public void inOrderTraversal() {
		inOrder(root);//calls the inOrder method
	}

	private void inOrder(Node p) {
		/*
		 * files through tree recursivley and prints the tree in inOrder
		 */
		if (p != null) {
			inOrder(p.left);
			System.out.print(p + " ");
			inOrder(p.right);
		}
	}

	public void postOrderTraversal() {
		postOrder(root);//calls the postOrder method
	}

	private void postOrder(Node p) {
		/*
		 * files through tree recursivley and prints the tree in postOrder
		 */
		if (p != null) {
			postOrder(p.left);
			System.out.print(p + " ");
			postOrder(p.right);
		}
	}

	public Iterator<T> iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator<T> {
		Stack<Node<T>> stack = new Stack<Node<T>>();

		public MyIterator() {
			if (root != null)
				stack.push(root);
		}

		public boolean hasNext() {
			return !stack.isEmpty();//sees if it has any children
		}

		public T next() {
			Node<T> cur = stack.peek();
			if (cur.left != null) {
				stack.push(cur.left);
			} else {
				Node<T> tmp = stack.pop();
				while (tmp.right == null) {
					if (stack.isEmpty())
						return cur.data;
					tmp = stack.pop();
				}
				stack.push(tmp.right);
			}

			return cur.data;
		}

		public void remove() {

		}
	}

	private class Node<T> {
		/*
		 * Node class that is binary
		 */
		private T data;
		private Node<T> left, right;

		public Node(T data, Node<T> l, Node<T> r) {
			left = l;
			right = r;
			this.data = data;
		}

		public Node(T data) {
			this(data, null, null);
		}

		public String toString() {
			return data.toString();
		}
	}
}

class MyComp implements Comparator<Integer> {
	public int compare(Integer x, Integer y) {
		return y - x;
	}
}
