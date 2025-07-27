class Parent {
    int a;
    int b;

    Parent() {
        a = 20;
        b = 30;
    }

    Parent(int a) {
        this.a = a;
    }

    Parent(int a, int b) {
        this(a);
        this.b = b;
    }
}

class Child extends Parent {
    int c;
    int d;

    Child() {
        a = 100;
        b = 200;
        c = 300;
        d = 400;
    }

    public Child(int c) {  // calls the parent default constructor
       // super(); // calls the parent default constructor
        a=1000;
        this.c = c;
    }

    public Child(int c, int d) {
        super(1000, 2000); // calls the parent calls parameterized constructor
        this.c = c;
        this.d = d;
    }

    void display() {
        System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d);
    }
}

public class KodenstExample {
    public static void main(String[] args) {
        Child child = new Child(599,897);
        child.display();
    }
}
