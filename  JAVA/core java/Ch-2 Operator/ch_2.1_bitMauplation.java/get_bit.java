import java.util.Scanner;

public class get_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        System.out.println("enter the position");
        int pos=sc.nextInt();
        int bitmask = 1<<pos;

        int newnumber =  bitmask | n;
        System.out.println(newnumber);
    }
}
