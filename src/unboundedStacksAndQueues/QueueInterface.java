package unboundedStacksAndQueues;

public interface QueueInterface {

	public static final int DEFAULT_MAXIMUM = 25;
	
	public void add(Object item) throws boundedStacksAndQueues.QueueOverflowException;
	public Object remove();
	public Object head();
	public int getLength();
	public boolean isEmpty();
	public String toString();
	public boolean equals(Object other);
}
