package linkedLists;

/**
 * A single-linked list node for the use of {@link LinkedList}.
 * 
 * @author kevna (Aaron Moore)
 *
 * @param <T>		The type of Item being stored in the list.
 */
class Node<T> {
	
	/**
	 * The object stored in this node of the list.
	 */
	private final T content;
	/**
	 * A pointer to the next node in the list.
	 */
	private Node<T> next;
	
	/**
	 * Constructor takes the item to be stored in this node.
	 * @param item		The item being stored in this node. 
	 */
	public Node(T item) {
		content = item;
		next = null;
	}
	
	/**
	 * Returns the item stored in this node
	 * @return Item in this node.
	 */
	public T getContent() {
		return content;
	}
	
	/**
	 * Retrieve the location of the next item in the list.
	 * @return The pointer to the next item in the list
	 */
	public Node<T> getNext() {
		return next;
	}
	
	/**
	 * Allocate the location of the next item in the list.
	 * @param n		The new pointer to the next item in the list.
	 */
	public void setNext(Node<T> n) {
		next = n;
	}

}
