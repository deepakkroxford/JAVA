package Collections.HashCode;

import java.util.LinkedHashSet;

public class Mains {
    public static void main(String[] args) {

        /**
         * hashcode is the method in java.util.package which is used to return the
         * hashcode of the object.
         * Yes, it's usually unique because it’s based on the memory address.
         * But it’s not guaranteed to be unique. Two different objects can have the same
         * hash code (though rare).
         */

        /**
         * So we know that every class in java inherit the object class. and Object
         * class has a method called toString().
         * So when we try to print the object is default called the toString() method of
         * the parent class and that return the class name and the @ hexadecimal value of the object....
         */
        family f1 = new family("Singh", 100);
        family f2 = new family("Singh", 100);
        System.out.println(f1); // default is called f1.toString()
        System.out.println(f2);

        /**
         * So when we compare the two object using the equal method it return false beacuse so it genrally work like
         * == operator not checking the exact value. so if we want to check the exact content so we have to override the 
         * equal method inside the parent class . 
         */
        System.out.println(f1.equals(f2)); // if we not overriden the method equals in parent class it return false. other wise it return based on value.

        String s1 = "AmanSingh";
        String s2 = new String("AmanSingh");
        System.out.println(s1); // default is called s.toString()

        /**
         * It generally check the content of the string. beacuse in stirng class it is already overriden the equal method.
         */
        System.out.println(s1.equals(s2)); 




        /**
         * Here if we add the different object with same value it will add. and now LinkedHashset Contains the duplicate value
         * the reason behind this is when we working with custom class and we add the duplicate object (with same value) it will add.
         * because it is not check the value it check the memory address. so it will add.
         * 
         * When we work with the wrapper class it will check the value and does not add. because internally wrapper class 
         * override the hashcode method of object class. But in the custom class it is not overriden.
         * we have to explicitly override the method.
         */
        LinkedHashSet<family> set = new LinkedHashSet<>();
        set.add(f1);
        set.add(f2);
        System.out.println(set); // if we not overiden the method hashCode and  add the two object with same value it will add because hashing happend based on the memory address not in value.



    }
}
