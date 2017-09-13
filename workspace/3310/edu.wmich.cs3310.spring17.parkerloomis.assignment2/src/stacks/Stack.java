package stacks;

import lists.IList;
import lists.LinkedList;

public class Stack<E> implements IStack {
	private IList list = new LinkedList();

	@Override
	public void push(Object s) {
		// TODO Auto-generated method stub
		list.add(s);
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		list.remove(size()-1);
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		Object top = list.getTail();
		
		return top;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}

}
