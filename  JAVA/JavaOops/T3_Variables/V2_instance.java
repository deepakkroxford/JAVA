package T3_Variables;

class Person {
    // Instance variables
    String name;
    int age;

    // Method to display the person's information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Car {

    // instacne variable
    String name;
    String model;
    int year;
    double milage;

    // constructor
    public Car(String name, String model, int year, double milage) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.milage = milage;
    }

    public void printinfo() {
        System.out.println("Name:" + name + ",Model:" + model + ",year: " + year + ",Milage: " + milage);
    }

}

public class V2_instance {
    public static void main(String[] args) {

        /*
         * The Person class has two instance variables: name and age.
         * When we create person1 with the name "deepak" and age 26, a new set of
         * instance variables (name and age) is created for person1.
         * 
         * Similarly, when we create person2 with the name "aman" and age 22, a new,
         * separate set of instance variables is created for person2.
         * 
         * This means person1 and person2 each have their own name and age values stored
         * independently.
         * 
         */
        Person p1 = new Person();
        p1.name = "deepak";
        p1.age = 26;
        p1.displayInfo();

        Person p2 = new Person();
        p2.name = "aman";
        p2.age = 22;
        p2.displayInfo();

        /*
         * Here, after modifying the age of person1, person2's age remains unchanged.
         * This demonstrates that person1 and person2 have separate copies of the
         * instance variables name and age.
         */
        p1.age = 21;
        p1.displayInfo();

        Car c1 = new Car("BMW", "M8", 2019, 200);
        Car c2 = new Car("Audi", "RS7", 2024, 300);
        // Car c1 = new Car();
        // c1.name="aman";
        // c1.model="2004";
        // c1.milage=300;
        c1.printinfo();
        c2.printinfo();
    }
}
