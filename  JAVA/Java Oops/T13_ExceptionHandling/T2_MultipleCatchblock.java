package T13_ExceptionHandling;

public class T2_MultipleCatchblock {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;
        String s = null;
        int arr[] = new int[5];
        try {
            // j = i / 0;
            System.out.println(s.length());
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("dont divide by zero");
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("dont cross your limit");
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("hii how are you ");
        }

        /*
         * Exception is a parent class it can handel all type of exception.
         * so if we want to define by our self so we can define using many catch block
         * as shown above .
         * But if use Exception as starting so we can not use the multiple catch block
         * because it can handel all type of exception in so there is no need to specify
         * the other exception
         * using multiple cath block
         */
    }
}
