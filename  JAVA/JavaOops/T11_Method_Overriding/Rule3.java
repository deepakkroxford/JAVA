package T11_Method_Overriding;

class Parentw {
    static void m1() {
        System.out.println("From parent static m1()");
    }

    void m2() {
        System.out.println("From parent non-static(instance) m2()");
    }
}

class Childw extends Parentw {

    static void m1() {
        System.out.println("From child static m1()");
    }

    @Override
    public void m2() {
        System.out.println("From child non-static(instance) m2()");
    }
}

public class Rule3 {
    public static void main(String[] args) {
        Parentw obj1 = new Childw();

        obj1.m1(); // Calls Parent's static method
        obj1.m2(); // Calls Child's instance method

    }
}
/*
 * This example illustrates the difference between method overriding and method
 * hiding in Java, particularly with static methods.
 * 
 * Key Concepts Demonstrated
 * Static Methods and Method Hiding:
 * 
 * Static methods in Java are associated with the class, not instances of the
 * class. When a subclass defines a static method with the same signature as a
 * static method in the superclass, it hides the superclass's method instead of
 * overriding it.
 * The decision about which static method to call is made at compile-time based
 * on the reference type, not the object type.
 * Instance Methods and Method Overriding:
 * 
 * Instance methods (non-static methods) can be overridden by subclasses. When
 * an overridden method is called on an object, the method of the object's
 * runtime type is invoked, regardless of the reference type.
 * This decision is made at runtime, enabling polymorphic behavior.
 * 
 * 
 * Parent class has two methods: a static method m1 and a non-static method m2.
 * Child class also has two methods with the same signatures: a static method m1
 * and a non-static method m2. However, since m1 is static, it hides the m1
 * method in Parent, and since m2 is non-static, it overrides the m2 method in
 * Parent.
 * 
 * 
 * Static Method Call (obj1.m1()):
 * 
 * Parent obj1 = new Child(); creates a Child object but assigns it to a Parent
 * reference.
 * obj1.m1() calls the static method m1 defined in Parent because static method
 * calls are resolved at compile-time based on the reference type (Parent), not
 * the object type (Child).
 * Output: From parent static m1()
 * 
 * 
 * Instance Method Call (obj1.m2()):
 * 
 * obj1.m2() calls the overridden instance method m2 in Child because instance
 * method calls are resolved at runtime based on the actual object type (Child),
 * enabling polymorphism.
 * Output: From child non-static(instance) m2()
 * 
 */
