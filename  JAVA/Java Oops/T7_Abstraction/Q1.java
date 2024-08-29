package T7_Abstraction;

abstract class Animal {
    abstract public void sound();
}

class Lion extends Animal {
    public void sound() {
        System.out.println("roar....");
    }
}

class Tiger extends Animal {
    public void sound() {
        System.out.println("fooo....");
    }
}

public class Q1 {
    public static void main(String[] args) {
        /*
         * Write a Java program to create an abstract class Animal with an abstract
         * method called sound().
         * Create subclasses Lion and Tiger that extend the Animal class and implement
         * the sound() method to make a specific sound for each animal.
         */
        Lion l1 = new Lion();
        l1.sound();
        Tiger t1 = new Tiger();
        t1.sound();
    }
}
