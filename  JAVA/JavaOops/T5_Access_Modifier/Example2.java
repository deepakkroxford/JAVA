


class B1{
    private String name;
    private int roll;


    B1(String name, int roll)
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
       B1 obj  = new B1("aman",33);
       //obj.name="deepakk"; 
       //this we can not do because priavte can be access with in the same class
      obj.printinfo();
    }
}
