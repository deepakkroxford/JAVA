package Collections.HashCode.PracticeQuestion;

import java.util.HashSet;
import java.util.Objects;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person ref = (Person) obj;
        return this.name.equals(ref.name) && this.age == ref.age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
public class Q1 {
    public static void main(String[] args) {
        /**
         * Implement hashCode() and equals) Methods
         * 
         * You are tasked with implementing the hashCode() and equals) methods for a
         * custom class called Person. This class will store a person's name and age.
         * Two Person objects should be considered equal if both their names and ages
         * are the same. You will also ensure that these objects behave correctly when
         * added to a HashSet or LinkedHashSet.
         * 
         * 
         * Your Task:
         * 
         * Write a program that:
         * 1. Defines a class Person with name and age attributes.
         * 2. Overrides the hashCode() and equals) methods in the Person class.
         * 3. Demonstrates the correct behavior of a HashSet by adding Person objects to
         * it and checking if duplicates are correctly identified.
         * Steps to Follow:
         * 
         * 1. Input:
         * • First, read an integer n, representing the number of people.
         * • Next, read n lines, each containing a person's name and age.
         * 2. Output:
         * • Print the contents of the HashSet to show that no duplicates were added.
         */

        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person("Rahul", 20);
      
        HashSet<Person> hs = new HashSet<>();
        hs.add(p1);
        hs.add(p2);
        for (Person person : hs) {
            System.out.println(person);
        }
    }
}
