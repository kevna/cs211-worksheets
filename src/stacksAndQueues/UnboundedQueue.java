package stacksAndQueues;

/**
 * An unbounded implementation of {@link QueueInterface}
 * 
 * @author kevna (Aaron Moore)
 *
 * @param <T>		The type of item to be stored in the queue
 */
public class UnboundedQueue<T> implements QueueInterface<T> {
	
	/**
	 * An instance of {@link linkedLists.ListInterface} to hold the items in the queue
	 */
	private linkedLists.ListInterface<T> theQueue;

	/**
	 * Constructor initialising the linked list.
	 */
	public UnboundedQueue() {
		theQueue= new linkedLists.DoubleLinkedList<>();
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public void add(T item) {
			theQueue.add(item);
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public T remove() {
		return theQueue.remove(0);
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public T head() {
		return theQueue.get(0);
	}
	/**
	 * {@inheritDoc}
	 * 
	 */
	public boolean isEmpty() {
		return (theQueue.getLength() == 0);
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public int getLength() {
		return theQueue.getLength();
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public int sizeof() {
		return getLength();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("FRONT\n");
		for (int i = 0; i < theQueue.getLength(); i++) {
			result.append(theQueue.get(i).toString() + "\n");
		}
		return result.toString();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public boolean equals(Object other) {
		try {
		@SuppressWarnings("unchecked")
		UnboundedQueue<T> otherQueue = (UnboundedQueue<T>)other;
		if (this.getLength() == otherQueue.getLength()) {
			for (int i = 0; i < theQueue.getLength(); i++) {
				if (!theQueue.get(i).equals(otherQueue.remove())) {
					return false;
				}
			}
			return true;
		}
		} catch(ClassCastException e) {}
		return false;
	}

}
