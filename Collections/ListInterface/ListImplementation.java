package Collections.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(8192);
        arr.add(null);
        arr.add(null);

        /*
         * Insertion order is maintained
         * not synchronized
         * not thread safe
         * duplicates are allowed
         * null are allowed
         * Time Complexity:
         * - add(E e): O(1) amortized (sometimes O(n) when resizing the internal array)
         * - get(int index): O(1) (constant time access)
         * - remove(Object o): O(n) (due to shifting elements)
         * - size(): O(1)
         * - contains(Object o): O(n) (because it needs to iterate over the list)
         * - clear(): O(n) (since it may need to null out elements)
         */
        System.out.println(arr.size()); // 6
        System.out.println(arr);

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(22);
        ll.add(32);
        ll.add(42);
        ll.add(234);
        ll.addFirst(32);
        ll.addLast(453);
        ll.getFirst();
        ll.getLast();
        ll.add(null);
        ll.add(null);

        /*
         * Insertion order is maintained
         * null values are allowed
         * Duplicates are allowed
         * LinkedList is not synchronized.
         * It is not thread-safe by default.
         * 
         * Time Complexity:
         * - add(E e): O(1) (for adding at the end, O(n) for adding at a specific index)
         * - add(int index, E element): O(n) (because it requires traversing the list)
         * - remove(Object o): O(n) (searching for the object takes O(n), then removing
         * it is O(1))
         * - remove(int index): O(n) (finding the element takes O(n), removing it takes
         * O(1))
         * - get(int index): O(n) (needs to traverse to the index)
         * - set(int index, E element): O(n) (needs to traverse to the index)
         * - size(): O(1) (size is stored and retrieved in constant time)
         * - contains(Object o): O(n) (searches the list for the object)
         * - clear(): O(n) (removes all elements, requiring traversal of the list)
         */
        System.out.println(ll);

        Vector<Integer> v = new Vector<>();
        v.add(15);
        v.add(25);
        v.add(35);
        v.add(45);
        v.add(null);

        /*
         * Insertion order is maintained
         * Duplicates are allowed
         * Synchronized (Thread-safe by default)
         * Null values are allowed
         * 
         * Time Complexity:
         * - add(E e): O(1) (for adding at the end, O(n) for adding at a specific index)
         * - add(int index, E element): O(n) (because it requires traversing the list)
         * - remove(Object o): O(n) (searching for the object takes O(n), then removing
         * it is O(1))
         * - remove(int index): O(n) (finding the element takes O(n), removing it takes
         * O(1))
         * - get(int index): O(1) (retrieving by index is faster than LinkedList)
         * - set(int index, E element): O(n) (needs to traverse to the index)
         * - size(): O(1) (size is stored and retrieved in constant time)
         * - contains(Object o): O(n) (searches the list for the object)
         * - clear(): O(n) (removes all elements, requiring traversal of the list)
         */
        System.out.println(v);

        Stack<Integer> st = new Stack<>();
        st.add(33);
        st.add(45);
        st.add(23);
        st.add(55);
        st.add(null);

        /*
         * Insertion order is maintained
         * Duplicates are allowed
         * Follows the LIFO (Last In First Out) principle
         * 
         * Time Complexity:
         * - push(E e): O(1) (Adding an element to the stack)
         * - pop(): O(1) (Removing the top element from the stack)
         * - peek(): O(1) (Retrieving the top element without removing it)
         * - search(Object o): O(n) (Searching for the element in the stack)
         * - size(): O(1) (Getting the size of the stack)
         */

        System.out.println(st);


        /*
 * --------------------------------------------------------------------------------------------------------------------------------|
 * | Feature            | ArrayList       | LinkedList     | Vector         |
 * --------------------------------------------------------------------------------------------------------------------------------|
 * | Implementation     | Dynamic array   | Doubly linked  | Dynamic array (synchronized) |
 * |                    |                 | list           |                 |
 * --------------------------------------------------------------------------------------------------------------------------------|
 * | Insertion Order    | Maintained      | Maintained     | Maintained     |
 * --------------------------------------------------------------------------------------------------------------------------------
 * | Thread Safety      | Not synchronized | Not synchronized | Synchronized (Thread-safe) |
 * --------------------------------------------------------------------------------------------------------------------------------
 * | Duplicates         | Allowed         | Allowed        | Allowed        |
 * --------------------------------------------------------------------------------------------------------------------------------
 * | Null Values        | Allowed         | Allowed        | Allowed        |
 * --------------------------------------------------------------------------------------------------------------------------------
 * | Access by Index    | O(1)            | O(n)           | O(1)           |
 * --------------------------------------------------------------------------------------------------------------------------------
 * | Insert at End      | O(1) (amortized)| O(1)           | O(1)           |
 * --------------------------------------------------------------------------------------------------------------------------------
 * | Insert at Index    | O(n)            | O(n)           | O(n)           |
 * --------------------------------------------------------------------------------------------------------------------------------
 * | Remove             | O(n) (elements shift) | O(n) (elements shift) | O(n) (elements shift) |
 * --------------------------------------------------------------------------------------------------------------------------------
 * | Size               | O(1)            | O(1)           | O(1)           |
 * --------------------------------------------------------------------------------------------------------------------------------
 * | Use Case           | Fast random access | Frequent insertions/removals at the ends | Thread safety required |
 * --------------------------------------------------------------------------------------------------------------------------------
 */





 
    }
}
