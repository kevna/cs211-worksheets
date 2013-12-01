package linkedLists;

/**
 * A single-linked list implementation of {@link ListInterface} using {@link AbstractList}.
 * 
 * @author kevna (Aaron Moore)
 *
 * @param <T>		Type of object to be stored in the list.
 */
public class LinkedList<T> extends AbstractList<T> {
	
	/**
	 * Pointer to the first Element in the list.
	 */
	private Node<T> head;
	/**
	 * Pointer to the last Element in the list.
	 */
	private Node<T> tail;
	
	/**
	 * Constructor creating a blank list (no elements).
	 */
	public LinkedList() {
		super();
		head = null;
		tail = null;
	}
	
	/**
	 * {@inheritDoc}
	 * <p>
	 * Due to being a single-linked list, this method must iterate through most of
	 * list in order to add items close to the end of the list.
	 * This may present an issue in programs storing large numbers of items
	 * or those which involve many, fast-processed iterations.
	 * </p>
	 */
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
	
	/**
	 * {@inheritDoc}
	 * Due to being a single-linked list, this method must iterate through most of
	 * list in order to retrieve items close to the end of the list.
	 * This may present an issue in programs storing large numbers of items
	 * or those which involve many, fast-processed iterations.
	 * </p>
	 */
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
	
	/**
	 * {@inheritDoc}
	 * Due to being a single-linked list, this method must iterate through most of
	 * list in order to remove items close to the end of the list.
	 * This may present an issue in programs storing large numbers of items
	 * or those which involve many, fast-processed iterations.
	 * </p>
	 */
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
