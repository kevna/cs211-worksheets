package stacksAndQueues;

/**
 * Interface declaring methods for a stack class
 * 
 * @author kevna (Aaron Moore)
 *
 * @param <T>		The type of item to be stored in the stack
 */
public interface StackInterface<T> {
	
	/**
	 * Adds an Item to the top of the stack.
	 * @param item		Item to add to the top of the stack
	 * @throws boundedStacksAndQueues.StackOverflowException		Overflow, too many items (bounded Stack)
	 */
	public void push(T item) throws boundedStacksAndQueues.StackOverflowException;
	
	/**
	 * Takes the item from the top of the stack.
	 * @return The item that was on top of the stack.
	 * @throws boundedStacksAndQueues.StackUnderflowException		Underflow, no items in stack.
	 */
	public T pop() throws boundedStacksAndQueues.StackUnderflowException;
	/**
	 * Accesses the item on the top of the stack.
	 * @return The item currently on the top of the stack.
	 */
	public T peek();
	
	/**
	 * Duplicate the item on the top of the stack.
	 * {@link #peek()} to look at the top item and {@link #push(Object)} a copy of it on top.
	 * @throws boundedStacksAndQueues.StackOverflowException		Overflow, too many items (bounded Stack)
	 */
	public void duplicate() throws boundedStacksAndQueues.StackOverflowException;
	
	/**
	 * Swap the top two items of the stack.
	 * {@link #pop()} two items & then {@link #push(Object)} them in reverse order 
	 * @throws boundedStacksAndQueues.StackUnderflowException		Underflow, no items in stack.
	 */
	public void exchange() throws boundedStacksAndQueues.StackUnderflowException;
	
	/**
	 * Whether the stack is currently empty.
	 * <p>
	 * Attempting to {@link #peek()} or {@link #pop()} while this is true will result in a stack underflow error.
	 * </p>
	 * @return true if stack is empty, else false.
	 */
	public boolean isEmpty();
	
	/**
	 * Get the depth of the stack.
	 * @return The number of items currently in the stack.
	 */
	public int depth();
	
	/**
	 * Another implementation of {@link #depth()}.
	 * <p>
	 * Whilst depth is a logical (and more common) name for the method
	 * this is the name required for this implementation.
	 * </p>
	 * @return The number of items currently in the stack.
	 */
	public int sizeof();
	
	/**
	 * Output the entire stack as a string.
	 * <p>
	 * An added feature required by the project for which this was written.
	 * </p>
	 * @return The entire stack as a string.
	 */
	public String toString();
	
	/**
	 * Test for equality with another stack.
	 * @param other		the stack to compare against.
	 * @return Whether the other stack is the same as this one. 
	 */
	public boolean equals(Object other);
	
}
