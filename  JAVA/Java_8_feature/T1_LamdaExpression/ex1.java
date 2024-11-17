
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Square {
public int square(int n);
    
}

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class ex1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("grapes");
        fruits.add("sugercane");
        fruits.add("papya");
        System.out.println(fruits);
        /*
         * using lambda expresssion we can print the list 
         */
        fruits.forEach((n)->{System.out.println(n);});

      Square s =(int n)->n*n;
      System.out.println(s.square(3));

      //their is no extra .class file will be generated for the lambda expression

      Greeting greeting =(String S)->System.out.println("hello "+S);
      greeting.sayHello("world");
      

    }
}
