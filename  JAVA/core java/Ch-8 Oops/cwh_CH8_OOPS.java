package firstproject;

class employe{
	int id;
	String name;
	public void printDetails() {
		System.out.println("my id is" + id);
	System.out.println("and my name is" + name);
	}
}
public class cwh_CH8_OOPS {
	public static void main(String[] args) {
		
		
		employe aman = new employe();//instantiating a object of employe object
		employe ashish = new employe();
		//setting Attributes
		aman.id=33;
		aman.name="deepak kumar singh";
		ashish.id=17;
		ashish.name="ashish kumar singh";
		
		//printing the attributes
		aman.printDetails(); 
		ashish.printDetails();
		//System.out.println(aman.id);
		//System.out.println(aman.name);
		
	}

}
