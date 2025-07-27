package MutliThreadingConecpt;

public class Main {
    public static void main(String[] args) {
            Adding a = new Adding();
            a.run();
            Banking b = new Banking();
            b.run();
            Printing p = new Printing();
            p.run();

    }
}
