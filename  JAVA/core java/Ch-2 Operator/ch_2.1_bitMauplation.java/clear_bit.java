import java.util.Scanner;

public class clear_bit {
   public static void main(String[] args) {
    /*
     * in this operation we have to first find the bitmask number 
     * doing left shift with the given position.
     * now we have to do  not(~) operation with the bitmasknumber and store this value in variable like not
     * the we have to perform the and operation with the original number and the number
     * we store in not variable and store the result in newnumber.
     * and the we have to print the newnumber.
     * 
     */
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        System.out.println("enter the position");
        int pos=sc.nextInt();
        int bitmask = 1<<pos;
        int not = ~bitmask;
        int newnumber = not&n;
        System.out.println(newnumber);

   } 
}
