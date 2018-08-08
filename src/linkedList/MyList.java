package linkedList;


public interface MyList {

	/**
	 * Add the specified string to the beginning of the list.
	 * @param data string to add
	 */
	void addAtBeginning(String data);

	/**
	 * Remove the first item from the list.
	 */
	void removeFromBeginning();

	/**
	 * Add the specified string to the end of the list.
	 * @param data string to add
	 */
	void addAtEnd(String data);

	/**
	 * Remove the last item from the list.
	 */
	void removeFromEnd();
	
	/**
	 * Remove the item from the list at index.
	 */
	void removeAt(int index);
	
	/**
	 * Insert item to the list at index.
	 */
	void insertAt(int index, String o);

	/**
	 * Get the item from the list at the specified index. Do not modify the list.
	 * @param index zero-based index at which to find the item.
	 * @return the item
	 */
	String get(int index);

	/**
	 * How many items are in the list?
	 * @return how many items are in the list
	 */
	int size();

	void removeNodeAt(int index);

	void insertNodeAt(int index, String data);

}