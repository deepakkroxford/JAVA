public class cwh_ch7_Method_Overlodaing {
	static void foo()
	{
		System.out.println("Good morning bro!");
	}
	static void foo (int a)
	{
		System.out.println("good evening bro");
	}
	static void foo(int a,int b) //we have to change parameter not return type
	{
		System.out.println("good morning" +a+ "bro!");
		System.out.println("good moring" +b+ "bro");
	}
	static void change(int a)
	{
	   a =65;
	}
	static void change2(int []arr)
	{
		arr[0]=98;
	}
 static void goodmorning()
 {
	System.out.println("hii every one \n" + "good morning"); 
 }
 
 public static void main(String[] args) {
	
	// goodmorning();
	 // case 1: changing the integer
//	 int x = 55;
//	 change(x); 
//	 System.out.println(x);
	 
	 // case 2 : changing the array
//	 int [] marks  = {64,87,89,76,34};
//	 change2(marks);
//	 for (int i=0;i<marks.length;i++)
//	 {
//	 System.out.println(marks[i]);
//	 }
	 
	 // Method overloading
	 foo();
	 foo();
	 foo(3000,4000);// arguments are actual 
	 
	 
}
}
