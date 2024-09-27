package T10_Interface;

interface Car {
    // all the method shoud be public or defalut. We can also make the
    // private method from the java 9. But we can not make the protected method
    // will give the compilation error. and we can also declare the static method but this method cannot be overriden
    public void type();

    public void run();
   int a=10;// in interface the variable is static and final so we have to insializze and give the value at same time;
    public static void add()
    {
        System.out.println("adding number");
    }
    private void fast() {
        System.out.println("running fast");
    }

    default void defaultmethod() {
        System.out.println("running default method");
        fast();
    }

    // public abstract void topseppd(); //we can also define the abstrcat method
}

class ElectricCar implements Car
// when we implement the interface so all the method that is present in the
// interface should be implemented here
{
    public void run() {
        System.out.println("electric car running....");
    }

    public void type() {
        System.out.println("electric");
    }

    //we can also overide the default method from the interface
    @Override
    public void defaultmethod() {
       System.out.println("boos");
    }
   
}

class DisealCar implements Car {

    public void type() {
        System.out.println("diseal");
    }

    public void run() {
        System.out.println("diseal car running....");
    }
    

}

public class Implementation_of_Interface {
    public static void main(String[] args) {
        // DisealCar c1 = new DisealCar();
        // c1.run();

        // another way to create a method is first write the name of interface class and
        // name of object and the new keyword and Class name
        ElectricCar tesla = new ElectricCar();
        tesla.run();
        tesla.type();
        tesla.defaultmethod();
      

        Car bmw = new DisealCar();
        bmw.run();
        bmw.type();
        bmw.defaultmethod();
        Car.add();


    }
}
