package linkedLists;

import java.util.Iterator;

/**
 * An implementation of Iterator used to iterate through any linked-list implementing {@link ListInterface}.
 * 
 * <p>
 * Iterator is used in the process of moving through objects (typically lists) that implement Iterable.
 * The main use or this is in 'for each' loops (for( item : list){}).
 * </p>
 * 
 * @author kevna (Aaron Moore)
 *
 * @param <T>	The type of object stored in the list through which we are iterating;
 */
public class ListIterator<T> implements Iterator<T> {

	/**
	 * A pointer to the list through which this Iterator is iterating.
	 */
	private ListInterface<T> list;
	/**
	 * The integer value of the current position within the list.
	 */
	private int position;
	
	/**
	 * The constructor assigns the pointer to the given list
	 * and sets the position to the start of the list. 
	 * @param list		The list through which to iterate. 
	 */
	ListIterator(ListInterface<T> list) {
		this.list = list;
		position = 0;
	}
	
	/**
	 * Returns true if '{@link #position}' is less than the length of the list, otherwise returns false.
	 * @return Whether there are any more items in the list. 
	 */
	@Override
	public boolean hasNext() {
		return (position < list.getLength());
	}

	/**
	 * Returns the next item in the list.
	 * Increments the '{@link #position}' variable.
	 * @return The next list Item.
	 */
	@Override
	public T next() {
		return list.get(position++);
	}

	/**
	 * Removes the current item in the list.
	 */
	@Override
	public void remove() {
		list.remove(position-1);
	}

}
