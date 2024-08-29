package T9_Inheritance;

class A {
    public void methodA() {
        System.out.println("method of a class");
    }
}

class B extends A {
    public void methodB() {
        System.out.println("method of B class");
    }
}

// c has all property of class A ans B
// form c we can acess
class C extends B {
    public void methodC() {
        System.out.println("method of C class");
    }
}


//example 2
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

class I2_Multilevel_Inheritance {
    public static void main(String[] args) {
        C ob = new C();
        ob.methodC();
        ob.methodB();
        ob.methodA();

        BabyDog b = new BabyDog();
        b.bark();
        b.eat();
        b.weep();
    }
}