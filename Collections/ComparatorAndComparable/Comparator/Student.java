package Collections.ComparatorAndComparable.Comparator;


public class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        super(); // can be removed since Object class constructor is called implicitly
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}
