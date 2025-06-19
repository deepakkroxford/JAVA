
public class OrderOfexecution {
    static {
        System.out.println("Static initialization block 1");
    }

    {
        System.out.println("Instance initialization block 1");
    }

    public OrderOfexecution() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static initialization block 2");
    }

    {
        System.out.println("Instance initialization block 2");
    }
    public static void main(String[] args) {

        OrderOfexecution obj1 = new OrderOfexecution();
        System.out.println("--- Creating another object ---");
        OrderOfexecution obj2 = new OrderOfexecution();

        /*
         * • Order of Execution:
         * • Static initialization blocks run first when the class is loaded.
         * • Instance initialization blocks run before the constructor, each time an
         * instance of the class is created.
         * 
         * Instance block start running when we create the object of the class. Each time when we create the 
         * object it will run .
         * Constructor start running after the instance initialization block.
         */
    }
}
