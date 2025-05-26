package T4_Constructor;

class Book {
    String title;
    String author;
    int price;

    public Book() {
        title = "good habit";
        author = "deepak kumar singh";
        price = 231;
    }

    public void details() {
        System.out.println("The title of book is: " + title + " and author is: " + author + " and price: " + price);
    }
}

class Circle {
    double radius;
    double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    public void displayArea() {
        System.out.println("the area of the circle is: " + area);
    }
}

class Employees {
    String name;
    int salary;
    public Employees() {
        System.out.println("Welcome Employee");
    }

    public Employees(String name, int salary) {
         this.name = name;
         this.salary = salary;
    }

}

public class Q1 {
    public static void main(String[] args) {

        /*
         * 🧪 Beginner Level (Basic Constructors)
         * 
         * Create a class Book with a constructor that initializes the book's title,
         * author, and price. Then create an object and print the details.
         * Create a class Circle with a parameterized constructor that takes the radius
         * and calculates the area. Add a method to display the area.
         * Create a class Employee with two constructors:
         * One default constructor that prints “Welcome Employee”
         * One parameterized constructor that sets name and salary
         * Call both constructors from the main method using two different objects.
         */

        Book b1 = new Book(); // calling default constructor
        b1.details();

        Circle c1 = new Circle(5.0);  // Create object with radius 5.0
        c1.calculateArea();           // Calculate area
        c1.displayArea();  

         Employees e1 = new Employees(); // calls default constructor
        Employees e2 = new Employees("Aman", 30000); // calls parameterized constructor

        // Optional: display values of e2
        System.out.println("Employee name: " + e2.name + ", Salary: " + e2.salary);
        
    }
}
