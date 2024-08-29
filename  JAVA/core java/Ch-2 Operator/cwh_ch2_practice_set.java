import java.util.Scanner;
public class cwh_ch2_practice_set {
	public static void main (String[]args)
	{
		float a = 7/4*9/2;
		/*
		 * a = 1*9/2
		 * a= 9/2
		 * a=4.0 why because the given value is integer
		 */
		System.out.println(a);
		
		//float b = 7/4.0f * 9/2.0f;
		/*
		 * a= 1.75*9/2.0f
		 * a=15.75/2.0f
		 * a=7.875
		 */
		//System.out.println(b);
		
		/*
		 * Write a java program to encrypt a grade by adding to it.
		 * Decode it to show the correct grade
		 * 
		 */
		
		char grade ='A';
		grade= (char) (grade+8);
		System.out.println(grade);
		
		//decode the grade
		grade= (char) (grade-8);
		System.out.println(grade);
		
		
		/*
		 * Use comparison operators to find out whether a given number is 
		 * greater than the user entered number or not
		 *   
		 */
			
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of a");
		int x = sc.nextInt();
		System.out.println(a>28);
		
		
	}

}
