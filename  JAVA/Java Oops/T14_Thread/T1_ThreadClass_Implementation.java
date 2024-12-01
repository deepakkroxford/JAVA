package T14_Thread;

/*
 * we can make thread in two ways the 
 * first one is extending thread class and
 * Second is using runnable interface
 */

class Mythread extends Thread{

        @Override
        public void run() // this is the method in the thread class we overide in the child class
        {

            //what ever we wirte the code in this method is called as job 
            for(int i=0;i<10;i++)
            {
                System.out.println("child thread");
               
            }
            try
            {
                Thread.sleep(1200); // it means that the each chlid thread execute after 1200 mili second in gap
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
       
        public void fast()
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("hii");
            }
           
        }
    }

    class Deepak extends Thread{
        @Override
        public void run(){
            for(int i=0;i<10;i++)
            {
                System.out.println("Deepak thread");
            }
            try
            {
                Thread.sleep(1500); // it means that the each Deepak thread execute after 1500 mili second in gap
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }


        public void speek()
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("deepak speaking");
            }
        }
    }

 public class T1_ThreadClass_Implementation {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        t.fast();


        Deepak d = new Deepak();
        d.start();
        d.speek();
        
        /*
         * Note 
         * if we execute the run method that is overideen form thread class and  fast method the we define when we run both
         * so output will be mix or alterantive
         * 
         */
    }
}
