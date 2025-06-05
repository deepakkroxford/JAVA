package Collections.SetInterface.TreeSetLearning;

import java.util.TreeSet;

public class Implementation {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(40);
        treeSet.add(50);
        treeSet.add(60);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.pollFirst();
       

        System.out.println(treeSet);
        System.out.println(treeSet.contains(30));
        System.out.println(treeSet.getFirst()); // it give the first element of the treeSet
        System.out.println(treeSet.getLast()); // it give the last element of the treeSet
        System.out.println(treeSet.ceiling(60)); // it give the element which is greater than or equal to the given element
        System.out.println(treeSet.floor(20)); // it give the element which is less than or equal to the given element
        System.out.println(treeSet.higher(20)); // it give the element which is greater than the given element
        
    }
}
