package TrickyQuestion;

public class Q7 {
    public static void main(String[] args) {
        method(); // true end
    }
    public static boolean method()
    {
        int arr[] = {10,20,30};
        try{
         System.out.println(arr[2]);
         return true;
        }
        finally{
            System.out.println("end");
        }
    }
}
