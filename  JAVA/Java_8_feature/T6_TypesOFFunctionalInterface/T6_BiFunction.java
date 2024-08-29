package Java_8_feature.T6_TypesOFFunctionalInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class T6_BiFunction {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<>();

        // Employe id = integer, Employee name =String type, Return type is =Employee
        // object
        BiFunction<Integer, String, Employee> f = (eno, name) -> new Employee(eno, name);
        l.add(f.apply(100, "aman"));
        l.add(f.apply(500, "ashish"));
        l.add(f.apply(130, "deepak"));
        l.add(f.apply(1020, "harshit"));

        for (Employee employee : l) {
            System.out.println(employee.name + " " + employee.id);
        }

    }
}
