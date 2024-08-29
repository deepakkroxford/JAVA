import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of t");
       int t = sc.nextInt();
       for(int i =0;i<t;i++)
       {
       System.out.println("enter the number you want for checking");
        int num = sc.nextInt();
       int temp =0;
       for(int x=2;x<num;x++)
       {
        if(num%x == 0)
        {
            temp = temp+1;
        }

       }
    
       if(temp !=0)
       {
        System.out.println("the number is not  prime");
       }
       else{
        System.out.println("the number is  prime");
       }
    }

    }
    
}
