
import java.util.Scanner;
public class cwh_ch4_Condition_If_Else {
public static void main (String[]args) {
	
	//Condition statement 
	
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the age \n");
	int age = sc.nextInt();
	
	if(age>=17 && age<=60)
	{
		System.out.println("Yes you can drive my friend ");
		
	}
	else
	{
		System.out.println("He is not elegibale");
		
	}
}
}
