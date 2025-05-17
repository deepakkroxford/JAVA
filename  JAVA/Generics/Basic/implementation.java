package Generics.Basic;

import java.util.ArrayList;

public class implementation {
    public static void main(String[] args) {

        /**
         * Before Java 5, we could put any value in the list since the type of elements
         * in ArrayList (or any collection) was Object. When working with these values,
         * we had to manually cast the objects to their appropriate types.
         */
        ArrayList arr = new ArrayList<>();
        arr.add("Deepak Kumar Singh");
        arr.add(898);
        arr.add(213.90);

        Object o = arr.get(0); // The element is of Object type, but we know it's a String
        // To use the element as a String, we need to manually type cast it
        String s = (String) arr.get(0);
        System.out.println(s);

        System.out.println(arr.get(0));

        /**
         * After java5 we can define type in the collection, so there is not runtime
         * error.
         * It provide the type saftey at compile time.
         */

        ArrayList<Integer> arr1 = new ArrayList<>();
        // arr1.add("Hi how are u"); // gives the compile time error
        arr1.add(21);
        arr1.add(34);
        arr1.add(23421);
        Integer y = arr1.get(2); // autoboxing - Integer to int conversion no manual type casting.
        int x = y; // unboxing - Integer to int conversion
        System.out.println(x);

    }
}
