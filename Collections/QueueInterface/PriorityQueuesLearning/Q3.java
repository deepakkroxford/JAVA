package Collections.QueueInterface.PriorityQueuesLearning;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /**
         * @author Deepak Kumar Singh
         * @date 17/09/2023
         * 
         * 
         * In developing a customer support ticketing system, efficiently managing and
         * accessing the most urgent support tickets is crucial. Java's PriorityQueue
         * offers an optimal solution by automatically ordering tickets based on their
         * priority levels. Being able to retrieve the highest priority ticket swiftly
         * ensures that critical issues are addressed promptly, enhancing customer
         * satisfaction and system reliability. This guide demonstrates how to retrieve
         * the first (highest priority) element from a PriorityQueue in Java.
         * 
         * Task:
         * Create a Java program that manages a list of support ticket priorities using
         * Java Generics with PriorityQueue. Your program should:
         * 1. Read an integer n representing the number of initial support tickets.
         * 2. Read n integers from the user, each representing a ticket's priority.
         * 3. Read another integer representing a new ticket's priority to add to the
         * queue.
         * 4. Retrieve the first element (highest priority ticket) from the
         * PriorityQueue without removing it.
         * 5. Print the first element.
         * 
         * Input Format:
         * • First Line: An integer n indicating the number of initial support tickets.
         * • Second Line: n space-separated integers representing ticket priorities.
         * • Third Line: An integer representing the priority of the new ticket to add
         * to the queue.
         * Constraints:
         * • O≤n≤100
         * • Each ticket priority is an integer within the range of a signed 32-bit
         * integer.
         * • Lower numbers indicate higher priority (e.g., priority 1 is higher than
         * priority
         * 2 ).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tickets: ");
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println("Enter the priority of tickets: ");
        for(int i=0;i<n;i++) {
            pq.add(sc.nextInt());
        }

        System.out.println("Enter the priority of new ticket: ");
        int newTicket = sc.nextInt();
        pq.add(newTicket);
        System.out.println("Retriving the first element: "+pq.peek()); // it will print the highest priority ticket
        sc.close();

    }
}
