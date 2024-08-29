

public class cwh_ch6_Arrays_for_each_loop {
public static void main(String[] args) {
	
//	int [ ]marks ={23,87,89,56,77};
//	System.out.println(marks[2]);
//	System.out.println(marks.length);
//	float []number = {87.5f,49.7f,87.89f,78.87f,99.5f,68.87f};
//	System.out.println(number[2]);
//	System.out.println(number.length);
//	
//	String []name = {"aman","ashish","vishal","anshu","sumit","motki"};
//	System.out.println(name[1]);
//	System.out.println(name.length);
	
	
	int [ ]marks ={23,87,89,56,77};
	//displaying the array(naive way)
	System.out.println("printing using simple way");
	System.out.println(marks[0]);
	System.out.println(marks[1]);
	System.out.println(marks[2]);
	System.out.println(marks[3]);
	System.out.println(marks[4]);
	
	
	// display using the loop
	
	System.out.println("printing using for loop");
	for(int i=0;i<5;i++)
	{
		System.out.println(marks[i]);
	}
	
	//display using for loop in reverse order
	
	System.out.println("print in reverse order");
	
	for(int a=4;a>=0;a--)// or for(int i =marks.length -1;i>0;i--)
	{
		System.out.println(marks[a]);
	}
	
	//using for each loop
	System.out.println("using for each loop");
	for(int element:marks)
	{
		System.out.println(element);
	}
	
	
}
}
