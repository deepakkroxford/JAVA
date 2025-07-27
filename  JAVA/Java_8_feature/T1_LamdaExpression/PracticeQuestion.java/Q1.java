package PracticeQuestion.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<String > l = Arrays.asList("aman","vishal","harshit");
        l.sort((s1,s2)-> s1.compareToIgnoreCase(s2));
        System.out.println(l);

        //Filter all even numbers from a list using Lambda

        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> res = l1.stream().filter(n->n%2==0).collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
    }
}
