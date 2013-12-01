package abstractDataTypes;

import boundedStacksAndQueues.StackUnderflowException;

public class ADTStack<T> extends unboundedStacksAndQueues.UnboundedStack<T> implements AbstractDataInterface<T> {

	@Override
	public void add(T item) {
		this.push(item);
	}

	@Override
	public T get(int n) {
		return this.peek();
	}

	@Override
	public T remove(int n){
		try {
			return this.pop();
		} catch (StackUnderflowException e) {
			return null;
		}
	}

	@Override
	public int getLength() {
		return this.depth();
	}

}