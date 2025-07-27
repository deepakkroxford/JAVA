package T2_Methods;

class Computer {

    // this is a method and its return type is void it means it not return anything
    public void play() {
        System.out.println("play music.....");
    }

    // this is a method and its return type is string
    public String cost(int cost) {
        if (cost <= 10) {
            return "pen";
        } else {
            return "not valid";
        }

    }
}

public class T1_Method {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.play();
        String x = c.cost(100);
        System.out.println(x);
    }

}