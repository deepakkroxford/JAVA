package SingletonClass;

/*
 * Sigleton class in java is a design pattern that we use . So in singleton class we can not create a multiple 
 * instance of SingletonClass , we can only create a single instance. To achive this functionality we have to 
 * follow some steps :
 * Key Features of Singleton Class

Private Constructor → Prevents creating multiple objects.
Static Instance Variable → Stores the single instance.
Public Static Method → Provides access to the instance.

When Do We Use a Singleton Class?
Database Connection – Ensure only one connection is used throughout the program.
Logging System – Only one log manager should handle logs.
Cache Management – Prevent redundant data storage.
Configuration Settings – Store app-wide settings in a single instance.

Q So I can say that in the singleton class we can create only on instance of the class if not existed ?
sol: Yes, exactly! In a Singleton class, we can create only one instance of the class if it does not already exist. 
If an instance already exists, the class will return the same instance  instead of creating a new one.
 */
class Singleton {
    private static Singleton instance; // Static instance of the class

    // Private constructor to prevent instantiation using new key word
    private Singleton() {
    }

    // Public method to provide global access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create instance if not already created
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class implementation {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

       System.out.println(obj1==obj2); // true (same memory location)
       // if singleton class is not use so the memory location is diffrent and it give false. beacuse we are using new key word for creating a new instance 
       // and their memory location is different from each other.


    }
}
