package assignment5;
//package edu.wmich.cs3310.fall16.gupta.parkerLoomis.assignment5;
//
//import java.util.Iterator;
//import java.util.Stack;
//
//private class MyIterator implements Iterator<T> {
//	Stack<Node<T>> stack = new Stack<Node<T>>();
//
//	public MyIterator() {
//		if (root != null)
//			stack.push(root);
//	}
//
//	public boolean hasNext() {
//		return !stack.isEmpty();
//	}
//
//	public T next() {
//		Node<T> cur = stack.peek();
//		if (cur.left != null) {
//			stack.push(cur.left);
//		} else {
//			Node<T> tmp = stack.pop();
//			while (tmp.right == null) {
//				if (stack.isEmpty())
//					return cur.data;
//				tmp = stack.pop();
//			}
//			stack.push(tmp.right);
//		}
//
//		return cur.data;
//	}// end of next()
//
//	public void remove() {
//
//	}
//}
