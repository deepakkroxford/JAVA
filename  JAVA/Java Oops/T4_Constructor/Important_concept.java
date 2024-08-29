package T4_Constructor;

 class Base {

    int a;
    int b;
    public Base(int a, int b)
    {
        this.a = a;
        this.b=b;
        System.out.println("x");
    }
   Base()
   {
    System.out.println("hi am base class constructor");
   }
    
}
class Derived extends Base
{
    
    Derived()
    {
        System.out.println("hii am derived class constructor");
    }
}

public class Important_concept {
    public static void main(String[] args) {

        // if we make a object of derived class it will also call the constructor of Base class and it self
        Derived obj = new Derived();
        System.out.println(obj);

        /*
         * Constructors in Java are used to initialize the values of the attributes of the object serving the goal to bring Java closer to the real world. 
         * We already have a default constructor that is called automatically if no constructor is found in the code. But if we make any constructor 
         * say parameterized constructor in order to initialize some attributes then it must write down the default constructor because it now will be no 
         * more automatically called.   
         */

    }
}
