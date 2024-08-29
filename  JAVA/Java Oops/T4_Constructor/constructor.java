package T4_Constructor;

 class Person  {
  String name;
  int age;

  //inisilizing constructor and this constructor is called as default constructor
  public Person()
  {
    //we set the initail name and age 
    name="aman";
    age=12;
    System.out.println("hii i am in constructor");
  }
    
}
public class constructor {
    public static void main(String[] args) {
        //here creating a object of the class person 
        Person obj = new Person(); //when we create the object it call the constrictor also
        
       //when we create a another object of class the it will call the constructor
      // so it means that whenever we create the object it will call the constructor automatically 
       // Person obj1 = new Person();
        


        System.out.println(obj.age +" "+obj.name); // print the initial value

        //if we do this our intial value change and if we not do this so our initial value is aman and 12 
        obj.name="dons";
        obj.age=26;
        System.out.println(obj.age +" "+obj.name);

    }
}
