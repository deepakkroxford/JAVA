package Collections.QueueInterface.PriorityQueuesLearning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /**
         * Qustion 2:
         * PriorityQueue as a Maximum Priority Queue
         * You're developing a task management system where tasks with higher importance
         * need to be addressed before those with lower importance. To efficiently
         * manage these tasks, you decide to use Java's PriorityQueue.
         * However, by default, PriorityQueue in Java operates as a min-heap,
         * prioritizing lower numbers first. To ensure that higher-priority tasks are
         * handled first, you need to convert it into a max-priority queue.
         * Task:
         * Create a program that manages a list of task priorities using Java Generics
         * with PriorityQueue as a max-priority queue. Your program should:
         * 1. Read an integer n representing the number of initial tasks.
         * 2. Read n integers from the user, each representing a task's priority.
         * 3. Read another integer representing a new task's priority to add to the
         * queue.
         * 4. Remove the highest-priority task from the queue.
         * 5. Print the updated queue of task priorities in order of priority.
         * Input Format:
         * • First Line: An integer n indicating the number of initial tasks.
         * • Second Line: n space-separated integers representing task priorities.
         * • Third Line: An integer representing the priority of the new task to add to
         * the queue.
         *
         * 
         * Constraints:
         * • 0≤n≤100
         * • Each task priority is an integer within the range of a signed 32-bit
         * integer.
         * • Higher numbers indicate higher priority (e.g., priority 5 is higher than
         * priority
         * 2).
         * Sample Input:
         * 5134
         * 2
         * Sample Output:
         * Updated Priority Queue of Task Priorities:
         * 4321
         * 
         * Sample Input
         * 3
         * 10 20 15
         * 5
         * Sample Output
         * Updated Priority Queue of Task Priorities:
         * 15 10 5
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // it will create the max priority
                                                                                     // queue

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            pq.add(x);
        }

        System.out.println("Enter the value of new task");
        int newTask = sc.nextInt();
        pq.add(newTask);

        pq.poll(); // it will remove the highest task

        System.out.println("Updated Priority Queue of Task Priorities:");
        List<Integer> list = new ArrayList<>();
        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }

        for (int x : list) {
            System.out.print(x + " ");
        }
        sc.close();

        /**
         * ✅ Yes, you are absolutely correct.
         * 
         * Let’s break it down clearly:
         * 
         * 🔸 By default in Java's PriorityQueue:
         * It behaves like a min-heap, which means:
         * 
         * Lower values have higher priority
         * 
         * poll() returns the smallest element first
         * 
         * 👉 Example:
         * 
         * java
         * Copy
         * Edit
         * PriorityQueue<Integer> pq = new PriorityQueue<>();
         * pq.add(5);
         * pq.add(1);
         * pq.add(10);
         * System.out.println(pq.poll()); // Output: 1
         * 🔸 What is a Max-Heap?
         * A max-heap means:
         * 
         * Higher values have higher priority
         * 
         * poll() returns the largest element first
         * 
         * To implement this in Java using PriorityQueue, we write:
         * 
         * PriorityQueue<Integer> maxHeap = new
         * PriorityQueue<>(Collections.reverseOrder());
         * 👉 Example:
         * 
         * java
         * Copy
         * Edit
         * maxHeap.add(5);
         * maxHeap.add(1);
         * maxHeap.add(10);
         * System.out.println(maxHeap.poll()); // Output: 10
         * ✅ So Yes:
         * If someone says “Max-Heap,” they are saying:
         * 
         * The larger value has higher priority, and should come out first.
         * 
         * And in Java, to simulate that, we use:
         * 
         * PriorityQueue<Integer> maxHeap = new
         * PriorityQueue<>(Collections.reverseOrder());
         * Let me know if you want the same logic using a custom class or Comparator.
         * 
         * 
         * 
         */
    }
}
