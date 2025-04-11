package T12_Polymorphism;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class car extends Animal {
    @Override
    public void sound() {
        System.out.println("Car honks");
    }
}

class dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void dance(){
        System.out.println("Dog dances");
    }
}


class peacock extends dog {
    @Override
    public void sound() {
        System.out.println("Peacock dances");
    }

    public void dance(){
        System.out.println("Peacock dances");
    }
}

public class RunTimePolymorphism {
    /**
     * Demonstrates runtime polymorphism in Java.
     * 
     * Key Concepts:
     * 1. Method Overriding:
     *    - A subclass provides a specific implementation of a method already defined in its superclass.
     *    - The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
     *    - The overridden method in the subclass is called at runtime, based on the actual object type.
     * 
     * 2. Polymorphism:
     *    - A superclass reference can point to a subclass object.
     *    - The method that gets executed is determined by the actual object type, not the reference type.
     * 
     * 3. Compile-Time Restrictions:
     *    - A reference variable can only access methods defined in its declared type.
     *    - If a subclass-specific method is called using a superclass reference, it will result in a compile-time error.
     * 
     * Example Flow:
     * - An `Animal` reference is used to call the `sound` method, which is overridden in `car` and `dog` subclasses.
     * - A `dog` reference is used to call both `sound` and `dance` methods, demonstrating subclass-specific behavior.
     * - Attempting to assign a `car` object to a `dog` reference results in a compile-time error, as `car` is not a subclass of `dog`.
     */
    public static void main(String[] args) {

        Animal obj = new Animal();
        obj.sound(); // Animal makes a sound
        obj = new car();
        obj.sound(); // Car honks
        obj = new dog();
        obj.sound();; // Dog barks

        dog d = new dog();
        d.sound(); // Dog barks
        d.dance(); // Dog dances
        d = new peacock();
        d.sound(); // Peacock dances
        d.dance(); // Peacock dances
        // d = new car(); // This will cause a compile-time error because car is not a subclass of dog
        // d.dance(); // This will cause a compile-time error because car does not have a dance method
        
    }
}
