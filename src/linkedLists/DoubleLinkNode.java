package linkedLists;

/**
 * A double-linked list node for the use of {@link DoubleLinkedList}.
 * 
 * @author kevna (Aaron Moore)
 *
 * @param <T>		The type of Item being stored in the list.
 */
class DoubleLinkNode<T> {

	/**
	 * The object stored in this node of the list.
	 */
	private final T content;
	/**
	 * A pointer to the previous node in the list.
	 */
	private DoubleLinkNode<T> prev;
	/**
	 * A pointer to the next node in the list.
	 */
	private DoubleLinkNode<T> next;
	
	/**
	 * Constructor takes the item to be stored in this node.
	 * @param item		The item being stored in this node. 
	 */
	public DoubleLinkNode(T item) {
		content = item;
		prev = null;
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
	public DoubleLinkNode<T> getNext() {
		return next;
	}
	
	/**
	 * Allocate the location of the next item in the list.
	 * @param n		The new pointer to the next item in the list.
	 */
	public void setNext(DoubleLinkNode<T> n) {
		next = n;
	}
	
	/**
	 * Retrieve the location of the previous item in the list.
	 * @return The pointer to the previous item in the list
	 */
	public DoubleLinkNode<T> getPrevious() {
		return prev;
	}
	
	/**
	 * Allocate the location of the previous item in the list.
	 * @param p		The new pointer to the previous item in the list.
	 */
	public void setPrevious(DoubleLinkNode<T> p) {
		prev = p;
	}

}
