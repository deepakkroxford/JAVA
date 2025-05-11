package T13_ExceptionHandling;

class IllegalAgeException extends Exception {

    //this is the constructor of the class
    public IllegalAgeException (String message) {
        super(message);
    }
}

public class CustomException {
    // this method checks if the age is less than 18 and here we are using the custom exception
    public static void checkAge(int age) throws IllegalAgeException {
        if (age < 18) {
            throw new IllegalAgeException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(13); // This will throw the custom exception
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage()); // Print the custom exception message
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
