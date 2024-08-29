

public class cwh_Ch6_Arrays {
public static void main(String[] args) {
	
	/*
	 * classroom of 500 student - you have to store
	 * marks of these 500 students
	 * You have 2 options:
	 * 1:create 500 variables
	 * 2:use arrays (recommended)
	 */
	
	/*
	 * there are three main ways to create an array in java 
	 * 1: Declaration and then memory allocation
	 * 
	 */
  //	int [] marks = new int [5];
	
	//2: Declaration and memory allocation
	//int[]marks;
	//marks =new int[5];
	//initialization
//	marks [0]=100;
//	marks [1]=60;
//	marks [2]=89;
//	marks [3]=34;
//	marks [4]=88;
	//marks [5]=76; -->> it give us error because we define a array
	//of 5 so it is beyond limit
	//3: Declaration,memory allocation and initialization together
	 int [] marks = {98,45,34,89};
	System.out.println(marks[0]);
}
}
