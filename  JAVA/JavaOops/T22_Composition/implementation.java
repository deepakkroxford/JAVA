package T22_Composition;

class Engine {
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

}

class Car {
    private String brand;
    private Engine engine; // Composition: Car "has-a" Engine

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public void showCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Engine Type: " + engine.getType());
        System.out.println("Horsepower: " + engine.getHorsepower() + " HP");
    }
}

public class implementation {
    public static void main(String[] args) {
        Engine engine = new Engine("V8", 400); // Create Engine object
        Car car = new Car("Ford Mustang", engine); // Inject Engine into Car
        car.showCarDetails(); // Use composed behavior

        /**
         * Inheritance = Tight Coupling
         * When you use inheritance:
         * 
         * The child class is tightly connected to the parent.
         * 
         * Any change in the parent class can break the child class.
         * 
         * The child class cannot change the behavior of the parent without overriding.
         * 
         * You cannot swap the parent for something else easily.
         * 
         * 
         * When you use composition:
         * The class just uses another class as a field.
         * 
         * You can easily replace or change the inner object.
         * 
         * Less risk: changes in one class don’t break the other.
         * 
         * Supports interfaces for true flexibility.
         * 
         * 
         */
    }
}
