package T13_ExceptionHandling;

public class throwException {
    public static void  checkAge (int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        

        int a=10;
        int b=0;
        int c ;
        try{
            checkAge(13);
            c  = a/b;
           if(b==0)
           {
            throw new ArithmeticException();
           }
          
            
        }
        catch(Exception e){
            c=a/1;
            System.out.println(c);
            System.out.println(e);
        }
        finally{
            System.out.println("finnaly executed");
        }
      
    }
}
