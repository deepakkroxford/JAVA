package T11_Method_Overriding;

class Parents {
    // private methods are not overridden
    private void m1() {
        System.out.println("From parent m1()");
    }

    protected void m2() {
        System.out.println("From parent m2()");
    }

    //if we want to acces the private method so call in public method in same class
    public void display()
    {
        m1();
    }
}

class Childs extends Parents {
    // new m1() method

    // unique to Child class
    // it means that we can not override the base class method because base class
    // method is private so we can not override the method in subclass
    private void m1() {
        System.out.println("From child m1()");
    }

    // overriding method
    // with more accessibility
    //  we can override the protected method and we can also change the
    // visibility to public or protected but not defaul or private 
    @Override
    protected void m2() {
        System.out.println("From child m2()");
    }
}

public class Rule1 {
    public static void main(String[] args) {
        /*
         * 1. Overriding and Access Modifiers
         * The access modifier for an overriding method can allow more, but not less,
         * access than the overridden method.
         * For example, a protected instance method in the superclass can be made
         * public, but not private, in the subclass.
         * Doing so will generate a compile-time error.
         */

         Parents p = new Parents();
         p.display();
        Childs c = new Childs();
        c.m2();
    }
}
