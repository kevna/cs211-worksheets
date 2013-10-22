package unboundedStacksAndQueues;

import boundedStacksAndQueues.StackUnderflowException;

public class UnboundedStack implements StackInterface{
	
	private linkedLists.ListInterface<Object> theStack;
	//private static final int DEFAULT_MAXIMUM = 25;

	public UnboundedStack() {
		this(DEFAULT_MAXIMUM);
	}

	//custom size constructor
	public UnboundedStack(int size) {
		theStack= new linkedLists.LinkedList<>();
	}

	//add an item to the top of the stack
	public void push(Object item) {
			theStack.add(item);
	}

	//take the top item off of the stack
	public Object pop() throws StackUnderflowException {
		if (theStack.isEmpty()) {
			throw new StackUnderflowException();
		} else {
			return theStack.remove(theStack.getLength() - 1);
		}
	}

	//access the top of the stack without popping it off
	public Object peek() {
		if (!theStack.isEmpty()) {
			return theStack.get(theStack.getLength() - 1);
		}
		return null;
	}
	
	public void duplicate() {
		push(peek());
	}
	
	public void exchange() throws StackUnderflowException {
			Object itemOne = pop();
			Object itemTwo = pop();
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
		UnboundedStack otherStack = (UnboundedStack)other;
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
		return false;
	}

}
