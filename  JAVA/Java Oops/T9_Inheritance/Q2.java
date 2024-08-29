package T9_Inheritance;

class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("working");
    }

    public int getSalary() {
        return salary;
    }
}

class HRManager extends Employee {

    public HRManager(int salary) {
        super(salary);
    }

    public void work() {
        System.out.println("working");
    }

    public void addEmployee() {
        System.out.println("adding new employee");
    }

}

public class Q2 {
    public static void main(String[] args) {
        /*
         * Write a Java program to create a class called Employee with methods called
         * work() and getSalary(). Create a subclass called HRManager that overrides the
         * work() method and adds a new method called addEmployee().
         */
        Employee emp = new Employee(40000);
        // HRManager mgr = new HRManager(70000);

        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        // mgr.work();
        // System.out.println("Manager salary: " + mgr.getSalary());
        // mgr.addEmployee();
    }
}
