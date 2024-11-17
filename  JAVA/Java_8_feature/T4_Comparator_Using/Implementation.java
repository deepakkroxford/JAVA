
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Mycomparator implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2)
        {
            return -1;
        }
        else if(i1>i2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
class decendingorder implements Comparator<Integer>
{
    public int compare(Integer a, Integer b)
    {
        // if(a<b)
        // {
        //     return 1;
        // }
        // else if(a>b){
        //     return -1;
        // }
        // else{
        //     return 0;
        // }
        return (a>b)?-1:(a<b)?1:0; // using ternary operator we can write this code into singleline 
    }
}
public class Implementation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(45);
        list.add(21);
        list.add(10);
        list.add(3);
        list.add(9);
        System.out.println(list);//normal arraylist printing

        // sorting using comparator in ascending order
        Collections.sort(list,new Mycomparator()); 
        System.out.println(list);

        //sorting into decending order using comparator
        Collections.sort(list,new decendingorder());
        System.out.println(list);
       

    }
}
