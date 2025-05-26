package T4_Constructor;

// Parent class
class Vehicles {
    String brand;
    int speed;

    // Parameterized constructor
    public Vehicles(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle constructor called");
    }

    public void showDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

// Child class
class Carr extends Vehicles{
    int price;

    // Constructor using super() to call Vehicle's constructor
    public Carr(String brand, int speed, int price) {
        super(brand, speed); // calling parent constructor
        this.price = price;
        System.out.println("Car constructor called");
    }

    
    public void showCarDetails() {
        showDetails(); // from Vehicle class
        System.out.println("Price: " + price);
    }
}


// Vehicle constructor called
// Car constructor called
// Brand: Toyota, Speed: 180
// Price: 1500000
public class Q3 {
    public static void main(String[] args) {
        Carr c1 = new Carr("Toyota", 180, 1500000);
        c1.showCarDetails();
    }
}
