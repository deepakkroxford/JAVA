package T2_Methods;
class Calculate{
   
    public int addnumber(int a, int b)
    {
        return a+b;
    }
    //so in method overloading we have a same no of parameter but diffrent types
    public double addnumber(double a, int b)
    {
        return a+b;
    }
     //so in method overloading we have a diffrent no of parameter in same types
    public int addnumber(int a, int b, int c)
    {
        return a+b+c;
    }
    
}
class privatee{

    //we can overload the static but not the private method 
  public static int add(int a, int b)
  {
    return a+b;
  }
  
  public static int add(int a, int b, int c)
  {
    return a+b+c;
  }
}

public class T2_Method_OverLoading {
    public static void main(String[] args) {
        Calculate ans = new Calculate();
        int res=ans.addnumber(1, 2, 3);
        System.out.println(res);
    }
}

