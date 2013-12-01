package abstractDataTypes;

public class ADTQueue<T> extends stacksAndQueues.UnboundedQueue<T> implements AbstractDataInterface<T> {

	@Override
	public T get(int n) {
		return this.head();
	}

	@Override
	public T remove(int n) {
		return this.remove();
	}

}
