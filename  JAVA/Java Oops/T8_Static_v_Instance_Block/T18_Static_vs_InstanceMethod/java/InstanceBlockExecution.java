package T8_Static_v_Instance_Block.T18_Static_vs_InstanceMethod.java;

//example one 
class InstansceExample {
    int instanceVariable;

    {
        instanceVariable = 19;
        System.out.println("Instance Block executed");
    }

    public InstansceExample() {
        System.out.println("this is constructor of instance calss");
    }

    public int square() {
        return instanceVariable * instanceVariable;

    }
}

// example two so instance block run before the constructor
class InitializationOrder {
    int a;

    // then the constructor will run after the instance block
    public InitializationOrder() {
        System.out.println("Constructor: a=" + a);
    }

    // it will run first
    {
        a = 10;
        System.out.println("Instance block: a=" + a);
    }
}

public class InstanceBlockExecution {

    public static void main(String[] args) {

        InstansceExample obj1 = new InstansceExample();
        InstansceExample obj2 = new InstansceExample();
        /*
         * Note: Output
         * Instance block executed.
         * Constructor executed.
         * Instance block executed.
         * Constructor executed.
         * 
         * Instance Block
         * • Runs every time an instance of the class is created.
         * • Used for initializing instance variables.
         * • Useful for setup operations that should run for every object creation.
         */
        System.out.println(obj1.square());

        InitializationOrder obj = new InitializationOrder();
        /*output:
         * Instance block: a=10
         * Constructor: a=10
         */

        /*
         * Instance Initialization Block
         * • Runs before the constructor.
         * • Ensures common initialization code runs for all constructors.
         * • Can simplify complex initialization logic.
         */

         /*
          * we can not define any method inside the instance block
          */
    }
}
