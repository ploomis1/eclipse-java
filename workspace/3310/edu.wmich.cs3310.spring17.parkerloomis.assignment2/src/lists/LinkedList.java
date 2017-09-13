package lists;

public class LinkedList<E> implements IList<E> {
	
	private Node<E> head;
	private int count;
	private INode<E> temp;
	
	

	@Override
	public void add(E e) {
		
		temp = new Node<E>(e);
		INode<E> current = head;
		
		if(head != null){
			
			while(current.getNext() != null){//work through the linked list until we run into a null node
				current = current.getNext();
			}
			
			current.setNext(temp);//set the next node to the temp node created earlier
			
		}else{//if head is null create new node for head
			head = new Node<E>(e);
		}
		
		count++;		

	}

	@Override
	public void add(int index, E e) throws IndexOutOfBoundsException {
		
		INode<E> temp = new Node<E>(e);
		INode<E> previous = null;
		INode<E> current = head;
		int i = 0;
		
		try{
			
			while(i != index){//move through the linked list until we get to the index to add the node
				previous = current;
				current = current.getNext();
				i++;
			}
			previous = current;
			current = current.getNext();
			
			current.setNext(temp);
			//temp.setNext(current);//temp's next is the current node
		//	previous.setNext(temp);//previous node's next is set to temp node 
			
			count++;
			
		}catch(IndexOutOfBoundsException | NullPointerException err){
			System.out.println("Error: Node not added. Index is out of bounds!");
		}
		

	}

	@Override
	public void clear() {
		
		head.setNext(null);
		head = null;
		this.count = 0;

	}

	@Override
	public boolean contains(E s) {
		
		
		return false;
	}

	@Override
	public E getHead() {
	
		return (E)head.getData();
	}

	@Override
	public E getTail() {
		
		INode<E> current = head;
		
		while(current.getNext() != null){
			
			current = current.getNext();
			
		}
		
		return (E)current.getData();
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		
		INode<E> current = this.head;
		int i = 0;
		
		try{
			
			while(i != index){//move through linked list until we get to the index
				current = current.getNext();
				i++;
			}
			
			return (E)current.getData();
			
		}catch(IndexOutOfBoundsException err){
			System.out.println("Error: Index is out of bounds!");
		}
		
		
		return null;
	}

	@Override
	public int indexOf(E s) {
		
		INode current = head;
		int i = 0;
		
		while(current.getNext() != null){
			if(current.getData().equals(s)){
				return i;
			}
			current = current.getNext();
			i++;
		}
		
		return -1;
	}

	@Override
	public boolean isEmpty() {
		
		if(head == null){
			return true;
		}
		
		return false;
	}
	public void remove1(int index)throws IndexOutOfBoundsException{
		int i = 0;
		INode<E> previous = null;
		INode<E> current = head;
		if(current==head){
			
			head=(Node<E>) head.getNext();
		}
		count--;
		
	}
	@Override
	public String remove(int index) throws IndexOutOfBoundsException {
		
		int i = 0;
		INode<E> previous = null;
		INode<E> current = head;
		
		try{
			
			while(i != index){
				previous = current;
				current = current.getNext();
				i++;
			}
			if(index == 0){//set the head to null if nothing else remains
				head = null;
			}else if(index == count - 1){//sets the current node to null if last node in list
				previous.setNext(null);
			}else{//gets rid of an individual node in the middle of the list
				previous.setNext(current.getNext());
			}
			
		}catch(IndexOutOfBoundsException err){
			System.out.println("Error: index out of bounds.");
		}
		count--;
		return null;
	}

	@Override
	public int size() {
		
		return count;
	}

}
