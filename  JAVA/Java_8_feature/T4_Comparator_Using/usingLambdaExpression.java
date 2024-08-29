package Java_8_feature.T4_Comparator_Using;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class usingLambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(45);
        list.add(21);
        list.add(10);
        list.add(3);
        list.add(9);

        // using lambda expression we can sort the list becuse the compartor is a
        // functional interface
        // it contain only one abstract method called comapre so we can use lambda
        // expression

        // sorting into ascending order
        Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;
        Collections.sort(list, c);
        System.out.println(list);

        // sorting in the decending order
        Comparator<Integer> x = (i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0;
        Collections.sort(list, x);
        System.out.println(list);
    }
}
