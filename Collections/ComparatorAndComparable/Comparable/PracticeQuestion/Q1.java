package Collections.ComparatorAndComparable.Comparable.PracticeQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        super(); // can be removed since Object class constructor is called implicitly
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "Person {id=" + id + ", name=" + name + ", age=" + age + "}";
    }

}

public class Q1 {
    public static void main(String[] args) {
        /**
         * Implementing the Comparable Interface
         * You are managing a group of people in a system, and you need to sort them
         * based on their age. By implementing the Comparable interface, you can define
         * a natural ordering for the Person class. This allows you to easily sort a
         * collection of Person objects.
         * Your Task:
         * 1. Implement the Comparable interface in a Person class.
         * 2. Compare the Person objects based on their age (in ascending order).
         * 3. Use a collection, like ArrayList, to store the Person objects and sort
         * them using Collections.sort ().
         * Steps to Follow:
         * 1. Input:
         * • First, read an integer n, representing the number of people.
         * • Next, read n lines, each containing a person's name and age.
         * 2. Output:
         * • Print the Person objects in ascending order of their age.
         */

        ArrayList<Person> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of person");
        int n = sc.nextInt();
        System.out.println("Enter the first id then name and then age");
        for (int i = 0; i < n; i++) {
            arr.add(new Person(sc.nextInt(), sc.next(), sc.nextInt()));
        }
        Collections.sort(arr);
        for (Person person : arr) {
            System.out.println(person);
        }
        sc.close();
    }
}
