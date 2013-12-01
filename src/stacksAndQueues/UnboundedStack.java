package stacksAndQueues;

import boundedStacksAndQueues.StackUnderflowException;

/**
 * An unbounded implementation of {@link StackInterface}
 * 
 * @author kevna (Aaron Moore)
 *
 * @param <T>		The type of item to be stored in the queue
 */
public class UnboundedStack<T> implements StackInterface<T> {
	
	/**
	 * An instance of {@link linkedLists.ListInterface} to hold the items in the stack
	 */
	private linkedLists.ListInterface<T> theStack;

	/**
	 * Constructor initialising the linked list.
	 */
	public UnboundedStack() {
		theStack= new linkedLists.DoubleLinkedList<>();
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public void push(T item) {
			theStack.add(item);
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public T pop() throws StackUnderflowException {
		if (theStack.isEmpty()) {
			throw new StackUnderflowException();
		} else {
			return theStack.remove(theStack.getLength() - 1);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public T peek() {
		if (!theStack.isEmpty()) {
			return theStack.get(theStack.getLength() - 1);
		}
		return null;
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 */
	public void duplicate() {
		push(peek());
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 */
	public void exchange() throws StackUnderflowException {
			T itemOne = pop();
			T itemTwo = pop();
			push(itemOne);
			push(itemTwo);
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public boolean isEmpty () {
		return theStack.isEmpty();
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public int depth() {
		return theStack.getLength();
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	public int sizeof() {
		return depth();
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("TOP\n");
		for (int i = 0; i < theStack.getLength(); i++) {
			result.append(theStack.get(i).toString() + "\n");
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
			UnboundedStack<T> otherStack = (UnboundedStack<T>)other;
			if (this.depth() == otherStack.depth()) {
				for (int i = 0; i < theStack.getLength(); i++) {
					try {
					if (!theStack.get(i).equals(otherStack.pop())) {
						return false;
					}
					} catch(StackUnderflowException e) {
						//unreachable code
					}
				}
				return true;
			}
		} catch(ClassCastException e) {}
		return false;
	}

}
