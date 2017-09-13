package lists;

public class Node<E> implements INode<E> {
	
	private E data;
	private INode<E> next;

		
	public Node(E data){
		
		this.data = data;
		this.next = null;
		
	}
	
	public Node(E data, Node<E> nextNode){
		
		this.next = nextNode;
		this.data = data;
	}
	
	@Override
	public E getData() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public void setData(E data) {
		// TODO Auto-generated method stub
		this.data = data;
	}

	@Override
	public INode<E> getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void setNext(INode<E> next) {
		this.next=next;
		// TODO Auto-generated method stub
		
	}

}
