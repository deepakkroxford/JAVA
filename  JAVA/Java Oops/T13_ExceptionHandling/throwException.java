package T13_ExceptionHandling;

public class throwException {
    public static void main(String[] args) {
        

        int a=10;
        int b=0;
        int c ;
        try{
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
