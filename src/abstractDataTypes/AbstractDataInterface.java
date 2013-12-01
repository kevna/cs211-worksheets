package abstractDataTypes;

public interface AbstractDataInterface<T> {

	public void add(T item);
	public T remove(int n);
	public int getLength();
	public boolean isEmpty();
	
}
