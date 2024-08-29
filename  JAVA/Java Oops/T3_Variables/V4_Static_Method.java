package T3_Variables;

class mobilex {
    String brand;
    static String name = "iphone"; // it will common to all object
    int price;

    // this is a method and it is called as instance method
    public void display() {
        System.out.println("Brand:" + brand + ",Name:" + name + ",Price:" + price);
    }

    // by passing reference we can access the instance variable in the static method
    public static void display1(mobilex m1) {
        // we can use the static variable in the static method but we can not use the
        // instance variable or(non-static) in the static method
        // directly. it means that we can use indirectly by passing the refrence of the
        // object
        System.out.println("Brand:" + m1.brand + ",Name:" + name + ",Price:" + m1.price);
    }
    static
    {
        //this will load one time when class load
        System.out.println("hii");
    }

    // now we will create the static method
    public static void show1() {
        System.out.println("my name is deepak kumar sing");
    }
}

public class V4_Static_Method {

    /*
     * importatn point
     * main method is static because it is a starting point of the execution of the
     * program
     * if we make as non static so we have to create a object of the the class.
     * so in this satatution dedlock will happen.
     * if our program will not start executing so how we create a object of it so
     * for that reason
     * we have to make a main method as a static
     */
    public static void main(String[] args) {
        mobilex m1 = new mobilex();
        m1.brand = "Apple";
        m1.price = 50000;

        mobilex m2 = new mobilex();
        m2.brand = "Apple";
        m2.price = 10000;

        // for accesing the non-static method we have to create a object of the class.
        // if we do Mobile.display() it will give error
        m1.display();
        m2.display();

        // Static method can be access directly using the class name without creating a
        // object(instance) of it
        mobilex.show1();

        mobilex.display1(m1);
    }
}
