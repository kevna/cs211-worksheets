package unboundedStacksAndQueues;

public interface StackInterface {

	public static final int DEFAULT_MAXIMUM = 25;
	
	public void push(Object item) throws boundedStacksAndQueues.StackOverflowException;
	public Object pop() throws boundedStacksAndQueues.StackUnderflowException;
	public Object peek();
	public void duplicate() throws boundedStacksAndQueues.StackOverflowException;
	public void exchange() throws boundedStacksAndQueues.StackUnderflowException;
	public boolean isEmpty();
	public int depth();
	public int sizeof();
	public String toString();
	public boolean equals(Object other);
	
}
