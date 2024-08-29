
/*
 * access modifier :- specifies where a property/method is accessible 
 * four types of access modifier in java 
 * 1->private 
 * 2->default 
 * 3-> protected
 * 4->public
 */
class Mystudent
{
	
 private int id;
	private String name;
	
	public void setName(String n) //when we use set it not return anything
	{
		name =n; //we can also use this.name=n;
	}
	public String getName() 
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int i)
	{
		id=i;// we can also write this.id=i;
	}
	
}
public class cwh_Ch9_Acces_modifire {
	public static void main(String[] args) {
		Mystudent ms = new Mystudent();
//		 ms.id = 33;
//		 ms.name ="aman singh";
//		 System.out.println(ms.id);
//		 System.out.println(ms.name);
		/*
		 * when we make private it give error its mean that we can access 
		 * for accessing this we have to make method 
		 */
		ms.setName("aman singh"); // in private case we can give input using methods
		System.out.println(ms.getName());//this is for printing output
		ms.setId(34);
		System.out.println(ms.getId()); //for getting the output
		
	}
 
 
	
}
