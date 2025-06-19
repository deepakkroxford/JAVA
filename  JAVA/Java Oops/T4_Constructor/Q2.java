

class Laptop {
    String brand;
    int price;

    public Laptop() {
        this("unknown");
    }

    public Laptop(String brand) {
        this(brand, 0);
    }

    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}

class Cars {
    String brand;
    int price;

    // Default constructor
    public Cars() {
        this("Unknown"); // calls 1-param constructor
    }

    // Constructor with brand only
    public Cars(String brand) {
        this(brand, 0); // calls 2-param constructor
    }

    // Constructor with brand and price
    public Cars(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // Method to show details
    public void showDetails() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }
}


class Rectangle {
    double length;
    double breadth;

    // Default constructor
    public Rectangle() {
        this(1); // Calls single-parameter constructor
    }

    // Constructor for square
    public Rectangle(double side) {
        this(side, side); // Calls two-parameter constructor
    }

    // Constructor for rectangle
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and display area and perimeter
    public void calculateAndDisplay() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("-----------------------");
    }
}


public class Q2 {
    public static void main(String[] args) {
        /*
         * Create a class Laptop with three constructors:
         * Default constructor
         * One that takes brand
         * One that takes brand and price
         * Use constructor chaining (this()) so that the most detailed constructor
         * handles initialization.
         * Create a class Car that uses constructor chaining to initialize:
         * Default values: "Unknown" for brand and 0 for speed
         * If brand is given, use that but default speed
         * If both brand and speed are given, initialize both
         * Modify your Book class to use constructor chaining where the default
         * constructor calls the parameterized constructor with default values.
         */

        Laptop l1 = new Laptop(); // Uses default
        Laptop l2 = new Laptop("Dell"); // Uses 1-param
        Laptop l3 = new Laptop("HP", 50000); // Uses full constructor

        System.out.println("Laptop 1: " + l1.brand + ", " + l1.price);
        System.out.println("Laptop 2: " + l2.brand + ", " + l2.price);
        System.out.println("Laptop 3: " + l3.brand + ", " + l3.price);


        Cars c1 = new Cars(); // uses default
        Cars c2 = new Cars("Toyota"); // uses 1-param
        Cars c3 = new Cars("BMW", 7000000); // uses 2-param

        c1.showDetails();
        c2.showDetails();
        c3.showDetails();

        System.out.println();

        Rectangle r1 = new Rectangle();              // default values (1,1)
        Rectangle r2 = new Rectangle(5);             // square (5,5)
        Rectangle r3 = new Rectangle(4, 6);          // custom rectangle

        r1.calculateAndDisplay();
        r2.calculateAndDisplay();
        r3.calculateAndDisplay();
    }

}
