package Generics.ClassAndMethod;

class ArithmaticOperation<T extends Number> {  // T extedn number menas we can only put the number like Float , double , Integer , now we can not put String
    // it is a  bounded generic class because you have restricted the type parameter T with a bound:
    private T value1;
    private T value2;

    public ArithmaticOperation(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }

    public enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    public double operation(Operation op) {
        double num1 = value1.doubleValue();
        double num2 = value2.doubleValue();

        switch (op) {
            case ADD:
                return num1 + num2;

            case SUBTRACT:
                return num1 - num2;

            case MULTIPLY:
                return num1 * num2;

            case DIVIDE:
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return num1 / num2;

            default:
                throw new UnsupportedOperationException("Operation not supported");
        }
    }
}

public class Example3 {
    public static void main(String[] args) {
        ArithmaticOperation<Integer> op = new ArithmaticOperation<>(10, 5);

        System.out.println("Add: " + op.operation(ArithmaticOperation.Operation.ADD));         // 15.0
        System.out.println("Subtract: " + op.operation(ArithmaticOperation.Operation.SUBTRACT)); // 5.0
        System.out.println("Multiply: " + op.operation(ArithmaticOperation.Operation.MULTIPLY)); // 50.0
        System.out.println("Divide: " + op.operation(ArithmaticOperation.Operation.DIVIDE));     // 2.0
    }
}
