//Lauren Shindo

	/**
	 * Write a method to remove an object at a specified index in the LinkedList.
	 * Return flase if the index os out of range.
	 */

package linkedList;

public class LinkedListApp {

	public static void main(String[] args) {

				MyList list = new MyLinkedList();
				test(list);
//				MyArrayList list = new MyArrayList();
//				test(list);
			}
			
			private static void test(MyList list) {
				list.addAtBeginning("D");
				list.addAtBeginning("C");
				list.addAtBeginning("B");
				list.addAtBeginning("A");
				list.addAtEnd("E");
				list.addAtEnd("F");
//				list.removeFromBeginning();
//				list.removeFromEnd();
				
				System.out.println(list);
				System.out.println(list.size());
				System.out.println(list.get(0));
				System.out.println(list.get(1));
				
//				list.NodeAt(3);
				list.insertNodeAt(2, "omg");
				
				System.out.println(list);
				System.out.println(list.size());
				System.out.println(list.get(0));
				System.out.println(list.get(1));
			}

		
		
}

