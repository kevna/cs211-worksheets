package unboundedStacksAndQueues;

public class UnboundedQueue<T> implements QueueInterface<T> {
	
	private linkedLists.ListInterface<T> theQueue;

	//default constructor
	public UnboundedQueue() {
		theQueue= new linkedLists.DoubleLinkedList<>();
	}

	//add an object to the end of the queue
	public void add(T item) {
			theQueue.add(item);
	}

	//take the item from the front of the queue
	public T remove() {
		return theQueue.remove(0);
	}

	public T head() {
		return theQueue.get(0);
	}
	
	public boolean isEmpty() {
		return (theQueue.getLength() == 0);
	}

	//get queue length
	public int getLength() {
		return theQueue.getLength();
	}

	//requested form of queue length
	public int sizeof() {
		return getLength();
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("FRONT\n");
		for (int i = 0; i < theQueue.getLength(); i++) {
			result.append(theQueue.get(i).toString() + "\n");
		}
		return result.toString();
	}
	
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
