package abstractDataTypes;

public class ADTQueue<T> extends unboundedStacksAndQueues.UnboundedQueue<T> implements AbstractDataInterface<T> {

	@Override
	public T get(int n) {
		return this.head();
	}

	@Override
	public T remove(int n) {
		return this.remove();
	}

}
