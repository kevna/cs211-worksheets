package linkedLists;

import java.util.Iterator;

abstract class AbstractList<T> implements ListInterface<T> {
	
	protected int length;
	
	public AbstractList() {
		length = 0;
	}
	
	//alternative add (adds to end of list)
	public void add(T item) {
		add(length, item);
	}
	
	public void add(ListInterface<T> list) {
		for(T item : list) {
			add(item);
		}
	}
	
	public boolean contains(T item) {
		for(T cursor : this) {
			if(cursor.equals(item)) {
				return true;
			}
		}
		return false;
	}
	
	public int getLength() {
		return length;
	}
	
	public boolean isEmpty() {
		return (length == 0);
	}
	
	public Iterator<T> iterator() {
		return new ListIterator<T>(this);
	}

}
