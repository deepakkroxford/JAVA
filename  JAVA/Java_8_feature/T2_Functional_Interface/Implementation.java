package Java_8_feature.T2_Functional_Interface;

//creation of functional interface in java
@FunctionalInterface
interface Animal {
    void eating();
    // void read(); we can not write another abstract method beacause we define interface as functional interface
    // But we can make any number of default method and static method
    default void sybye()
    {

    };
    public static void hii()
    {
    };
}


@FunctionalInterface
 interface parent {
  public void hii();    
}

/**
 * child extend parent
 */
@FunctionalInterface //so this is also a functional interface
 interface child extends parent {
   // public void run(); if we define another method so it is not a functional interface
    public void hii();  //but if we define same method as parent so this is a functional interface
    
}

public class Implementation {
    public static void main(String[] args) {
        Animal a1 = () -> System.out.println("animal is eating");
        a1.eating();

        parent p1  = ()->System.out.println("hii everyone");
        p1.hii();
        // second method to use the interface method
        // Animal a2 = new Animal() {
        // @Override
        // public void eating() {
        // System.out.println("Animal is eating");
        // }
        // };
        // a2.eating();
    }
}
