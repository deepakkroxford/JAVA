import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class implementation {
    public static void main(String ...args) {
        List<Integer> l = Arrays.asList(10, 20, 30, 40, 2, 19, 2, 11, 2, 3, 4, 5, 6);
        // i want to return the the number of list that is greter tha 10
        List<Integer> filteredList = l.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());
        System.out.println("Filtered List: " + filteredList);


        //now i want to filter the even number from the list and the number shoud be greater than 10
        List<Integer> evenlList = l.stream().filter(x->x%2==0 && x>10).collect(Collectors.toList());
        System.out.println(evenlList);

        //Map finction use
        List<Integer> marks = Arrays.asList(23,45,32,23,121,21,231,33,42,32,3,4,4223,23,21212,12,3213);
        //if we want to update the every object in the list so we can use the map function
        List<Integer> updatedMarks = marks.stream().map(x->x*2).collect(Collectors.toList());
        System.out.println(updatedMarks);
        var x=10.0212;
        System.out.println(x);
        

    }
}
