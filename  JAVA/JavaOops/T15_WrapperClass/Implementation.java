

public class Implementation {
    public static void main(String[] args) {

        //primitive type int it can not store the null value if we want to store the null value into the primitive int its give the 
        //compile time error int i =null;
        int z =10;
        
        Integer k = null;            // Integer wrapper can hold null
        System.out.println(k);

        Integer y =Integer.valueOf(z); //converting int into Integer explicitly  
        System.out.println(y);


        Integer i = new Integer(10); // Creating Integer object
        int value = i.intValue();          // Converting Integer to int (Auto-Unboxing)
        
        // Auto-boxing and unboxing
        Integer j = 20;              // Auto-boxing: primitive to wrapper 
        int sum = i + j;             // Auto-unboxing: wrapper to primitive
        System.out.println(sum);


        //so we can do any opertaion on Wrapper interger ans primitive int
        Integer f =10;
        int g =10;
        System.out.println(f+g);


        //Auto-boxing
        /*
         * In Auto-boxing we take the primitive value and store into the wrapper object so that concept is called autoboxing
         */
        //Auto-Unboxing
        /*
         * In Auto-Unboxing we take the wraper object and store into the primitive value so this concept is called the Auto-Unboxing
         */

         //ParseInt Method
         String s1 ="321";
         String s2 ="924";
         int num1 = Integer.parseInt(s1); // so this method take the string as input and change into integer value then we can perform operation easily
         int num2 = Integer.parseInt(s2);
         System.out.println(num1+num2);
    }
}
