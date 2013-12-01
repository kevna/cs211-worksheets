package unboundedStacksAndQueues;

public interface StackInterface<T> {

	public static final int DEFAULT_MAXIMUM = 25;
	
	public void push(T item) throws boundedStacksAndQueues.StackOverflowException;
	public T pop() throws boundedStacksAndQueues.StackUnderflowException;
	public T peek();
	public void duplicate() throws boundedStacksAndQueues.StackOverflowException;
	public void exchange() throws boundedStacksAndQueues.StackUnderflowException;
	public boolean isEmpty();
	public int depth();
	public int sizeof();
	public String toString();
	public boolean equals(Object other);
	
}
