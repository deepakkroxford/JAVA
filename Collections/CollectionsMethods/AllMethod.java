package Collections.CollectionsMethods;

import java.util.ArrayList;
import java.util.Collections;

public class AllMethod {
    public static void main(String[] args) {
        /**
         * sort() method
         */
         ArrayList<Integer> list = new ArrayList<>();
         list.add(6);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         list.add(1);
         Collections.sort(list);
         System.out.println(list);
         /**
          * binarySearch() method
          */
          int index = Collections.binarySearch(list, 3);
          System.out.println(index);
          /**
           * max() method
           */
           int max = Collections.max(list);
           System.out.println(max);
           /**
            * min() method
            */
            int min = Collections.min(list);
            System.out.println(min);
            /**
             * reverse() method
             */
            Collections.reverse(list);
            System.out.println(list);
            /**
             * fill() method
             */
            Collections.fill(list, 10);
            System.out.println(list);
            /**
             * copy() method
             */
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(2);
            list2.add(3);
            list2.add(4);
            list2.add(5);
            list2.add(6);
            Collections.copy(list2, list);
            System.out.println(list2);
            /**
             * replaceAll() method
             */
            Collections.replaceAll(list2, 10, 11);
            System.out.println(list2);
            /**
             * swap() method
             */
            Collections.swap(list2, 0, 1);
            System.out.println(list2);
            /**
             * rotate() method
             */
            Collections.rotate(list2, 2);
            System.out.println(list2);
            /**
             * shuffle() method
             */
            Collections.shuffle(list2);
            System.out.println(list2);
            /**
             * frequency() method
             */
            int frequency = Collections.frequency(list2, 11);
            System.out.println(frequency);
            /**
             * disjoint() method 
             */
            boolean disjoint = Collections.disjoint(list2, list);
            System.out.println(disjoint);
         
    }   
}
