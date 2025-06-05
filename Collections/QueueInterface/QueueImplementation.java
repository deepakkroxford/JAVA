package Collections.QueueInterface;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueImplementation {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        int y = queue.poll();
        int x = queue.peek();
        System.out.println(y + " " + x);

        /*
         * 
         * insertion order is maintained
         * internally, it is implemented using a LinkedList
         * adding elements - O(1) (adding at the end of the list)
         * removing elements - O(1) (removing from the front of the list)
         * searching elements - O(n) (linear search is required to find an element)
         * 
         * Queue operations (such as poll, peek, offer, and add) work in constant time
         * for LinkedList.
         */
        queue.offer(67);
        System.out.println(queue);

        PriorityBlockingQueue<Integer> blocking = new PriorityBlockingQueue<>();
        blocking.add(22);
        blocking.add(70);
        blocking.add(50);
        blocking.add(10);
        blocking.add(20);
        blocking.add(30);
        blocking.add(40);

        /*
         * It is thread-safe.
         * synchronized
         * we can set the bound
         * Multiple threads can safely insert and remove elements from the queue
         * concurrently.
         * It uses internal synchronization to manage concurrent access.
         * It ensures that the operations such as add(), remove(), take(), and put() are
         * thread-safe.
         * 
         * It give the output in the sorted order so it means the order is not
         * maintained
         */
        System.out.println(blocking.poll());
        System.out.println(blocking.poll());
        System.out.println(blocking.poll());
        System.out.println(blocking.poll());
        System.out.println(blocking.poll());
        System.out.println(blocking.poll());

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(22);
        pq.add(70);
        pq.add(50);
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);

        /*
         * Not thread safe
         * not synchronized
         * we can not set the limit how much element want to take
         * PriorityQueue sorts elements in ascending order by default (for Integer).
         * poll() or peek() can be used to retrieve elements in priority order.
         * Directly printing the queue shows the internal structure, which may not be in
         * sorted order
         * 
         * * PriorityQueue Time Complexity:
         * 
         * - add(E e) / offer(E e): O(log n) // Adding an element requires maintaining
         * the heap property
         * - poll() / remove(): O(log n) // Removing the root element (smallest) and
         * reheapifying
         * - peek() / element(): O(1) // Retrieving the root element without
         * modification
         * - contains(Object o): O(n) // Checking if an element exists (linear scan
         * through the heap)
         * - size(): O(1) // Retrieving the size is constant time
         * - clear(): O(n)
         */

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println(pq);

        /*
         * 3. Capacity
         * 
         * PriorityQueue:
         * Unbounded.
         * It grows as needed to accommodate the elements added to it. There’s no fixed
         * limit on the number of elements.
         * 
         * 
         * PriorityBlockingQueue:
         * Unbounded by default (but can be bounded).
         * It behaves similarly to PriorityQueue in that it is unbounded by default.
         * However, you can provide a capacity if needed. If capacity is exceeded,
         * threads trying to add elements may block.
         * 
         */


         /**
          * In the arrayDeque we can add the element from both side .form the begingn and from the end , but we can not add]
          the element from the middle.
          */
         ArrayDeque<Integer> ad = new ArrayDeque<>();
         ad.add(10);
         ad.add(20); 
         ad.add(30); // it also add the element from the end
         ad.addFirst(1212); // it add the element from the beginning
         ad.addLast(13121); // it add the element from the end
         ad.add(40); 
         System.out.println(ad);
    }
}
