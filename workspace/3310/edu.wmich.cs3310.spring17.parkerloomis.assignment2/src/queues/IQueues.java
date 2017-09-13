package queues;

public interface IQueues<E> {
	//void clear();
	
	//void add(IQueues<?extends E> q);
	
	//E frontValue();
	/**
     * Adds the given item to the rear of the queue.
     */
    void enqueue(Object item);

    /**
     * Removes the front item from the queue and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    Object dequeue();

    /**
     * Returns the front item from the queue without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    Object peek();

    /**
     * Returns the number of items currently in the queue.
     */
    int size();

    /**
     * Returns whether the queue is empty or not.
     */
    boolean isEmpty();
	
	
}
