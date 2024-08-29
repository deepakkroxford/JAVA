package T9_Inheritance;

// super keyword in java example 
//Use of super with Variables
// Base class vehicle 
class Speed {
    int maxSpeed = 120;
}

// sub class Car extending vehicle
class Cars extends Speed {
    int maxSpeed = 180;

    void display() {
        // print maxSpeed of base class (Speed) or Superclass
        System.out.println("Maximum Speed: "
                + super.maxSpeed);
    }
}



// use of super class with method
class Person {
    void message() {
        System.out.println("This is person class\n");
    }
}

// Subclass Student
class Student extends Person {
    void message() {
        System.out.println("This is student class");
    }

    // Note that display() is
    // only in Student class
    void display() {
        // will invoke or call current
        // class message() method
        message();

        // will invoke or call parent
        // class message() method
        super.message();
    }
}




// Use of super with constructors
// Java Code to show use of
// super keyword with constructor

// superclass Person
class Man {
    Man() {
        System.out.println("Men class Constructor");
    }
}

// subclass Student extending the Person class
class Boy extends Man {
    Boy() {
        // invoke or call parent class constructor
        super();
        System.out.println("Boy class Constructor");
    }
}



public class I3_SuperKeyword {
    public static void main(String[] args) {
        Cars obj = new Cars();
        obj.display();

        Student obj1 = new Student();
        obj1.display();

        Boy obj2 = new Boy();
    }
}
