
interface a{
   public void run();
}
interface b
{
   public void run();  
}

class c implements a,b{
  @Override
   public void run()
    {
        System.out.println("c run running");
    }
}
public class Multiple_InheritanceUsingInterface {
    public static void main(String[] args) {
        c oj1 = new c();
        oj1.run();
    }
}
