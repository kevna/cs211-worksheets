package linkedLists;

public class LinkedList<T> extends AbstractList<T> {
	
	private Node<T> head, tail;
	//private int length;
	
	public LinkedList() {
		super();
		head = null;
		tail = null;
	}
	
	public void add(int n, T item) {
		Node<T> newItem = new Node<T>(item);
		if (length == 0) {
			head = newItem;
			tail = newItem;
		} else if (n == 0) {
			newItem.setNext(head);
			head = newItem;
		} else if (n < length) {
			Node<T> current = head;
			for (int i = 0; i < (n - 1); i++) {
				current = current.getNext();
			}
			newItem.setNext(current.getNext());
			current.setNext(newItem);
		} else {
			tail.setNext(newItem);
			tail = newItem;
		}
		length++;
	}
	
	public T get(int n) {
		Node<T> current;
		if (n < (length-1)) {
			current = head;
			for (int i = 0; i < n; i++) {
				current = current.getNext();
			}
		} else if (n == (length-1)) {
			current = tail;
		} else {
			return null;
		}
		return current.getContent();
	}
	
	public T remove(int n) {
		Node<T> removed = null;
		if ((length == 0) || (n > length)) {
			return null;
		} else if (length == 1) {
			removed = head;
			head = null;
			tail = null;
		} else if (n == 0) {
			removed = head;
			head = head.getNext();
		} else {
			Node<T> current = head;
			for (int i = 0; i < (n - 1); i++) {
				current = current.getNext();
			}
			removed = current.getNext();
			current.setNext(removed.getNext());
			if (removed == tail) {
				tail = current;
			}
		}
		length--;
		return removed.getContent();
	}

}
