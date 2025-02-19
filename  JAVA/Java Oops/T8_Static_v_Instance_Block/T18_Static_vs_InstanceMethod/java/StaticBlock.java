

class Bom {
    static int var;
    static {
        var = 10;
        System.out.println("in static block " + var);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        /*
         * A static block in Java is a special block of code that belongs to a class
         * rather than to instances (objects) of the class.
         * It’s used for initializing static variables or performing any one-time
         * actions that should be executed when the class is loaded into memory
         */
        Bom obj1 = new Bom();
        System.out.println(Bom.var);// we can directky acces the static variable
        /*
         * 
         * Benefits of Using Static Initialization Blocks
         * 
         * • Initialization of Static Variables: Convenient way to initialize static
         * variables based on complex logic or external resources.
         * • One-Time Setup: Useful for performing one-time setup tasks such as loading
         * configuration files, initializing static data structures, or initializing
         * logging frameworks.
         * • Error Handling: Can handle exceptions and errors during class
         * initialization by catching them inside static blocks.
         * 
         * 
         */

    }
}
