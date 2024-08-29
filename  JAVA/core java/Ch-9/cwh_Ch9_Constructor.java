class MyMainEmployee
{
	private int id;
    private String name;

    public MyMainEmployee()  // this is constructor 
    {
        id = 0;  
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId) //here we are doing constructor overloading
    {
        id = myId;
        name = myName;
        System.out.println(name);
        System.out.println(id);
    }
    public MyMainEmployee(String myName)// we can do overloading like method overloading
    {
        id = 1;
        name = myName;
    }
//    public String getName()
//    {
//        return name;
//    }
//    public void setName(String n)
//    {
//        this.name = n;
//    }
//    public void setId(int i)
//    {
//        this.id = i;
//    }
//    public int getId(){
//        return id;
//    }
}

public class cwh_Ch9_Constructor {
public static void main(String[] args) {
	MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
    //MyMainEmployee harry = new MyMainEmployee();
    //harry.setName("CodeWithHarry");
    //harry.setId(34);
   // System.out.println(harry.getId());
    //System.out.println(harry.getName());
}
}
