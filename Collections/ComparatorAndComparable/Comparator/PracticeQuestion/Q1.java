package Collections.ComparatorAndComparable.Comparator.PracticeQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        super();
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }

}

public class Q1 {
    public static void main(String[] args) {
        /**
         * Sort students by name (alphabetically)
         * Fields: int rollNo, String name
         * Sort using a NameComparator class.
         */
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John"));
        students.add(new Student(2, "Alice"));
        students.add(new Student(3, "Bob"));
        students.add(new Student(4, "Eve"));
        students.add(new Student(5, "David"));
        Collections.sort(students, new NameComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
