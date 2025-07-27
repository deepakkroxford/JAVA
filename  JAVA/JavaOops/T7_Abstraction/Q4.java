package T7_Abstraction;

abstract class Shape {
    abstract public int calculateArea();

    abstract public int calculatePerimeter();

    protected void display() {
        System.out.println("i will display");
    }
}

class Circle extends Shape {
    int radius;
    int area;
    int perimeter;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int calculateArea() {
        area = (int) (Math.PI * radius * radius);
        return area;
    }

    public int calculatePerimeter() {
        perimeter = (int) (2 * Math.PI * radius);
        return perimeter;
    }

    @Override
    public void display() {
        System.out.println("the perimeter of the circle is " + calculatePerimeter());
        System.out.println("the area of the cirecle is " + calculateArea());
    }

}

class Rectangle extends Shape {

    int length;
    int breath;

    Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public  int calculateArea()
    {
        return length*breath;
    }

    public  int calculatePerimeter()
    {
        return 2*(length+breath);
    }

    @Override
    public void display()
    {
        System.out.println("the perimeter of rectangel -->"+calculatePerimeter());
        System.out.println("the area of the traingle is --> "+calculateArea());
    }
}

public class Q4 {
    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        c1.display();

        Rectangle r1 = new Rectangle(3, 5);
        r1.display();
        /*
         * Question:
         * 
         * Create an abstract class Shape with the following requirements:
         * 
         * An abstract method calculateArea() which will return the area of the shape.
         * An abstract method calculatePerimeter() which will return the perimeter of
         * the shape.
         * A concrete method display() that prints "This is a shape."
         * Then, create two subclasses:
         * 
         * Circle, which will:
         * Have a constructor that accepts a radius.
         * Implement the calculateArea() method to return the area of the circle.
         * Implement the calculatePerimeter() method to return the perimeter of the
         * circle.
         * 
         * Rectangle, which will:
         * Have a constructor that accepts length and width.
         * Implement the calculateArea() method to return the area of the rectangle.
         * Implement the calculatePerimeter() method to return the perimeter of the
         * rectangle.
         * Finally, write a main method to:
         * 
         * Create objects of both Circle and Rectangle.
         * Call the calculateArea() and calculatePerimeter() methods for each object.
         * Call the display() method for each object.
         * Expected Output:
         * The area and perimeter of the circle.
         * The area and perimeter of the rectangle.
         * The message "This is a shape." for both shapes.
         * 
         * 
         */
    }
}
