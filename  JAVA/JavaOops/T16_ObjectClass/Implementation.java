package T16_ObjectClass;

class Car{
    String name;
    int price;
    
    public String toString()
    {
        return name+" "+price;
    }
}

public class Implementation {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name="Bmw";
        c1.price=100000;

        System.out.println(c1.getClass().getName());
        // if we do this we get the class name with some hexadecimal value so it dirctly call the toString  Method
    }
}
