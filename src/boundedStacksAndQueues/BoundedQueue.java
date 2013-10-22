package boundedStacksAndQueues;

public class BoundedQueue implements unboundedStacksAndQueues.QueueInterface {
	
	private Object[] theQueue;
	private int backEnd;
	//private static final int DEFAULT_MAXIMUM = 25;

	//default constructor
	public BoundedQueue() {
		//call size constructor with defaut size
		this(DEFAULT_MAXIMUM);
	}

	//size controlled constructor
	public BoundedQueue(int size) {
		theQueue= new Object[size];
		backEnd = -1;
	}

	//add an object to the end of the queue
	public void add(Object item) throws QueueOverflowException {
		//if you aren't at the end of the queue
		if ((backEnd + 1) < theQueue.length) {
			//add the item at the next array backEnd
			theQueue[++backEnd] = item;
		//else throw an Exception as requested
		} else throw new QueueOverflowException();
	}

	//take the item from the front of the queue
	public Object remove() {
		Object item = theQueue[0];
		//move all the queue items forward
		for (int i = 0; i < backEnd; i++) {
			theQueue[i] = theQueue[i + 1];
		}
		backEnd--;
		return item;
	}

	public Object head() {
		return theQueue[0];
	}
	
	public boolean isEmpty() {
		return (backEnd == -1);
	}

	//get queue length
	public int getLength() {
		return theQueue.length;
	}

	//requested form of queue length
	public int sizeof() {
		return getLength();
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("FRONT\n");
		for (int i = 0; i < backEnd; i++) {
			result.append(theQueue[i].toString() + "\n");
		}
		return result.toString();
	}
	
	@Override
	public boolean equals(Object other) {
		BoundedQueue otherQueue = (BoundedQueue)other;
		if (this.getLength() == otherQueue.getLength()) {
			for (int i = 0; i < backEnd; i++) {
				if (!theQueue[i].equals(otherQueue.remove())) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

}
