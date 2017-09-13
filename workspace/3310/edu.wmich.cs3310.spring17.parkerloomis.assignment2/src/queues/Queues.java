package queues;

import lists.IList;
import lists.LinkedList;
import lists.Node;

public class Queues<E> implements IQueues {
private IList list = new LinkedList();

	public Queues() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enqueue(Object item) {
		// TODO Auto-generated method stub
		list.add(item);	
	}

	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		
		list.remove1(list.indexOf(list.getHead()));
		
		return null;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return list.getHead();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(list.size()==0){
			return true;
		}
		else{
			return false;
		}
	
		
	}

}
