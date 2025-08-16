
interface Animal {
    void speed();
}

public class DiffBetweenAnonymousAndLambda {

    int x = 888;
    public void m1() {
        Animal animal = new Animal() {
            int x = 999;
            @Override
            public void speed() {
                System.out.println("Animal speed"+ this.x); // this.x refers to the x in the anonymous class
            }
        };
        animal.speed();
    }


    public void m2() {
        Animal animal =()->{
            int x = 555; // this x is local to the lambda expression
            // it does not affect the x in the DiffBetweenAnonymousAndLambda class
            System.out.println("Animal speed using lambda"+ this.x);
        };
        animal.speed(); // this.x refers to the x in the DiffBetweenAnonymousAndLambda class, not the lambda expression
    }
    public static void main(String[] args) {
        DiffBetweenAnonymousAndLambda obj = new DiffBetweenAnonymousAndLambda();
        obj.m1();
        obj.m2();
    }
}
