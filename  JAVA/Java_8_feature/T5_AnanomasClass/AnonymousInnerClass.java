package Java_8_feature.T5_AnanomasClass;

class A {
    public void show() {
        System.out.println("in a show");

    }
}
interface X{
    public void show();
    public void run();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A a = new A() {
            // this is a Anonymous class without name insted of creating new class that
            // extend A class
            // and then override the show method and give the new implementation we use the
            // inner ananomass
            // class if we know it is only used one time
            public void show() {
                System.out.println("new implemwntations");
            }
        };
        a.show();

        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("child  thread ");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("main tread");
        }


//we are using annanomas inner class to give the implementaion of the interface 
// in this case we can not use the lambda expression becuse the interface contain two method 
// so it means that  interface is not a functional interface
        X x = new X() {
            public void show()
            {
                System.out.println("hii in a new show");
            }

            public void run()
            {
                System.out.println("now i am runnig");
            }
        };
        x.show();
        x.run();
    }
}
