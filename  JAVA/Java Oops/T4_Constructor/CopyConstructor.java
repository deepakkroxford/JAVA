package T4_Constructor;

class Employee {
    int id;
    String name;
    int age;
    char gender;
    int salary;

    // this is the normal way to create the constructor
    public Employee(int id, String name, int age, int salary, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    // this is the way to create the copy constructor and it help to create the
    // clone of the other object
    public Employee(Employee e) {
        this.id = e.id;
        this.name = e.name;
        this.age = e.age;
        this.gender = e.gender;
        this.salary = e.salary;
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------");
    }
}

public class CopyConstructor {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Deepak Kumar Singh", 23, 8792829, 'M');
        e1.display();


        // using the copy constructor we clone the e1 in to e2
        Employee e2 = new Employee(e1);
        e2.display(); 
    }
}
