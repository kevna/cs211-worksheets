package linkedLists;

public interface ListInterface<T> extends Iterable<T> {

	public void add(int n, T item);
	public void add(T item);
	public void add(ListInterface<T> list);
	public T get(int n);
	public T remove(int n);
	public int getLength();
	public boolean isEmpty();
	
}
