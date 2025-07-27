class Example implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread is running using Runnable");
        }
    }
}

public class IsAliveMethod {
    public static void main(String[] args) throws InterruptedException {
        Example e = new Example();
        Thread t = new Thread(e);

        System.out.println("Is thread t alive? " + t.isAlive()); // false because it hasn't started yet

        t.start();

        // Check if the thread is alive
        System.out.println("Is thread t alive? " + t.isAlive()); // true because it has started

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread is running");
        }

        // After some time, check again if the thread is alive
        Thread.sleep(100); // Let the other thread execute for a while
        System.out.println("Is thread t alive after some time? " + t.isAlive()); // false because it has finished executing
    }
}
