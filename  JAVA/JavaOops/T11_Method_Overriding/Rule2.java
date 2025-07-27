package T11_Method_Overriding;

class Dogs{

    // can not be overriden
   final void dog()
    {
        System.out.println("parent dog...");
    }
    
}

class BabyDog extends Dog
{
    //it will show error if we use final also it will show error
    // public void dog()
    // {
    //     System.out.println("baby dog.....");
    // }
}
public class Rule2 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
