package T20_InnerClass;

class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }


    class Engine {
        void start() {
            if(!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " engine started.");
            } else {
                System.out.println(model + " engine is already running.");
            }
        }

        void stop() {
            if(isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " engine stopped.");
            } else {
                System.out.println(model + " engine is already off.");
            }
        }
    }

}


public class MemberInner {
    public static void main(String[] args) {

        //creating the class class instance 
        Car car = new Car("Bmw m8");
        // using the outer class instance we can acces the inner class object and perform operations on it.
        Car.Engine engine  = car.new Engine();
        engine.start();
        engine.start();
        engine.stop();
        engine.stop();


    }
}
