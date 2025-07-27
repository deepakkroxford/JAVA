package T3_Variables;

class Mobile {
    String brand;
    static String name;
    int price;

    public void display() {
        System.out.println("Brand:" + brand + ",Name:" + name + ",Price:" + price);
    }
}
class Student {
    static int rollno = 0;
    String name;

    Student(String name) {
        this.name = name;
        rollno++;
    }
    public  void displayInfo() {
        System.out.println("Name:" + name + ",Roll no:" + rollno);
    }
    
}
public class V3_Static {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        Mobile.name = "iphone13";
        m1.price = 50000;
        m1.display();

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        Mobile.name = "ultra";
        m2.price = 10000;
        m2.display();

        Mobile.name = "iphone14";
        // this will change affect the both name of the object m1 or m2 and make common
        // name iphone14
        m1.display();
        m2.display();


        //here we use static variable for roll no when we create a new object for student and add name 
        // the roll no is automatcally update 
        Student s1 = new Student("Aman");
        s1.displayInfo();

        Student s2 = new Student("Deepak");
        s2.displayInfo();

    }
}
