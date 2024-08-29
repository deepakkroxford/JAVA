package T13_ExceptionHandling;

public class T1_implementation {
    public static void main(String[] args) {
        int i=10;
        int j =2;

        try{
            j =i/j;
            System.out.println(j);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
