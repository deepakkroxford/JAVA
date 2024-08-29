import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("deepak");
        System.out.println(sc);
        for(int i=sc.length()-1;i>=0;i--)
        {
            System.out.println(sc.charAt(i));
        }

        // String str = "aman";
        // for(int i = str.length()-1;i>=0;i--)
        // {
        //     System.out.print(str.charAt(i));
        // }
        Scanner sb  = new Scanner(System.in);
        System.out.println("enter the name");
        String name = sb.nextLine();
        for(int i = name.length()-1;i>=0;i--)
        {
            System.out.println(name.charAt(i));
        }

        
    }
    
}
