package T6_Encapsulation;

class Persons {
    // we make this instance variable as a private so we can not access out side the
    // class making the object of the class
    private String name;
    private int salary;
    private String department;

    // now for accesing them we have to make the method for this variable to access
    // outside the class and method should be public

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getdep() {
        return department;
    }

    // here we are using set method to set the value of instance variable
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setdep(String department) {
        this.department = department;
    }

    public void printinfo() {
        System.out.println(getName() + " " + getSalary() + " " + getdep());
    }
}

public class Encapsulation_implementation {
    public static void main(String[] args) {
        Persons obj1 = new Persons();
        obj1.setName("aman");
        obj1.setSalary(12121123);
        obj1.setdep("ise");
        obj1.printinfo();

    }
}
