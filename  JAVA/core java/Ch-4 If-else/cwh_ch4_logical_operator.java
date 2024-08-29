import java.util.Scanner;

public class cwh_ch4_logical_operator {
    public static void main(String[] args) {

       //logical operator
		boolean a = true;
		boolean b = false;
		
		/*
		 * so we use && logical operator and in this case
		 * it gives true value when both the condition is true
		 * 
		 */
	
		if (a && b)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
		boolean c = true;
		boolean d = false;
		
		/*
		 * so in this case we use logical || (or) operator 
		 * so in this case our output is true because in logical
		 * or if any case is true it gives the output true.
		 */
		
		if (c || d)
		{
			System.out.println("yes");
			
		}
		
		else
		{
			System.out.println("no");
		}
		


    }
}
