package T1_ClassMaking;

class Student {
    String name;
    int id;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.id);
    }
}

class Car
{
    String brand;
    String color;
    int price;

    public void infoCar()
    {
        System.out.println(this.brand);
        System.out.println(this.color);
        System.out.println(this.price);
    }

}

public class Bassic {
    public static void main(String[] args) {
       Student st = new Student();
       st.name="amansingh";
       st.id=90;
       st.printinfo();


       Car car = new Car();
       car.infoCar(); // this give us the vlaue null
       car.brand="bmw";
       car.color="black";
       car.price=199999;
       car.infoCar(); // this give us the actual value that we set
       
    }

}