package MutliThreadingConecpt;

public class Printing extends Thread {
    @Override
    public void run() {
        System.out.println("The Printing work is started.....");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Printing" + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }


}
