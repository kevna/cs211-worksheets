package linkedLists;

public interface ListInterface<T> {

	public void add(int n, T item);
	public void add(T item);
	public T get(int n);
	public T remove(int n);
	public int getLength();
	public boolean isEmpty();
	
}
