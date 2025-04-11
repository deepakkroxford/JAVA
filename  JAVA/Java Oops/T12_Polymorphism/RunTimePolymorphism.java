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
