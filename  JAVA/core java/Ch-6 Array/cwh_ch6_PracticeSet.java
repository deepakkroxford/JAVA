
import java.util.Scanner;
public class cwh_ch6_PracticeSet {
public static void main(String[] args) {
	
	/*
	 * practice problem 1
	 * create an array of 5 floats and calculate 
	 * their sum 
	 */
	
//	float [] marks = {45.7f,49.7f,90.34f,89.76f,56.98f};
//	float sum = 0;
//	for (float element :marks)
//	{
//		sum = sum+element;
//	}
//	System.out.println("the value of sum is " +sum);
	
	
	/* 
	 * practice problem -2
	 * write a program to find out whether a 
	 * given integer is present in array or not
	 *  
	 */
//	Scanner sc = new Scanner(System.in);
//	int [] marks = {567,890,987,563,678};
//	int num= 9807;
//	boolean isInArray =false;
//	for(int element:marks)
//	{
//		if (num==element)
//		{
//			isInArray = true;
//			break;
//					
//		}
//	}
//	if(isInArray)
//	{
//		System.out.println("the value present in a array");
//	}
//	else
//	{
//		System.out.println("is not present in a array");
//	}
	
	/*
	 * practice problem 3
	 * calculate the average marks from an array containing
	 * marks of all student in physic using for each loop
	 * 
	 */
//	int [] physic_marks = {89,98,76,75,88};
//	float average=0;
//	float sum =0;
//	for(int element:physic_marks)
//	{
//	 sum = sum +element;
//	 average = sum/5;
//	}
//	System.out.println(sum);
//	System.out.println(average);
//	
	
	/*practice problem -4
	 * create a java program to add two matrix of
	 * size 2*3
	 * it mean that row is 2 and column is 3
	 */
	
//	int [][] mat1 = {{1, 2, 3},
//			         {4, 5, 6}};
//	
//			int [][] mat2 = {{2, 6, 13},
//			                {3, 7, 1}};
//			
//			int [][]result = {{0, 0, 0},
//			                  {0,0,0}};
//			for(int i =0;i<mat1.length;i++)
//			{
//				for(int j=0;j<mat1[i].length;j++)
//				{
//					System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//					result[i][j]=mat1[i][j] + mat2[i][j];
//				}
//			}
//			
//			//printing 2D array
//			for (int i=0;i<mat1.length;i++){ // row number of times
//	            for (int j=0;j<mat1[i].length;j++) { // column number of time
//	                System.out.print(result[i][j] + " ");
//	                result[i][j] = mat1[i][j] + mat2[i][j];
//	            }
//	            System.out.println(""); // Prints a new line
//	        }
//			
	
	/*
	 * practice problem 5
	 * write a java program to reverse a array
	 */
//	int [] arr = {7,9,12,11};
//	int l = arr.length;
//	int n = Math.floorDiv(l, 2);
//	int temp;
//	for (int i =0;i<n;i++)
//	{
//		//swap a[i] and a[l-1-i]
//		temp = arr[i];
//		arr[i] = arr[l-i-1];
//		arr[l-i-1]=temp;
//	}
//	for(int element:arr)
//	{
//		System.out.println (element);
//	}
	
	/*
	 * practice problem 6
	 * write a java program to find a maximum element
	 * in an array
	 */
//	int []arr = {45,23,8,6,26,-87};
//	int max = Integer.MIN_VALUE;
//	for (int e:arr)
//	{
//		if (e>max)
//		{
//			max=e;
//		}
//	}
//	System.out.println("the value of maximum element is:" +max);
	
	
	/*
	 * practice problem 7
	 * write a java program to find a minimum element 
	 * in an array
	 * 
	 */
	
	int [] value = {11,25,8,4,3,34};
	int min = Integer.MAX_VALUE;
	for(int e:value)
	{
		if (e<min)
		{
			min=e;
		}
	}
	System.out.println(min);
	
	/*
	 * practice problem 8
	 * write a java program to find whether an array
	 * is sorted or not
	 */
	int [] ele = {23,76,90,244,36,87};
	boolean isSorted =true;
	for (int i =0;i<ele.length-1;i++)
	{
		if (ele[i]>ele[i+1]) {
			isSorted =false;
		}
	}
	if (isSorted)
	{
		System.out.println("the array is sorted");
	}
	else
	{
		System.out.println("is not sorted");
	}
	
	
}
}
