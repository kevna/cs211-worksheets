package unboundedStacksAndQueues;

public class UnboundedQueue implements QueueInterface {
	
	private linkedLists.ListInterface<Object> theQueue;

	//default constructor
	public UnboundedQueue() {
		//call size constructor with defaut size
		theQueue= new linkedLists.LinkedList<>();
	}

	//add an object to the end of the queue
	public void add(Object item) {
			theQueue.add(item);
	}

	//take the item from the front of the queue
	public Object remove() {
		return theQueue.remove(0);
	}

	public Object head() {
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
		UnboundedQueue otherQueue = (UnboundedQueue)other;
		if (this.getLength() == otherQueue.getLength()) {
			for (int i = 0; i < theQueue.getLength(); i++) {
				if (!theQueue.get(i).equals(otherQueue.remove())) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
