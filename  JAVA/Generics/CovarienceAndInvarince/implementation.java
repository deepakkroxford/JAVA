package Generics.CovarienceAndInvarince;

import java.util.*;

public class implementation {

    public static Integer calculatingSum(List<Number> listElement) {
        int sum = 0;
        for (Number value : listElement) {
            sum = sum + value.intValue();
        }
        return sum;
    }

    public static <T extends Number> Double anyTypeSum(List<T> listElement) {
        double sum = 0;
        for (T value : listElement) {
            sum = sum + value.doubleValue();
        }
        return sum;
    }

    // this is also valid and it also work with any type of the number
    public static Double UsingWildCard(List<? extends Number> listElement) {
        double sum = 0;
        for (Number value : listElement) {
            sum = sum + value.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Number> l1 = Arrays.asList(1, 23, 123, 11);
        System.out.println(calculatingSum(l1));

        // List<Integer> l = new ArrayList<>();
        // l.add(12);
        // l.add(15);
        // l.add(121);
        // System.out.println(calculatingSum(l)); not allowed you have to pass number
        // only

        // List<Number> l2 = new ArrayList<Integer>(); // this line give error generics
        // are invarience. same type should be there.

        /**
         * To work with any type we have to extend the number class
         */

        System.out.println(anyTypeSum(l1));

        List<Integer> l3 = new ArrayList<>();
        l3.add(12);
        l3.add(15);
        l3.add(121);
        System.out.println(anyTypeSum(l3));

        List<Double> l4 = new ArrayList<>();
        l4.add(12.2);
        l4.add(15.12);
        l4.add(121.90);
        System.out.println(anyTypeSum(l4));

    }
}
