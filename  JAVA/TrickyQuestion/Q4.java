package TrickyQuestion;
class Vehicle{  // parent class 
    public void drive()
    {
        System.out.println("vechile driving");
    }
    public void playmusic()
    {
        System.out.println("singi a song");
    }
}

class Car extends Vehicle{ //child class
    @Override 
    public void drive()
    {
        System.out.println("car Driving");
    }
    public void playmusic()
    {
        System.out.println("playing music in car");
    }
}
public class Q4 {
    public static void main(String[] args) {
        Vehicle v = new Car(); // it will work
        v.drive();
        v.playmusic();

    }
}
