package T14_Thread;

class A extends Thread{
  
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("hii brother");

            // this mean  after executing one time it wait for 3000 milisecond 
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class B extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("hello dear");
        }
    }
}
public class example {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

       System.out.println(obj1.getPriority()); // so default priority of the thread is 5 and range is 1-10;
        
       obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try{
            obj1.join(); //so this will first excute the obj1 and then execute the obj2 

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        obj2.start();

    }
}
