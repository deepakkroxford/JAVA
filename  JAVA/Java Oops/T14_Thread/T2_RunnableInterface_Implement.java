package T14_Thread;

//the runnable is a interface and its has a abstract method called run () that we are implementing
class Myrunnable implements Runnable{
    
    @Override 
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("runable ");
        }
       
    }
}
public class T2_RunnableInterface_Implement {
    public static void main(String[] args) {
        Myrunnable r = new Myrunnable();
        Thread t = new Thread(r);
        t.start();
      
        try{
            t.join(); // so this join methd is used to stop executing the other thraed until one complete
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        for(int i=1;i<=20;i++)
        {
            System.out.println(i);
        }
    }
}
