
@FunctionalInterface
interface I1 {
    void run();
}

interface calculation{
    int add(int a, int b);
}

interface printing{
    String print(String s);
}

public class ex2 {
    public static void main(String[] args) {
        //using the annomus class
        I1 a = new I1(){
            @Override
            public void run() {
                System.out.println("the car is running");
            }
        };
        a.run();

        //calling directly using the lamdafunction 
        I1 b = ()->{
                System.out.println("the car is running");
            };
        b.run();


        calculation c = (int x, int y) -> {
            return x+y;
        };
        System.out.println(c.add(2, 3));

        calculation c1 = (int x, int y) ->{
            return x-y;
        };
        System.out.println(c1.add(2, 3));

        
        printing p =(s)->{
            return s.toUpperCase();
        };
        System.out.println(p.print("deepak"));
    }
}
