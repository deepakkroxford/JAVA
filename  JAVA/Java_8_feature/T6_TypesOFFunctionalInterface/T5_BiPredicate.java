package Java_8_feature.T6_TypesOFFunctionalInterface;

import java.util.function.BiPredicate;

public class T5_BiPredicate {
    public static void main(String[] args) {
        // we use bipredicate function when we have to use two input argument
        // like in this we use two integer and and them and check whether it is
        // even or not and it return the boolean function
        BiPredicate<Integer, Integer> add = (a, b) -> (a + b) % 2 == 0;
        System.out.println(add.test(23, 23));
        System.out.println(add.test(23, 2));
    }
}
