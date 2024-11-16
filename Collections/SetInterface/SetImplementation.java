package Collections.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementation {

    public static void main(String[] args) {

        Set<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(10); // Duplicates are automatically removed
        hs.add(null); // Null values are allow in the set but at once

        // so the Set not allow the duplicates.....
        /*
         * insertion oreder are not maintained
         * duplictation is element is not allowed
         * null values are also allowed in the set but at once
         * HashSet is not synchronized
         * Time complexity is of all opertaions
         * 
         * Summary of Time Complexity:
         * Operation AverageCase Worst Case
         * 
         * add(E e) O(1) O(n)
         * remove(Object o) O(1) O(n)
         * contains(Object o) O(1) O(n)
         * size() O(1) O(1)
         * clear() O(n) O(n)
         * Iterating over set O(n) O(n)
         * 
         * 
         * HashSet is not thread safe and it is not schncronisized....
         */

        System.out.println(hs);

        Set<Integer> lh = new LinkedHashSet<>();
        lh.add(10);
        lh.add(20);
        lh.add(30);
        lh.add(40);
        lh.add(50);
        lh.add(10); // Duplicates are automatically removed
        lh.add(null);

        /*
         * Duplicates are not allowed
         * Insertion order is maintained
         * null is allowed
         * It is Not Synchronized
         * Not the thread safe
         * time complexity is same as HashSet
         */
        System.out.println(lh);

        Set<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(6);
        ts.add(16);
        ts.add(50);
        ts.add(10); // Duplicates are automatically removed

        /*
         * Insertion order is not maintained
         * It doesn't allow the duplicate elements to be inserted
         * It gives the output in the sorted order
         * Null value is not allowed in the TreeSet
         * It is not synchronized
         * It is not thread-safe
         * 
         * 
         * time complexity:
         * add() -> O(log n)
         * remove() -> O(log n)
         * contains -> O(log n)
         * 
         * Note:
         * The TreeSet in Java is internally implemented using a Red-Black Tree,
         * which is a type of self-balancing binary search tree.
         */

        System.out.println(ts);

    }
}