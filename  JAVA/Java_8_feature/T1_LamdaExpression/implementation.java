package Java_8_feature.T1_LamdaExpression;

import java.util.ArrayList;

@FunctionalInterface
// using lambda expression we can directy use the abstract method we do not need
// to make the
// extra class for its implementation
interface car {
    void run();
}



/**
 * Innerimplementation
 */
interface myinterface {
    void hii(String s);
}

@FunctionalInterface
// For a functional interface with a method that takes multiple parameters:
interface MathOperation {
    int operate(int a, int b);

    public static void add() {
        System.out.println("adding number");
    }

    // private void hii()
    // {
    // System.out.println("hii i am private");
    // }
}

// class Bugatti implements car {
// public void run() {
// System.out.println("car is running fast");
// }

// public int str(String st){ return st.length();
// }
// }

public class implementation {
    public static void main(String[] args) {
        car b = () -> System.out.println("hello lambda");
        b.run();

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(5);
        ans.add(4);
        ans.add(17);
        ans.add(87);
        System.out.println(ans);
        ans.forEach((n) -> {
            System.out.println(n);
        });

        // if the functional interface has a method that takes parameters, the lambda
        // expression can include these parameters:
        myinterface ss = (String s) -> System.out.println(s);
        ss.hii("Hello, Lambda with Parameters!");

        MathOperation mat = (int x, int y) -> x + y;
        MathOperation mat1 = (x, y) -> x * y;
        System.out.println(mat.operate(23, 56));
        System.out.println(mat1.operate(21, 3));
        MathOperation.add();

    }
}
