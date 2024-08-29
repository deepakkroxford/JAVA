package Java_8_feature.T6_TypesOFFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employe {
    String name;
    int salary;

    Employe(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }

}

class Student {
    String name;
    int id;
    float marks;

    Student(String name, int id, float marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
}

public class T1_PredicateFunction {
    public static void main(String[] args) {
        /*
         * predicate method only contain the Test method
         * and it return the boolen like true or false
         */

        // here we defining the predicate functional interface and
        // type of this method is Integer and so it is functional interface so we can
        // use the lambda expression.
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(7));

        // Using Predicate with Collections here in this case we use the List of number
        // and find the number that is even and using stream filter method we collect
        // the even number as the list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> Even = num -> num % 2 == 0;
        List<Integer> evenNumbers = numbers.stream()
                .filter(Even)
                .collect(Collectors.toList());

        System.out.println(evenNumbers); // [2, 4, 6, 8, 10]

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve","x");
        Predicate<String> isShortName = name -> name.length() <= 3;

        List<String> shortNames = names.stream()
                .filter(isShortName)
                .collect(Collectors.toList());

        System.out.println(shortNames); // [Bob, Eve]

        // write a prdicate to check whether the length of the string is greater than 5
        // or not
        
        Predicate<String> lengthchecking = s -> s.length() > 5;
        // here we check the length and call the test method of the predicate class
        System.out.println(lengthchecking.test("tesknsdkjfadfsjkn"));

        // Now we create the sting and using prdicate we check the length if it is
        // greater then we print the the stirng
        String[] ans = { "amana", "deepak", "Boss", "Hero", "King", "Bindaadd", "aaa", "dsjbf" };
        Predicate<String> s = x -> x.length() > 5;
        for (String string : ans) {
            if (s.test(string)) {
                System.out.println(string);
            }
        }

        ArrayList<Employe> cse = new ArrayList<>();
        cse.add(new Employe("Aman", 1000));
        cse.add(new Employe("Boss", 434000));
        cse.add(new Employe("Aman", 103200));
        cse.add(new Employe("Deepak", 100320));
        cse.add(new Employe("Singh", 12320));
        cse.add(new Employe("Boom", 11120));
        cse.add(new Employe("Hero", 00320));

        // now i want to make a list of employe whose salary is more than 50000
        Predicate<Employe> e = y -> y.salary > 5000;

        for (Employe employe : cse) {
            if (e.test(employe)) {
                System.out.println(employe.salary + " " + employe.name);
            }
        }

        // for (Employe employe : cse) {
        // if (employe.salary > 5000) // we can also write this
        // {
        // System.out.println(employe.salary + " " + employe.name);
        // }
        // }

        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student("Deepak", 1, 54));
        stu.add(new Student("Harshit", 2, 90));
        stu.add(new Student("Ashish", 3, 79));
        stu.add(new Student("amit", 4, 26));
        stu.add(new Student("sumit", 5, 34));
        stu.add(new Student("nandani", 6, 24));

        Predicate<Student> obj = z->z.marks>35;
        for (Student student : stu) {
            if(obj.test(student))
            {
                System.out.println(student.name+" "+student.marks+" "+student.id);
            }
        }

        //check wheter the number is even or not 
        int arr[] ={10,2,3,4,5,23,22,5,2,5,2,90,34,1232,32,121};
        Predicate<Integer> even = y->y%2==0 && y>10;
        for (int i : arr) {
        if(even.test(i))
        {
            System.out.println(i);
        }

    }


    }
}
