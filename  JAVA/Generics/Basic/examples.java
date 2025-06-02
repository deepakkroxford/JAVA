package Generics.Basic;

class Student <N, A> {
    private N name;
    private A age;
    public Student(N name, A age) {
        this.name = name;
        this.age = age;
    }

    public N getName() {
        return name;
    }
    public A getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}

public class examples {
    public static <T> T getFirstElement(T[] array) {
        if (array == null || array.length == 0) {
            return null; // or throw an exception
        }
        for (T element : array) {
            System.out.println(element); // Return the first element
        }
        return array[0]; // This line is never reached, but added for completeness
    }
    public static void main(String[] args) {
        /**
         * Generic Class
         * Create a generic class Student with two type parameters N and A.
         * The class should have a constructor that takes two parameters: name of type N and age of type A.
         * The class should have methods to get the name and age, and a toString method that returns a string representation of the student.
         */
        Student<String, Integer> student1 = new Student<>("John Doe", 20);
        Student<Integer, String> student2 = new Student<>(12345, "Twenty"); 
        System.out.println(student1);
        System.out.println(student2);
        /**
         * Generic Method
         * Create a generic method that takes an array of any type and returns the first element of the array.
         */
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "World", "Generics"};
        System.out.println(getFirstElement(intArray)); // Output: 1
        System.out.println(getFirstElement(strArray)); // Output: Hello
    }
}
