package linkedLists;

public class DoubleLinkedList<T> extends AbstractList<T> {
	
	private DoubleLinkNode<T> head, tail;
	//private int length;
	
	public DoubleLinkedList() {
		super();
		head = null;
		tail = null;
	}
	
	public void add(int n, T item) {
		DoubleLinkNode<T> newItem = new DoubleLinkNode<>(item);
		if (length == 0) {
			head = newItem;
			tail = newItem;
		} else if (n == 0) {
			head.setPrevious(newItem);
			newItem.setNext(head);
			head = newItem;
		} else if (n < length) {
			DoubleLinkNode<T> current;
			if (n < (length/2)) {
				current = head;
				for (int i = 0; i < ((n/2)-1); i++) {
					current = current.getNext();
				}
			} else {
				current = tail;
				for (int i = length; i >= ((n/2)-1); i--) {
					current = current.getPrevious();
				}
			}
			DoubleLinkNode<T> nextItem = current.getNext();
			newItem.setNext(nextItem);
			newItem.setPrevious(current);
			nextItem.setPrevious(newItem);
			current.setNext(newItem);
		} else {
			tail.setNext(newItem);
			newItem.setPrevious(tail);
			tail = newItem;
		}
		length++;
	}
	
	public T get(int n) {
		DoubleLinkNode<T> current;
		if (length == 1) {
			return head.getContent();
		} else if (n < (length-1 / 2)) {
			current = head;
			for (int i = 0; i < n; i++) {
				current = current.getNext();
			}
		} else if (n < (length-1)) {
			current = tail;
			for (int i = length; i > n; i--) {
				current = current.getPrevious();
			}
		} else if (n == (length-1)) {
			current = tail;
		} else {
			return null;
		}
		return current.getContent();
	}
	
	public T remove(int n) {
		DoubleLinkNode<T> removed = null;
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
			DoubleLinkNode<T> current;
			if (length < (length / 2)) {
			current = head;
			for (int i = 0; i < (n - 1); i++) {
				current = current.getNext();
			}
			} else {
				current = tail;
				for(int i = length; i > n; i--) {
					current = current.getPrevious();
				}
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
