package T11_Method_Overriding;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


class Parent
{
    void show()
    {
        System.out.println("parent show");
    }
}

class Child extends Parent
{
    void show()
    {
        System.out.println("child show");
    }

    void display()
    {
        show();

        //this will call parent class show method because we are using super keyword
        super.show();
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); 


        Parent s = new Parent();
        s.show();

        Child c = new Child();
        c.show();
        c.display();
    }
}
