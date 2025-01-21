
class Counter {
    int counter;

    public void increment() {
        counter++;
    }
}

public class ThreadSaftey {

    public static void main(String[] args) {

        Counter c = new Counter();

        for (int i = 0; i <= 1000; i++)

        {
            c.increment();
        }
        System.out.println(c.counter);
    }
}
