


class B{
    private String name;
    private int roll;


    B(String name, int roll)
    {
         this.name = name;
         this.roll = roll;
    }
    public void printinfo()
    {
      System.out.println(name+" "+roll);
    }
}

public class Example2 {
    public static void main(String[] args) {
       B obj  = new B("aman",33);
       //obj.name="deepakk"; 
       //this we can not do because priavte can be access with in the same class
      obj.printinfo();
    }
}
