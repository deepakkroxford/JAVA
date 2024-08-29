package T7_Abstraction;

abstract class Shape {
    abstract public double calculateArea();

    abstract public double calculatePerimeter();
}

class Circel extends Shape {
    public int radius;

    public Circel(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double res = Math.PI * radius * radius;
        return res;
    }

    public double calculatePerimeter() {
        double res = 2 * Math.PI * radius;
        return res;
    }

    public void printinfo() {
        System.out.println("area of circle:" + calculateArea() + "\npreimeter of circle:" + calculatePerimeter());
        System.out.println();
    }

}

class Triangle extends Shape {
    public int heigth;
    public int base;
    private int s1;
    private int s2;
    private int s3;

    // constructor for setting the initaial value
    public Triangle(int heigth, int base, int s1, int s2, int s3) {
        this.heigth = heigth;
        this.base = base;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double calculateArea() {
        int area = (base * heigth) / 2;
        return area;
    }

    public double calculatePerimeter() {
        double peri = s1 + s2 + s3;
        return peri;
    }

    public void printinfo() {
        System.out.println("area of triangle:" + calculateArea() + "\nperimeter of triangle:" + calculatePerimeter());
        System.out.println();
    }
}

public class Q2 {
    public static void main(String[] args) {
        /*
         * Write a Java program to create an abstract class Shape with abstract methods
         * calculateArea() and calculatePerimeter().
         * Create subclasses Circle and Triangle that extend the Shape class and
         * implement the respective methods to calculate the
         * area and perimeter of each shape.
         */
        Circel c1 = new Circel(4);
        c1.printinfo();
        Circel c2 = new Circel(34);
        c2.printinfo();

        Triangle t1 = new Triangle(4, 3, 1, 2, 3);
        t1.printinfo();
        Triangle t2 = new Triangle(20, 10, 34, 45, 65);
        t2.printinfo();

    }
}
