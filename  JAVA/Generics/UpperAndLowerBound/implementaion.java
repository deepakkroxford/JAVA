package Generics.UpperAndLowerBound;

import java.util.*;

class Object {

}

class Creature extends Object {

}

class Animal extends Creature {

}

class Cat extends Animal {

}

class IndianCat extends Cat {

}

class Dog extends Animal {

}

class Husky extends Dog {

}

public class implementaion {
    
    // public static void displayLowerBound(List<? super Animal> lower) {
    //     for(Object obj :  lower) {
    //         System.out.println((Animal) obj);
    //     }
    // }

    // This is called Upper Bounded Wildcard it means what ever the animal subclass
    // we can access their
    public static void display(List<? extends Animal> lisofAnimal) {

        for (Animal animal : lisofAnimal) {
            System.out.println(animal);
        }

    }

    public static void main(String[] args) {
        ArrayList<Dog> d1 = new ArrayList<>();
        d1.add(new Dog());
        d1.add(new Dog());
        d1.add(new Dog());
        d1.add(new Dog());
        display(d1);

        ArrayList<Cat> c1 = new ArrayList<>();
        c1.add(new Cat());
        c1.add(new Cat());
        c1.add(new Cat());
        c1.add(new Cat());
        display(c1);

        ArrayList<Husky> h1 = new ArrayList<>();
        h1.add(new Husky());
        h1.add(new Husky());
        h1.add(new Husky());
        h1.add(new Husky());
        display(h1);

        ArrayList<Object> a3 = new ArrayList<>();
        a3.add(new Dog());
        a3.add(new Cat());
       // displayLowerBound(a3);

        // if i need animal so i can get Dog, 
        ArrayList<? extends Animal> a = new ArrayList<Dog>(); // if we are extending so we can only access the sub class
                                                              // of the animal or we can say lower than the animal.

         // this is the concept of ContraVariance so if i need Dog trainer but some one give me animal trainer it is like that                                                      
        ArrayList<? super Dog> a1 = new ArrayList<Object>(); // we are going up side now we can access the object but
                                                                // not the husky or lower than animal

    }
}
