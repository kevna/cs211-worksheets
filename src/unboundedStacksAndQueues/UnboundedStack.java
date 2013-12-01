package unboundedStacksAndQueues;

import boundedStacksAndQueues.StackUnderflowException;

public class UnboundedStack<T> implements StackInterface<T> {
	
	private linkedLists.ListInterface<T> theStack;
	//private static final int DEFAULT_MAXIMUM = 25;

	public UnboundedStack() {
		theStack= new linkedLists.DoubleLinkedList<>();
	}

	//add an item to the top of the stack
	public void push(T item) {
			theStack.add(item);
	}

	//take the top item off of the stack
	public T pop() throws StackUnderflowException {
		if (theStack.isEmpty()) {
			throw new StackUnderflowException();
		} else {
			return theStack.remove(theStack.getLength() - 1);
		}
	}

	//access the top of the stack without popping it off
	public T peek() {
		if (!theStack.isEmpty()) {
			return theStack.get(theStack.getLength() - 1);
		}
		return null;
	}
	
	public void duplicate() {
		push(peek());
	}
	
	public void exchange() throws StackUnderflowException {
			T itemOne = pop();
			T itemTwo = pop();
			push(itemOne);
			push(itemTwo);
	}

	//test if the stack is empty
	public boolean isEmpty () {
		return theStack.isEmpty();
	}

	//get the number of items in the stack
	public int depth() {
		return theStack.getLength();
	}

	//get the total size of the stack
	public int sizeof() {
		return depth();
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("TOP\n");
		for (int i = 0; i < theStack.getLength(); i++) {
			result.append(theStack.get(i).toString() + "\n");
		}
		return result.toString();
	}
	
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
