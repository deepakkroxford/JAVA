
import java.util.Scanner;
public class cwh_ch7_PracticeSet_Method {
	/*
	 * practice 1
	 */
//
//	static void  multiplication(int n)
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(+n+"X"+i+"="+(n*i));
//		}
//	}
	
	/*
	 * practice 2:print the following pattern
	 */
//	static void pattern(int n)
//	{
//		for(int i=1;i<=n;i++)
//		{
//			for (int j=1;j<=i;j++)
//			{
//				System.out.printf("*");
//				
//			}
//			System.out.println();
//		}
//	}
	/*
	 * problem 3
	 */
//	static int sum(int n )
//	{
//		if(n==1)
//		{
//			return 1;
//			
//		}
//		else
//		{
//		return n +sum(n-1);
//		}
//	}
	
	/*
	 * problem 4
	 * print a pattern in reverse order
	 */
	
//	static void pattern2(int n )
//	{
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=n;j>=i;j--)
//			{
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
//	}
	
	/*
	 * practice problem -5
	 * find nth term of fibnoci series 
	 */
//	static int fib(int n )
//	{
//		/*if(n==1)
//		{
//			return 0;
//		}
//		else if (n==2)
//		{
//			return 1;
//		}*/
//		if(n==1 || n==2)
//		{
//			return n-1;
//		}
//		else
//		{
//			return fib(n-1)+fib(n-2);
//		}
//	}
//	
	
//	static float sum(float...arr)
//	{
//	 //available as int[]arr;
//		int result=0;
//		for(float a:arr)
//		{
//			result +=a;
//		}
//		return result;
//	}
//	
	
	/*
	 * parctice problem 8
	 */
	
//	static void pattern_rec(int n )
//	{
//		if(n>0) {
//			pattern_rec(n-1);
//			for(int i=0;i<n;i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//	}
	
	/*
	 * parctice 9
	 * 
	 */
	
	static float conversionTemp(int n){
        if(n==0){
            return 32f;
        }else {
            return n*9/5+32f;
        }
    }

	public static void main(String[] args) {
		//problem 1
		//multiplication(7);
		
		//problem 2
		//pattern(4);
		
		//problem 3
		 //int c=sum(3);
		 //System.out.println(c);
		 
		//problem 4
		//pattern2(4);
		
		 //problem 5
		//int result =fib(12);
		//System.out.println(result);
		
		//problem 6
		//float avg=0.f;
		//avg=sum((2.0f+34.0f+55.0f+67.0f)/4);
		//System.out.println("the avrage of the given sum is" +avg);
		
		//problem 8
		//pattern_rec(4);
		
		//problem 9
//		Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the Temp you want to convert");
//        int temp= sc.nextInt();
        //float result= conversionTemp(40);
        //System.out.println(result);
		
	}
}
