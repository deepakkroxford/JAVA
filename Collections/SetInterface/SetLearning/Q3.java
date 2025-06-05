package Collections.SetInterface.SetLearning;

import java.util.HashSet;

public class Q3 {
    public static void main(String[] args) {
        /**
         * Question 3:
         * Find the union of the two sets
         * 
         * Input:
         * set1 = {1,2,3,4,5}
         * set2 = {3,4,5,6,7}
         * 
         * Output:
         * {1,2,3,4,5,6,7}
         * 
         * Input:
         * set1 = {1,2,3,4,5}
         * set2 = {1,2,3,4,5}
         *
         * Output:
         * {1,2,3,4,5}
         */
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        HashSet<Integer> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);
        System.out.println(set3);
    }
}
