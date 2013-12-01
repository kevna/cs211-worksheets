package stacksAndQueues;

/**
 * Interface declaring methods for a queue class
 * 
 * @author kevna (Aaron Moore)
 *
 * @param <T>		The type of item to be stored in the queue
 */
public interface QueueInterface<T> {
	
	/**
	 * Adds an Item to the back of the Queue.
	 * @param item		Item to add to the back of the queue.
	 * @throws stacksAndQueues.exceptions.QueueOverflowException		Overflow, too many items (bounded queue)
	 */
	public void add(T item) throws stacksAndQueues.exceptions.QueueOverflowException;
	
	/**
	 * Takes the item from the front of the queue.
	 * @return The item that was on front of the queue.
	 */
	public T remove();
	
	/**
	 * Accesses the item on the front of the queue
	 * @return The item currently on the front of the queue.
	 */
	public T head();
	
	/**
	 * Get the length of the queue.
	 * @return The number of items currently in the queue.
	 */
	public int getLength();
	
	/**
	 * Another implementation of {@link #getLength()}.
	 * <p>
	 * Whilst getLength is a logical (and more common) name for the method
	 * this is the name required for this implementation.
	 * </p>
	 * @return The number of items currently in the stack.
	 */
	public int sizeof();
	
	/**
	 * Whether the queue is currently empty.
	 * @return true if queue is empty, else false.
	 */
	public boolean isEmpty();
	
	/**
	 * Output the entire queue as a string.
	 * <p>
	 * An added feature required by the project for which this was written.
	 * </p>
	 * @return The entire queue as a string.
	 */
	public String toString();
	
	/**
	 * Test for equality with another queue.
	 * @param other		the queue to compare against.
	 * @return Whether the other queue is the same as this one. 
	 */
	public boolean equals(Object other);
}
