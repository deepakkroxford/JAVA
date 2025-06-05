package Collections.QueueInterface.PriorityQueuesLearning;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        /**
         * @author Deepak Kumar Singh
         * @date 03/08/2023
         * @Question 1
         *           Count the number of elements in a Priority queue
         *           You're developing a task management system where tasks are
         *           prioritized based on their urgency. To efficiently manage these
         *           tasks, you decide to use Java's PriorityQueue, which automatically
         *           orders elements based on their natural ordering or a specified
         *           comparator. Understanding how to interact with a PriorityQueue,
         *           including counting its elements, is essential for ensuring your
         *           system operates smoothly.
         *           Create a program that manages a list of task priorities using Java
         *           Generics with PriorityQueue. Your program should:
         *           1. Read an integer n representing the number of initial tasks.
         *           2. Read n integers from the user, each representing a task's
         *           priority.
         *           3. Read another integer representing a new task's priority to add
         *           to the queue.
         *           4. Count the number of elements currently in the PriorityQueue.
         *           5. Print the count of elements in the queue.
         *           Input Format:
         *           • First Line: An integer n indicating the number of initial tasks.
         *           • Second Line: n space-separated integers representing task
         *           priorities.
         *           • Third Line: An integer representing the priority of the new task
         *           to add to the queue.
         *           Constraints:
         *           • O<n<100
         *           • Each task priority is an integer within the range of a signed
         *           32-bit integer.
         *           • Lower numbers indicate higher priority (e.g., priority 1 is
         *           higher than priority 2).
         * 
         * 
         *           Sample Input:
         *           4
         *           5134
         *           2
         *           Sample Output:
         *           Number of elements
         *           in the Priority Queue:
         *           5
         *           1) Sample Input
         *           3
         *           10 20 15
         *           5
         *           Sample Output
         *           Number of elements in the Priority Queue: 4
         * 
         */
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the number of tasks: ");
        int n = sc.nextInt();
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        System.out.println("Enter the tasks: ");
        for(int i = 0; i<n; i++){
            pq.add(sc.nextInt());
        }

        System.out.println("Enter the new Task: ");
        int newTask = sc.nextInt();
        pq.add(newTask);
        System.out.println("Size:" + pq.size());

        System.out.println(pq);
        
        sc.close();


        

    }
}
