class z {
    public void good() {
        System.out.println("hiii");
    }
}

class x extends z implements Runnable { // thats a benifit of runnabale we can implement the Runnable interface and also
                                        // extend the z class
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("in runnable");
        }
    }

}

class y implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("kya hal hai ");
        }
    }
}

public class example2 {
    public static void main(String[] args) {
        x obj1 = new x();
        y obj2 = new y();

         // obj1.start();
        // obj2.start(); this will not work beacuse the start method is from Thread
        // class not in runnable

        
        Thread t1 = new Thread(obj1); // so for running this we have to created the object of the thread class and
                                      // thread class contain the start method so we can use the start method now
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

       

    }
}
