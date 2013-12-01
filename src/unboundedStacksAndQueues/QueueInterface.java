package unboundedStacksAndQueues;

public interface QueueInterface<T> {

	public static final int DEFAULT_MAXIMUM = 25;
	
	public void add(T item) throws boundedStacksAndQueues.QueueOverflowException;
	public T remove();
	public T head();
	public int getLength();
	public boolean isEmpty();
	public String toString();
	public boolean equals(Object other);
}
