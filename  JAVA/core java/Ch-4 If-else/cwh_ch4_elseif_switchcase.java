
import java.util.Scanner;

public class cwh_ch4_elseif_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   System.out.println("enter the age \n");
     int age=sc.nextInt();

    if (age>56)
    {
        System.out.println("you are expreienced");

    }
    else if (age>46)
    {
        System.out.println("you are semiexpreicend");
    }
    else if (age>35)
    {
        System.out.println("you are low expreciend");
    }
    else
    {
        System.out.println("not expriciend");
    } 
    }
   

   

}
