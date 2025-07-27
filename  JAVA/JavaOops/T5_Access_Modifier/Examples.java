


 class A1 {
    public String name;
    public int roll;

    public void printinfo()
    {
      System.out.println(name+" "+roll);
    }
    
}
public class Examples {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.name ="deepak";
        obj.roll=33;
        obj.printinfo();
    }
}
