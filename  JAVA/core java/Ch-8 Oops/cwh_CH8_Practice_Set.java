package firstproject;
import java.util.Scanner;
//class Employee
//{
//	int salary;
//	String name ;
//	
//	public int getsalary() // this is metod 
//	{
//		return salary;
//		
//	}
//	public String getName()// this is method 
//	{
//		return name;
//	}
//	public void setName(String n)// this is method
//	{
//		 name =n; 
//	}
//}

//class cellphone
//{
//	public void ringing()
//	{
//		System.out.println("ringing....");
//	}
//	public void vibrating()
//	{
//		System.out.println("vibrating...");
//	}
//	public void calling()
//	{
//		System.out.println("calling....");
//	}
//	
//}

class square
{
	int side;
	public  int area()
	{
		return side*side;
	}
	public int perimeter()
	{
		return 4*side;
	}
}
class rectangle
{
	int area;
	int perimeter;
	int length;
	int breath;
	  public int area()
	{
		area =length*breath;
		return area;
	}
	 public float perimeter()
	{
		perimeter = 2*(length+breath);
		return perimeter;
	}
}

class tommy{
	public void hit()
	{
		System.out.println("hitting the enemey");
	}
	public  void run()
	{
		System.out.println("running from the enemey");
	}
	public  void fire()
	{
		System.out.println("firing on the enemey");
		return ;
	}
	
}
public class cwh_CH8_Practice_Set {
public static void main(String[] args) {
	
	/*
	 * problem 1 
	 */
//	Employee e = new Employee();
//	e.setName("deepak kumar singh");
//	e.salary=10000;
//	System.out.println(e.getsalary());
//    System.out.println(e.getName());
//	e.name= "aman singh rathore";
//	e.salary=100000;
//	System.out.println("the name of employee is -->>"+e.name);
//	System.out.println("and he earn per month -->"+e.salary);
//	
	
	/*
	 * problem 2
	 */
//	cellphone vivo =new cellphone();
//	vivo.calling();
//	vivo.ringing();
//	vivo.vibrating();
	
	/*
	 * problem 3
	 */
//	square s1 =new square();
//	s1.side=6;
//	System.out.println("the area of square is -->" +s1.area());
//	System.out.println("the perimeter of square is -->" +s1.perimeter());
	
	/*
	 * problem 4
	 */
	
	rectangle r1 = new rectangle();
	r1.length=4;
	r1.breath=5;
	System.out.println("the area of rectangle is"+r1.area());
	System.out.println("the perimeter of recatangle is "+r1.perimeter());
	
	/*
	 * problem 5
	 */
	tommy t1 = new tommy();
	t1.hit();
	t1.run();
	t1.fire();
}
}
