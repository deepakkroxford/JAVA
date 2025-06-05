package Collections.QueueInterface.PriorityQueuesLearning;

import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        /** @Important-Points
         * Java's PriorityQueue is built using a special kind of structure called a min-heap.
         * Dont worry you dont need to understand compelex math to get it. just think of it as a smart list that 
         * always keeps the smallest element at the top.
         * 
         * -- methods
         * 1. add(): O(log n)
         * 2. poll(): O(log n)
         * 3. peek(): O(1)
         * 4. size(): O(1)
         * 5. isEmpty(): O(1)
         * 6. contains(): O(n)
         * 7. remove(): O(n)
         * 
         */

        pq.add(162);
        pq.add(102);
        pq.add(1);
        pq.add(80);
        pq.add(10);
        pq.add(100);
        pq.add(101);
        pq.add(75);

        // when we print the queue it will follow the level order traversal
        System.out.println(pq);


    }
}
