package T9_Inheritance;

class Shape {
    public int getArea() {
        return 0;
    }
}

class Rectangle extends Shape {

    int length;
    int breath;

    Rectangle(int l, int b) {
        this.length = l;
        this.breath = b;
    }

    @Override
    public int getArea() {
        return length * breath;
    }
}

public class Q1 {
    public static void main(String[] args) {
        /*
         * Write a Java program to create a class called Shape with a method called
         * getArea(). Create a subclass called Rectangle that overrides the getArea()
         * method to calculate the area of a rectangle.
         */

        Rectangle r1 = new Rectangle(2, 3);
        System.out.println(r1.getArea());
    }
}
