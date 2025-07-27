package PracticeQuestion.java;

@FunctionalInterface
interface Square {
    int FindSquare(int x);
}


public class Q2 {
    public static void main(String[] args) {
        Square s = (x) -> x*x;
        System.out.println(s.FindSquare(5));

        Runnable r =() ->{
            for (int i = 0; i < 10; i++) {
                System.out.println("The runnable thread is running1");
            }
        };
        // Method 1: Run directly on main thread
        r.run();  // Not concurrent

        // Method 2: Run in a separate thread
        Thread t = new Thread(r);
        t.start();  // Concurrent execution;
    }
}
