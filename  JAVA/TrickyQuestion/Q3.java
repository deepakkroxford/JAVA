package TrickyQuestion;
// class Vehicle{  // parent class 
//     public void drive()
//     {
//         System.out.println("vechile driving");
//     }
// }

// class Car extends Vehicle{ //child class
//     @Override 
//     public void drive()
//     {
//         System.out.println("car Driving");
//     }
//     public void playmusic()
//     {
//         System.out.println("playing music in car");
//     }
// }
public class Q3 {
    public static void main(String[] args) {
        Vehicle v  = new Car();
        v.drive();
       // v.playmusic(); // we can not access the this method 
       // so it give the compile time error
    }
}
