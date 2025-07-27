package T7_Abstraction;

abstract class Vehicle{
    abstract public String getFuelType();
    abstract public int getNumberOfWheels();
}


class Cars extends Vehicle{
     
    int numberOfWheels=4;
    String fueltype;

   public Cars(String fuelType)
    {
        this.fueltype = fuelType;
    }

    public String getFuelType()
    {
        return fueltype;
    }

    public int getNumberOfWheels()
    {
        return numberOfWheels;
    }

    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Fuel Type: " + getFuelType());
    }

}


class Bike extends Vehicle{

    int numberOfWheels=2;
    String fuelType;

   public Bike(String fueltype)
    {
        this.fuelType=fueltype;
    }

    public int getNumberOfWheels()
    {
        return numberOfWheels;
    }

    public String getFuelType()
    {
        return fuelType;
    }

    public void displayInfo() {
        System.out.println("Bike Information:");
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Fuel Type: " + getFuelType());
    }

}
public class Q5 {
    public static void main(String[] args) {

        Cars c1 = new Cars("diseal");
        c1.displayInfo();

        Bike b1 = new Bike("electric");
        b1.displayInfo();





        /*
         * Create an abstract class Vehicle that has the following abstract methods:
         * 
         * int getNumberOfWheels(): Returns the number of wheels the vehicle has.
         * String getFuelType(): Returns the type of fuel the vehicle uses.
         * Then, create two subclasses: Car and Bike.
         * 
         * The Car class should have the following properties:
         * int numberOfWheels (should be set to 4)
         * String fuelType (can be either "Petrol" or "Diesel")
         * The Bike class should have the following properties:
         * int numberOfWheels (should be set to 2)
         * String fuelType (can be either "Petrol" or "Electric")
         * Each subclass should implement the abstract methods and also include a method
         * displayInfo() that prints out the vehicle's information.
         * 
         * Finally, in the main method, create instances of both Car and Bike, and call
         * their displayInfo() methods.
         * 
         * Constraints:
         * Use appropriate access modifiers for the properties and methods.
         * Implement the necessary constructors for both subclasses.
         */
    }
}
