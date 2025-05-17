package Generics.ClassAndMethod;

class Car<T, I> {
    private T model;
    private I speed;

    public Car(T model, I speed) {
        this.model = model;
        this.speed = speed;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public I getSpeed() {
        return speed;
    }

    public void setSpeed(I speed) {
        this.speed = speed;
    }
}

class Printer {
    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}

public class implementation {
    public static void main(String[] args) {
        Car<String, Integer> c1 = new Car<>("BMW", 102);
        System.out.println(c1.getModel());
        System.out.println(c1.getSpeed());

        Car<Integer, String> car2 = new Car<>(12345, "Fast");
        System.out.println(car2.getModel()); // 12345
        System.out.println(car2.getSpeed()); // Fast

        Car<Boolean, Float> car3 = new Car<>(true, 120.8f);
        System.out.println(car3.getModel()); // true
        System.out.println(car3.getSpeed()); // 120.8

        /**
         * Key point:
         * Generics let you create flexible, reusable classes and methods that work with
         * any types you specify.
         */


    Integer[] intArray = {1, 2, 3, 4, 5};
    String[] strArray = {"Hello", "World"};
    Double[] doubleArray = {1.1, 2.2, 3.3};
    int arr[] = {1,2,3,421,212,3,2};

    System.out.println("Printing Integer Array:");
    Printer.printArray(intArray);

    System.out.println("Printing String Array:");
    Printer.printArray(strArray);

    System.out.println("Printing Double Array:");
    Printer.printArray(doubleArray);

    // System.out.println("Printing the int array");
    // Printer.printArray(arr);  in java genrics does not support the int only support the wrapper class
    }
}
