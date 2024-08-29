import java.util.Scanner;

public class update_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        /*
         * if operation is 1 so we have to perform the set bit
         * if operation is 0 so we have to perform the clear bit
         */
        int n =5;
        int pos =1;
        int bitmask = 1<<pos;
        int newnumber=0;
        if(operation==1)
        {
            newnumber = bitmask|n;
            System.out.println(newnumber);
        }
        else
        {
            int notbitmask = ~bitmask;
            newnumber= notbitmask&n;
            System.out.println(newnumber);
        }
        

    }
}
