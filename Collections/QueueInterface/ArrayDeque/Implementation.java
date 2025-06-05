package Collections.QueueInterface.ArrayDeque;

import java.util.ArrayDeque;

public class Implementation {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.addLast(432);  // we can insert element at the last
        queue.addFirst(696); // we can insert element at the first
        queue.removeLast(); // we can remove element from the last
        queue.removeFirst(); // we can remove element from the first
        queue.poll(); // remove the first element
        System.out.println("Queue: " + queue);


        
        
    }
}
