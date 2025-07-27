package MutliThreadingConecpt;

public class Banking extends Thread {
    @Override
    public void run() {
        System.out.println("The Banking work is Started.....");
        for(int i=0;i<5;i++) {
            try {
                System.out.println("Banking" + i);
                Thread.sleep(1000);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
