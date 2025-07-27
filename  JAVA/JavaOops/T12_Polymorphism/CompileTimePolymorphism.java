package T12_Polymorphism;

class Calculator {
    public int add(int addend1, int addend2) {
        return addend1 + addend2;
    }

    public int add(int addend1, int addend2, int addend3) {
        return addend1 + addend2 + addend3;
    }
    public int add(double input1, double input2) {
        return (int) (input1 + input2);
    }
}

public class CompileTimePolymorphism {
    /**
     * Demonstrates the concept of Compile-Time Polymorphism (Method Overloading) in Java.
     * 
     * Method Overloading Rules:
     * 1. Methods must have the same name but different parameter lists (number, type, or order of parameters).
     * 2. Return type of the methods can be the same or different, but it does not play a role in distinguishing overloaded methods.
     * 3. Overloading is resolved at compile time, based on the method signature.
     * 
     * In this example:
     * - The `add` method is overloaded to handle different types and numbers of arguments:
     *   - Two integers.
     *   - Three integers.
     *   - Two double values.
     */
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + calculator.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5: " + calculator.add(2.5, 3.5));
    }
}
