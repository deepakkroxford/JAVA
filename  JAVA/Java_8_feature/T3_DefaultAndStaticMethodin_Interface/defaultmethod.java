package Java_8_feature.T3_DefaultAndStaticMethodin_Interface;

/**
 * Innerimplementation
 */
interface i1 {
    default void run() {
        System.out.println("i1 running");
    }

}

interface i2 {
    default void run() {
        System.out.println(" i2 running");
    }
}

public class defaultmethod implements i1, i2 {
    // this will give error because it will create ambiguity and confuse which run
    // method to call. we can solve this by makeing own method and call using super key word which run method
    //we want to run like i1,or 12 or if we want to give you own implementaion so you can also do it
    public static void main(String[] args) {
        defaultmethod im = new defaultmethod();
        im.run();
    }
 // to solve this we can make our method
    @Override
    public void run() {
        i1.super.run();
    }
}
