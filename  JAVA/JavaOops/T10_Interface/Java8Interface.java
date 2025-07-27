
interface I1 {
    public static void dance() {
        System.out.println("Dancing in I1");
    }
    default void run() {
        System.out.println("i1 run");
    }
}

interface I2 {
    default void run() {
        System.out.println("i1 run");
    }
    
    public static void dance() {
        System.out.println("Dancing in I2");
    }
}

class C implements I1,I2 {
    @Override
    public void run() {
      I1.super.run();
      I2.super.run();
      
      I1.dance();
      I2.dance();
    }
}

public class Java8Interface {
    public static void main(String[] args) {
        C c1 = new C();
        c1.run();
    }
}
