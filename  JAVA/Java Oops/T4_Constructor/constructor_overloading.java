package T4_Constructor;

class Persons {
    String name;
    int age;

    // inisilizing constructor and this constructor is called as default constructor
    public Persons() {
        // we set the initail name and age
        name = "aman";
        age = 12;
        System.out.println("hii i am in constructor");
    }

    public Persons(String name) {
        this.name = name;
    }

    // if want to take a user input to set the initial value so we can make a
    // parametrize constructor
    // this constructor is called as parametarize constructor
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printinfor() {
        System.out.println("Name:" + name + ",age:" + age);
    }

}


public class constructor_overloading {
    public static void main(String[] ar) {

        // here we can set the initial value for the object the we created at
       // inisilizing time
        Persons obj1 = new Persons("deepak", 25);
        obj1.name = "Dipu";
        obj1.age = 23;
        obj1.printinfor();

        // it will call the default constructor
        Persons obj2 = new Persons("sweeta singh");
        obj2.printinfor();

       
    }
}
