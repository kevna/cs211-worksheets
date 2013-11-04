package linkedLists;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<T> {

	private ListInterface<T> list;
	private int position;
	
	
	ListIterator(ListInterface<T> list) {
		this.list = list;
		position = 0;
	}
	
	@Override
	public boolean hasNext() {
		return (position < list.getLength());
	}

	@Override
	public T next() {
		return list.get(position++);
	}

	@Override
	public void remove() {
		list.remove(position-1);
	}

}
