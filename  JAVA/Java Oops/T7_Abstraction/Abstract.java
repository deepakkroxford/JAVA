package T7_Abstraction;

 abstract class car {
    // abstract method using abstract keyword and this method has no body
    abstract public void fueltype();

    abstract public int price();

    // concrete method with body
    public void color() {
        System.out.println("black");
    }

}

class Bmw extends car {

    public void fueltype() {
        System.out.println("petrol");
    }

    @Override
    public int price() {
        return 10000;
    }

}

public class Abstract {
    public static void main(String[] args) {
        Bmw b1 = new Bmw();
        b1.fueltype();
        b1.color();
        System.out.println(b1.price());
    }
}
