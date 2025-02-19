import java.util.List;
import java.util.stream.Collectors;


public class StreamProblems {
    public static void main(String[] args) {

        // this the way we can find the even number from the list 
      List<Integer> l1 = List.of(1,2,3,4,4,5,5);
      List<Integer>ans =l1.stream().filter(i->i%2==0).collect(Collectors.toList());
      System.out.println(ans);

     // this the way we can find the sum of all the numbers in the list
     

        
    }
}
