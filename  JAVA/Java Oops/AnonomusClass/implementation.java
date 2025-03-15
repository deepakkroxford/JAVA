package AnonomusClass;

interface Animal {
   void makeSound(); 
}

class Car {
    void drive() {
        System.out.println("Car is driving...");
    }
}

abstract class Person {
    abstract void speak();
}

public class implementation {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            public void makeSound() {
                System.out.println("Woof! Woof!");
            }
        };

        dog.makeSound(); // Output: Woof! Woof!



        Car supercar = new Car(){
            @Override
            void drive() {
                System.out.println("Driving the superFast car... ");
            }


            //we can not define the new method if it is not exist in the parent class
            // void topSpeed()
            // {
            //     System.out.println("topSpeed of car is 200km/h");
            // }
        };
        supercar.drive();
        //supercar.topSpeed();

        Person people = new Person(){
            @Override
            void speak(){
                System.out.println("he speak well");
            }

        };
        people.speak(); 

        System.err.println("this is a errror");
        try{
            int a =10/0;
            System.out.println(a);

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("code run sucessfully");
        }
        
      

    }

}
