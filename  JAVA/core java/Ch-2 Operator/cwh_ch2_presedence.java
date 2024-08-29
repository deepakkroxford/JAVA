public class cwh_ch2_presedence {
public static void main(String[]args){
	
	// Precedence and Associativity
	
	// int a= 8*5-36/6;
	/* 
	 * = 40-36/6
	 * = 40-6
	 * = 34 output we got
	 */
	
//	int b = 60/5-34*2;
	/*
	 * = 12-34*2
	 * = 12-68
	 * = -56 
	 * this output we got by using precedence 
	 * in this case / and * have same precedence so we evaluate left to right
	 * 
	 */
	
//	System.out.println("the sum is");
//System.out.println(a);
//	System.out.println(b);
//	
	//Quick quiz
	//Question 1
	int x=5;
	int y=6;
	int k = x * y/2;
	/*
	 * k = 5 * 6/2
	 * k = 30/2
	 * k =15
	 * here * and / have same precedence so we evaluate left to right
	 */
	//System.out.println(k);
	
	//Question 2
	int b=1;
	int a=5;
	int c=4;
	int z= b*b-(4*a*c)/(2*a);
	
	/*
	 * z= 1*1-(4*5*4)/(2*5)
	 * z= 1*1-(80)/(10)
	 * z= 1*1-8
	 * z= 1-8
	 * z=-7
	 */
	System.out.println(z);
	
}
}
