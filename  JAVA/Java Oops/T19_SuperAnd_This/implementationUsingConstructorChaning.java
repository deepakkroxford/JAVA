class Demo {
    int a;
    int b;

    Demo(){
        a=100;
        b=200;
        System.out.println("Default constructor");
    }
    Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a: " + a + ", b: " + b);
    }
}

class DemoChild extends Demo {
    int c;

    DemoChild(int a, int b, int c) {
        super(a, b); // Calls the constructor of the parent class
        this.c = c;
    }

    void display() {
        super.display(); // Calls the display method of the parent class
        System.out.println("c: " + c);
    }
}

class DemoChild2 extends Demo {
    int d;

    DemoChild2(int a, int b, int d) {
        super(a, b); // Calls the constructor of the parent class
        this.d = d;
    }

    void display() {
        super.display(); // Calls the display method of the parent class
        System.out.println("d: " + d);
    }
}

public class implementationUsingConstructorChaning {

    public static void main(String[] args) {
        DemoChild child = new DemoChild(1, 2, 3);
        child.display();

        DemoChild2 child2 = new DemoChild2(4, 5, 6);
        child2.display();
        // Output:
        // a: 1, b: 2
        // c: 3
        // a: 4, b: 5
        // d: 6
        // The output shows that the child classes can access the parent class's
        // constructor and methods using the super keyword. The child classes can also
    }
}