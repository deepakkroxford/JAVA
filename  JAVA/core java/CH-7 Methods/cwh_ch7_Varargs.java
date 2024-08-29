public class cwh_ch7_Varargs {
	/*
	 * in this case we have to create new method when 
	 * we want to add 2 integer number to 3 integer number
	 * and when we increase the integer we have to make new 
	 * method so varargs solve this problem 	 *
	 */
//static int sum(int a ,int b)
//{
//	return a+b;
//}
//static int sum(int a, int b,int c)
//{
//	return a+b+c;
//}
//static int sum(int a, int b, int c, int d)
//{
//	return a+b+c+d;
//}
	static int sum(int...arr)
	{
	 //available as int[]arr;
		int result=0;
		for(int a:arr)
		{
			result +=a;
		}
		return result;
	}

public static void main(String[] args) {
	
	System.out.println("welcome to varargs tutorial");
	System.out.println("the sum of given number is ");
	System.out.println(sum(4,5));
	System.out.println(sum(4,5,6));
	System.out.println(sum(4,5,6,7));
	System.out.println(sum(4,5,6,7,3,5,67));

}
}
