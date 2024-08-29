package T18_Comparator_And_Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private String name;
    private String usn;
    private int marks;

    public Student(String name, String usn, int marks)
    {
        this.name=name;
        this.usn=usn;
        this.marks=marks;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getUsn() {
        return usn;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public int compareTo(Student o) {
        return  o.marks- this.marks;  // for sorting into decending order
        // return this.marks - o.marks  // acending order 
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', usn='" + usn + "', marks=" + marks + "}";
       
    }

}

public class Comparable_Implementation {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(34);
        ans.add(45);
        ans.add(12);
        ans.add(6);
        ans.add(78);
        ans.add(45);
        Collections.sort(ans);
        System.out.println(ans);

        // need of coparator and comparable is when we have multiple attribut like in
        // class of student we have marks roll no and then we want to
        // sort then we use the comparator and comparable
        




        ArrayList<Student> s = new ArrayList<>();
        //comparable we use for single sorting logic in our case we sort according to marks and if want to sort according to
        // the name we have to cahneg in the code 
        s.add(new Student("Rahul", "1OX21IS034", 85));
        s.add(new Student("Priya", "1OX21IS035", 88));
        s.add(new Student("Anjali", "1OX21IS036", 92));
        s.add(new Student("Vikram", "1OX21IS037", 76));
        s.add(new Student("Neha", "1OX21IS038", 89));
        s.add(new Student("Rohit", "1OX21IS039", 81));
        s.add(new Student("Pooja", "1OX21IS040", 95));
        s.add(new Student("Arjun", "1OX21IS041", 79));
        s.add(new Student("Simran", "1OX21IS042", 83));

        Collections.sort(s);
        
        for (Student student : s) {
            System.out.println(student);
        }

        

        
           
        

    }
}
