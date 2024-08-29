package Java_8_feature.T6_TypesOFFunctionalInterface;
import java.util.ArrayList;
import java.util.function.BiConsumer;

class teacher{
    Double salary;
    String name;
    teacher(Double salary,String name)
    {
        this.salary=salary;
        this.name = name;
    }
}
public class T7_Biconsumer {
    public static void main(String[] args) {
        ArrayList<teacher> l = new ArrayList<>();
        populate(l);
        BiConsumer< teacher , Double> c = (e,D)->e.salary = e.salary+D;
        for (teacher teacher : l) {
            c.accept(teacher, 500.0);
        }
        for (teacher teacher : l) {
            System.out.println("Employee Name"+teacher.name);
            System.out.println("teacher Salry"+teacher.salary);
            System.out.println();
        }

        
    }

    public static void populate(ArrayList<teacher> l) {
        l.add(new teacher(23.00, "deepak"));
        l.add(new teacher(3223.00, "dipu"));
        l.add(new teacher(3023.00, "aman"));
        l.add(new teacher(12023.00, "ashish"));

    }

}
