package linkedLists;

import java.util.Iterator;

/**
 * This interface declares the methods for a linked list class. 
 * 
 * @author kevna (Aaron Moore)
 *
 * @param <T>		Type of object to be stored in the list.
 */
public interface ListInterface<T> extends Iterable<T>, abstractDataTypes.AbstractDataInterface<T> {

	/**
	 * Inserts an item at the specified position in the list.
	 * @param n		Position at which to insert the given item.
	 * @param item	The item to insert at the given position.
	 */
	public void add(int n, T item);
	
	/**
	 * Adds an item to the list, not specifying the position.
	 * This method should add an item to the start or end of the list (at the implementor's discretion).
	 * Ideally this method will call {@link #add(int, Object)} with a value given for the position.
	 * @param item	The item to add to the array.
	 */
	public void add(T item);
	
	/**
	 * Adds the contents of another list to this list, not specifying the position.
	 * Ideally this will make recursive calls of {@link #add(Object)} by iterating through the contents of 'list'.
	 * @param list	List of items to add to this list.
	 */
	public void add(ListInterface<T> list);
	
	/**
	 * Accesses the item at the given position in the list.
	 * @param n		Specifies the position of the item to access.
	 * @return The item at the specified position in the list.
	 */
	public T get(int n);
	
	/**
	 * Removes the item at the given position in the list, returns it so that the user can avoid having to preempt this method call with one to {@link #get(int)}.
	 * @param n		Specifies the position of the item to remove.
	 * @return The item removed from the specified position in the list.
	 */
	public T remove(int n);
	
	/**
	 * Returns the number of items currently in the list.
	 * @return Number of Items in the list.
	 */
	public int getLength();
	
	/**
	 * Returns true if the list is currently empty, false if any items exist in the list.
	 * @return Whether the list is currently empty.
	 */
	public boolean isEmpty();
	
	/**
	 * {@inheritDoc}
	 */
	public Iterator<T> iterator();
	
}
