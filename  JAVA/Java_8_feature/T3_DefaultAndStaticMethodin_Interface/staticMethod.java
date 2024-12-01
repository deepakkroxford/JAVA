interface A{
    static void Staticmethod()
    {
        System.out.println("in static method");
    }
    default void defaultmethod()
    {
        System.out.println("it is defalut method");
    }
}
public class staticMethod implements A {
    public static void main(String[] args) {
        staticMethod s1 = new staticMethod();
        // s1.staticMethod(); // it will give complile time error we can not call the static method of interface using class object
        
        // staticMethod.Staticmethod(); // not by the name of class

        //if we want to call the static method from the interface so we have to call with the name
        //of the interface 
        // we can not override the static method from the interface
        A.Staticmethod();

        //but we can call the default method from the interface from the object of calass
        s1.defaultmethod();
    }
}
