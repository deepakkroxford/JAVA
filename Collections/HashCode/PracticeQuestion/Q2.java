package Collections.HashCode.PracticeQuestion;

import java.util.HashSet;
import java.util.Objects;

class Car {
    private String model;
    private int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    @Override
    public int hashCode() {
        return Objects.hash(model,year);
    }

    @Override
    public boolean equals(Object obj) {
        Car ref = (Car)obj;
        if(this.model.compareTo(ref.model)==0 && this.year==ref.year)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", year=" + year + "]";
    }
}
public class Q2 {
    public static void main(String[] args) {
        /**
         * You are building a system for managing a fleet of cars for a car rental
         * service.
         * The cars are identified by their model and year. The fleet system should not
         * allow duplicate entries (i.e., the same car should not be added more than
         * once). To ensure this, you need to properly implement the hashCode() and
         * equals () methods in a Car class.
         * Two cars are considered the same if both their model and year are identical.
         * By overriding the hashCode() and equals) methods in the Car class, you can
         * ensure that duplicate cars are not added to a HashSet.
         * 
         * Your Task:
         * Write a program that:
         * 1. Defines a class Car with attributes model and year.
         * 2. Overrides the hashCode() and equals() methods in the Car class.
         * 3. Demonstrates the correct behaviour by adding Car objects to a HashSet and
         * checking if duplicates are correctly identified.
         * 
         * Steps to Follow:
         * 1. Input:
         * • First, read an integer n, representing the number of cars.
         * • Next, read n lines, each containing a car's model (string) and year
         * (integer).
         * 2. Output:
         * • Print the contents of the HashSet to show that no duplicate cars were
         * added.
         */

         HashSet<Car> set = new HashSet<>();
         set.add(new Car("BMW", 2020));
         set.add(new Car("Audi", 2019));

         System.out.println(set);
      
    }
}
