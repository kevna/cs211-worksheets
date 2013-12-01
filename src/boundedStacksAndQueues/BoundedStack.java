package boundedStacksAndQueues;

public class BoundedStack implements stacksAndQueues.StackInterface<Object> {
	
	public static final int DEFAULT_MAXIMUM = 25;
	
	private Object[] theStack;
	private int position;
	//private static final int DEFAULT_MAXIMUM = 25;

	public BoundedStack() {
		this(DEFAULT_MAXIMUM);
	}

	//custom size constructor
	public BoundedStack(int size) {
		theStack= new Object[size];
		position = -1;
	}

	//add an item to the top of the stack
	public void push(Object item) throws StackOverflowException {
		if ((position+1) < theStack.length) {
			theStack[++position] = item;
		} else throw new StackOverflowException();
	}

	//take the top item off of the stack
	public Object pop() throws StackUnderflowException {
		if (!isEmpty()) {
			return theStack[position--];
		} else throw new StackUnderflowException();
	}

	//access the top of the stack without popping it off
	public Object peek() {
		if (!isEmpty()) {
			return theStack[position];
		}
		return null;
	}
	
	public void duplicate() throws StackOverflowException {
		push(peek());
	}
	
	public void exchange() throws StackUnderflowException {
		try {
			Object itemOne = pop();
			Object itemTwo = pop();
			push(itemOne);
			push(itemTwo);
		} catch(StackOverflowException impossible) {
			//this method swaps two items ergo two items must exist
			//ergo there can be no overflow & this code is unreachable
			System.out.println("Fish Biscuits");
		}
	}

	//test if the stack is empty
	public boolean isEmpty () {
		return (position == -1);
	}

	//get the number of items in the stack
	public int depth() {
		return (position+1);
	}

	//get the total size of the stack
	public int sizeof() {
		return theStack.length;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("TOP\n");
		for (int i = 0; i < position; i++) {
			result.append(theStack[i].toString() + "\n");
		}
		return result.toString();
	}
	
	@Override
	public boolean equals(Object other) {
		BoundedStack otherStack = (BoundedStack)other;
		if (this.depth() == otherStack.depth()) {
			for (int i = 0; i < position; i++) {
				try {
					if (!theStack[i].equals(otherStack.pop())) {
						return false;
					}
				} catch(StackUnderflowException e) {
					//unreachable code as the stacks must have the same length for this method call
				}
			}
			return true;
		}
		return false;
	}

}
