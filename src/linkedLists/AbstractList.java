package linkedLists;

import java.util.Iterator;

/**
 * An abstract class for those methods declared by {@link ListInterface} and implemented identically in {@link LinkedList} and {@link DoubleLinkedList}.
 * 
 * @author kevna (Aaron Moore)
 *
 * @param <T>		Type of object to be stored in the list.
 */
abstract class AbstractList<T> implements ListInterface<T> {
	
	/**
	 * The current number of items in the list.
	 * <p>
	 * Storing the current number of items in the list removes the need to iterate
	 * through the entire list in order to evaluate it's length.
	 * This reduces processing time (potentially quite significantly)
	 * at the cost of an extra integer's worth of memory.
	 * </p>
	 */
	protected int length;
	
	/**
	 * The constructor assigns the default length of the list
	 * (no items at construction of the superclass).
	 */
	public AbstractList() {
		length = 0;
	}
	
	/**
	 * {@inheritDoc}
	 * <p>
	 * In those classes that extend this abstract class the item will be added at position 'length'. 
	 * That is to say, they will be added to the end of the list.
	 * This method uses the extending class's {@link ListInterface#add(int, Object)} method as recommended.
	 * </p>
	 */
	public void add(T item) {
		add(length, item);
	}
	
	/**
	 * {@inheritDoc}
	 * <p>
	 * In this Implementation a 'for each' loop is used to add the contents of 'list' to this list.
	 * As recommended this method adds elements to the end of the list using {@link #add(Object)}.
	 * </p>
	 */
	public void add(ListInterface<T> list) {
		for(T item : list) {
			add(item);
		}
	}
	
	/**
	 * Iterator to see if an item exists in the list
	 * @param item		The item to look for.
	 * @return Whether the given item exists.
	 */
	public boolean contains(T item) {
		for(T cursor : this) {
			if(cursor.equals(item)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * {@inheritDoc}
	 * <p>
	 * This implementation uses the '{@link #length}' variable to avoid
	 * having to iterate through the entire list to count the length.
	 * </p>
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * {@inheritDoc}
	 * <p>
	 * In this implementation the method literally returns whether the length is 0
	 * using the '{@link #length}' variable; 
	 * </p>
	 */
	public boolean isEmpty() {
		return (length == 0);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Iterator<T> iterator() {
		return new ListIterator<T>(this);
	}

}
