package linkedLists;

public abstract class AbstractList<T> implements ListInterface<T> {
	
	protected int length;
	
	public AbstractList() {
		length = 0;
	}
	
	//alternative add (adds to end of list)
	public void add(T item) {
		add(length, item);
	}
	
	public int getLength() {
		return length;
	}
	
	public boolean isEmpty() {
		return (length == 0);
	}

}
