package edu.wmich.cs3310.fall16.labassignment1;

public class List {

	private Node node;
	private int counts;

	public List() {

		// current is null and counts is set to 0
		node = new Node(null);
		counts = 0;
	}

	public int size() {
		return counts;
	}

	// adds object to linked list
	public void add(Object data) {
		Node temp = new Node(data);
		Node current = node;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		counts++;
	}

	// adds at certian index
	public void add(Object data, int index) {
		Node temp = new Node(data);
		Node current = node;
		for (int i = 1; i < index && current.getNext() != null; i++) {
			current = current.getNext();
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
		counts++;
	}

	// returns element at index
	public int get(int index) {
		if (index <= 0)
			return 0;
		Node current = node.getNext();
		for (int i = 1; i < index; i++) {
			if (current.getNext() == null)
				return 0;
			current = current.getNext();
		}
		return (int) current.getData();
	}

	// removes node at index
	public boolean remove(int index) {
		if (index < 1 || index > size())
			return false;

		Node current = node;
		for (int i = 1; i < index; i++) {
			if (current.getNext() == null)
				return false;
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		counts--;
		return true;
	}

	public void outputList() {
		Node position = node;
		while (position != null) {
			System.out.println(position.getData());
			position = position.getNext();
		}
	}

}
