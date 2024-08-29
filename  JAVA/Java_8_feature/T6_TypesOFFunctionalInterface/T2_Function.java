package Java_8_feature.T6_TypesOFFunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

class Friends {
    String name;
    int marks;

    public Friends(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class T2_Function {
    public static void main(String[] args) {
        Function<Integer, Double> half = a -> a / 2.0;
        // Applying the function to get the result
        System.out.println(half.apply(10));

        // square
        Function<Integer, Integer> F = x -> x * x;
        System.out.println(F.apply(3));

        Function<String, String> F1 = s -> s.toUpperCase(); // this will change into the upper case
        F1 = F1.andThen(s -> s.toLowerCase());// and then it will change into the lowecase
        System.out.println(F1.apply("aman singh rathore"));

        // Now i wnat to find the grade on the basis of the marks of the friends
        Function<Friends, String> obj = fri -> {
            int marks = fri.marks;
            String grade = "";
            if (marks > 80) {
                grade = "A[Distinction]";
            } else if (marks >= 60) {
                grade = "B[First class]";
            } else if (marks >= 50) {
                grade = "C[Second Class]";
            } else if (marks >= 35) {
                grade = "D[Third Class]";
            } else {
                grade = "E[failed]";
            }
            return grade;

        };

        Friends[] fri = { new Friends("Aman", 90),
                new Friends("Deepak", 45), new Friends("dipu", 70), new Friends("sumit", 90), new Friends("Aman", 78) };

        for (Friends friends : fri) {
            System.out.println("Student name :" + friends.name);
            System.out.println("Student marks :" + friends.marks);
            System.out.println("Student Grade :" + obj.apply(friends));
            System.out.println();
        }

        // now i want to show the student whose makes is greater than 60;

        Predicate<Friends> p = obj2 -> obj2.marks > 60;
        for (Friends friends2 : fri) {
            if (p.test(friends2)) {
                System.out.println("Student name :" + friends2.name);
                System.out.println("Student marks :" + friends2.marks);
                System.out.println("Student Grade :" + obj.apply(friends2));
                System.out.println();
            }

        }

        Function<Integer,Integer> square = squ->2*squ;
        Function<Integer, Integer> cube =cu ->cu*cu*cu;

        System.out.println(square.andThen(cube).apply(2)); //first square will happen then cube = 64
        System.out.println(square.compose(cube).apply(2)); // in this first cube will apply then square =16

    }
}
