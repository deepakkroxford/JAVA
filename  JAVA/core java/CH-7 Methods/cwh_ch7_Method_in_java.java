public class cwh_ch7_Method_in_java {
	/*
	 * Sometimes our program grows in size, and we want to separate the logic of the main method from the other methods.
       * For instance, if we calculate the average of a number pair 5 times, we can use methods to avoid repeating the logic.
 		*[DRY – Don’t Repeat Yourself]
	 */
	public static int logic (int x,int y)
	/*
	 * if we not write static so we have to make object and call seprately
	 */
	{
		int z;
		if (x>y){
			z=x+y;
		}
		else
		{
			z=(x+y)*5;
		}
		return z;
	}
public static void main(String[] args) {
	 int a =5;
	 int b =6;
	 int c;
	 c=logic(a,b);
	 
	 //  Method invocation using Object creation
    //	 cwh_ch7_Method_in_java obj = new cwh_ch7_Method_in_java ();
   //	 c = obj.logic(a, b);	
	 System.out.println("so the outout of a and b is " +c);
	 
	 int a1= 13;
	 int b1= 12;
	 int c1;
	 c1 = logic(a1,b1);
	 //c1 = obj.logic(a1,b1);
	 System.out.println("so the output of a1 and b1 is " +c1);
}
}
