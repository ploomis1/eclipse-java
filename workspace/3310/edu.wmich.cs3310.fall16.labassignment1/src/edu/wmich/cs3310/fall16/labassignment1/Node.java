package edu.wmich.cs3310.fall16.labassignment1;

public class Node {
	//refers to te next node in the list
	Node next;

	//any type of data
	Object data;

	// Node constructor
	public Node(Object dataValue) {
		next = null;
		data = dataValue;
	}

	
//Node construstor with a next value
	public Node(Object dataValue, Node nextValue) {
		next = nextValue;
		data = dataValue;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object dataValue) {
		data = dataValue;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node nextValue) {
		next = nextValue;
	}

}
