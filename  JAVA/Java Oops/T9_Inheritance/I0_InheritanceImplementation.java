package T9_Inheritance;




class Superclass {
    public void makeSound() {
        System.out.println("sound.....");
    }
}

class Baseclass extends Superclass {
    @Override
    public void makeSound() {
        System.out.println("meow.....");
    }
}
//parent class
class Vehicle {
    double price;
    double milage;
    String color;
    public void drives() {
        System.out.println("reparing Vechile");
    }
    public void display()
    {
        System.out.println(price+" "+milage+" "+color);
    }
}

// extend keyword is used to inherit the property of the parent class
class Car extends Vehicle {

    String fueltype;
    boolean sunroof;
    String brand;
    public void drive() {
        System.out.println("reparing car");
    }
}

public class I0_InheritanceImplementation {
    public static void main(String[] args) {
        /*
         * Write a Java program to create a class called Animal with a method called
         * makeSound(). Create a subclass called Cat that overrides the makeSound()
         * method to bark
         */

        /*
         * Write a Java program to create a class called Vehicle with a method called
         * drive().
         * Create a subclass called Car that overrides the drive() method to print
         * "Repairing a car".
         */

       
        
       //using base class name"Car" we can access the Superclass name"Vechile" method drives();
        Car obj1 = new Car();
        obj1.drive();
        obj1.drives();
        obj1.milage=18.22;
        obj1.brand="Bmw";
        obj1.color="red";
        obj1.price=150000;
        obj1.fueltype="petrol";
        obj1.sunroof=true;
        obj1.display();
        
    }
}
