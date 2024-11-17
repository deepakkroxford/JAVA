class Hii implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Hii from child Thread ");
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {

        //we can implemet Runnable interface using the lambda expression
        Runnable r =()->{
            for(int i=0;i<=10;i++)
            {
                System.out.println("child thread 1");
            }
        };
        Thread x= new Thread(r);
        x.start();

        
        //old way to implement where we make class that implement the the Runnable interface and override the run method 
        Hii hi = new Hii();
        Thread t = new Thread(hi);
        t.start();
       
       
        for(int i=0;i<=10;i++)
        {
            System.out.println("hii form the main thread");
        }
        
    }
}
