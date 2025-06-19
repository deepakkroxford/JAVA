class IceCream{
   private String name;
   private int price;
   private int quantity;

   public IceCream(String name) {
    this.name = name;
    price=0;
    quantity=0;
   }
   public IceCream(String name, int price){
    this(name);
    this.price = price;
    quantity=0;
   }

    public IceCream(String name, int price, int quantity) {
        this(name, price);
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "The name of the icecream is: " + name + " and price is: " + price + " and quantity is: " + quantity;
    }
}

public class UsingThisInConstructor {
    public static void main(String[] args) {
        IceCream obj1 = new IceCream("Vanella", 50, 12);
        System.out.println(obj1);

        IceCream obj2 = new IceCream("Chocolate");
        System.out.println(obj2);
    }
}
