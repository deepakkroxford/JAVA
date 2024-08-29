package firstproject;
import java.util.Scanner;
public class cwh_ch5_Loop_Controls {
public static void main(String[] args) {
	
//	int i =1;
//	while(i<=4)
//	{
//		System.out.println(i);
//		i++;
//	}
	
	/*
	 * Write a program to print natural number
	 * from 100 to 200
	 */
//	int i=100;
//	while(i<=200)
//	{
//		System.out.println(i);
//		i++;
//	}
//	System.out.println("you done it \n");
	
//    Scanner sc = new Scanner(System.in);
//    System.out.println("enter the value of n");
//    int n = sc.nextInt();
//    for(int i=1;i<=10;i++)
//    {
//      System.out.println(n + "X"+ i + "="+(n*i));
//    } 
	
	Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n");
     int n = sc.nextInt();
     int fact =1;
     for(int i=n;i>1;i--)
     {
       fact = fact*i;
       System.out.println(fact);
     }

}
}
