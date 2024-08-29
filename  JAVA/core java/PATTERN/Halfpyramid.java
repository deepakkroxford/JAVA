package PATTERN;
import java.util.Scanner;

public class Halfpyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of n ");
    int n = sc.nextInt();

    // for (int i = n; i > 1; i--) // it is for row
    // {
    // for (int j = 0; j < i; j++)// it is for column
    // {
    // System.out.print("*");
    // }
    // System.out.println();

    // }
    // it give the output like this when we give n value is 5
    /*
        *****
        ****
        ***
        **
        *
    */

    // for(int i=1;i<=n;i++)
    // {
    // for(int j=1;j<=i;j++)
    // {
    // System.out.print("*" );

    // }
    // System.out.println();

    // }

    // it give the output like this when we give n value is 5
    /*
         *
         **
         ***
         ****
         *****
    
     */

    for(int i=1;i<=n;i++)
    {
    for(int j=1;j<=i;j++)
    {
    System.out.print(j);

    }
    System.out.println();

     }
    // it give output like this when we give n value to 5
    /*
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */

    // for(int i=n;i>=1;i--)
    // {
    // for(int j=1;j<=i;j++)
    // {
    // System.out.print(j);

    // }
    // System.out.println();

    // }
    // it give output like this when we give n value to 5
    /*
     * 12345
     * 1234
     * 123
     * 12
     * 1
     */

    // for (int i = 1; i <= n; i++) {
    //   for (int j = i; j <= n; j++) {
    //     System.out.print(" ");
    //   }
    //   for (int j = 1; j <= i; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

  }
}
