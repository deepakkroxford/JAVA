package MutliThreadingConecpt;

public class Adding extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            try{
            System.out.println("Adding"+i);
            Thread.sleep(1000);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
