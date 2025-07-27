package T9_Inheritance;
class Bird{
   String name;
   public void sound()
   {
    int c=10;
    System.out.println("koo.. Koo..");
   }
   
}

class Sparrow extends Bird
{
    public void fly()
    {
        System.out.println("fly high....");
    }
}
public class I1_Single_Inheritance {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.fly();
        s.sound();
        s.name ="bahdb cahwbfy";
        
        int y = 10/0;
    }

    
}
