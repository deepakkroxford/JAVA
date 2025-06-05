package Collections.ComparatorAndComparable.Comparable;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        super(); // can be removed since Object class constructor is called implicitly
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        if (this.marks > o.marks) {
            return -1; // for ascending reverse -1 to 1
        } else if (this.marks < o.marks) {
            return 1; // for ascending reverse 1 to -1
        } else {
            return 0;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}
