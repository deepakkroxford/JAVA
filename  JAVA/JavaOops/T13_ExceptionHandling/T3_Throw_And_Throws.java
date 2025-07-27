

//this is coustom exception class
class NegativeRadiusException extends Exception
    {
        @Override
        public String toString()
        {
            return "Radius Can Not be Negative";
        }

        public String getMessage()
        {
            return "Radius can not be negative";
        }
    }

public class T3_Throw_And_Throws {
    
    public static double area(int r) throws NegativeRadiusException
    {
       if(r<0)
       {
        throw new NegativeRadiusException();
       }
        double ar = Math.PI*r*r;
        return ar;
    }


    public static int div(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {

        /*
         * Throws key word is used to Indicate this method or block can give a exception
         * so the person who are using those method it should compulsary from them to
         * handel the exception. If the person is using that paticular method that throws the exception 
         * then it compulsary for that person to handel that exceptions using the try and catch block.
         * 
         */
         
        try {
           int a= div(4, 2);
           System.out.println(a);

        } catch (Exception e) {
            System.out.println(e);
        }

        //give error becuse it not handel
        // double ans1 = area(-9);
        // System.out.println(ans1);

        try
        {
            double ans = area(-9);
            System.out.println(ans);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
