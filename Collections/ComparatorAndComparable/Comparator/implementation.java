package Collections.ComparatorAndComparable.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class implementation {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Student s1 = new Student(1,"Deepak",90);
        Student s2 = new Student(2,"Rahul",80);
        Student s3 = new Student(3,"Rohit",70);
        Student s4 = new Student(4,"Rohit",80);
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);

        // Collections.sort(arr,new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return Integer.compare(o1.getMarks(), o2.getMarks()); // ascending order
        //     }
            
        // });

        // sort in descending order this is the other way to do that 
        Comparator<Student> s = Collections.reverseOrder();
        Collections.sort(arr,s);

        // sort in descending order
        Collections.sort(arr,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o2.getMarks(), o1.getMarks());
            }
        });


        for (Student student : arr) {
            System.out.println(student);
        }
    
    }
}
