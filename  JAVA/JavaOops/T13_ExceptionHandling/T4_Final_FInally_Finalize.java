package T13_ExceptionHandling;

public class T4_Final_FInally_Finalize {

    @Override
    public void finalize()
    {
        System.out.println("overriden method");
    }
    public static void main(String[] args) {
        final int a=90;
        //a=10; this will give the compile time error because the final block run only one time we can not change the value after assingng
        System.out.println(a);

        //finally block

        try{
            int i=5/0;
            System.out.println(i);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("done");
        }


        // String s = "hello";
        // s=null;
        T4_Final_FInally_Finalize f = new T4_Final_FInally_Finalize();
        f=null;
        System.gc();
        System.out.println("End of main method");
    }
}