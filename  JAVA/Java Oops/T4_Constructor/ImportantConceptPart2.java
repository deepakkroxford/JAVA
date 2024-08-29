package T4_Constructor;

class ImportantConcptPart2 {
    private int value;

    public ImportantConcptPart2(int value) {
        this.value = value;
        System.out.println("Constructor called. Value: " + this.value);
        myStaticMethod(); // Call the static method from the constructor.
    }

    public static void myStaticMethod() {
        System.out.println("This is a static method.");
    }

}

public class ImportantConceptPart2 {
    public static void main(String[] args) {
        // Creating an instance calls the constructor and the static method.
        ImportantConcptPart2 obj = new ImportantConcptPart2(10);

        /*
         * While you cannot define a static method inside a constructor, you can call a
         * static method from within a constructor if needed.
         */
    }
}
