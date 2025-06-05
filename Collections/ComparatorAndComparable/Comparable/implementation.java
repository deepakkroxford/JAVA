package Collections.ComparatorAndComparable.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class implementation {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Student s1 = new Student(1, "Deepak", 90);
        Student s2 = new Student(2, "Rahul", 80);
        Student s3 = new Student(3, "Rohit", 70);
        Student s4 = new Student(4, "Rohit", 80);
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);

        // for (Student student : arr) {
        // System.out.println(student);
        // }

        // Collections.sort(arr); it will give the compile time error beacuse we did not
        // specify on what besis you want to sort.

        Collections.sort(arr);
        for (Student student : arr) {
            System.out.println(student);
        }

    }
}
