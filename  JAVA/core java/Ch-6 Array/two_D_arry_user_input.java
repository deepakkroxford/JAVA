import java.util.Scanner;

public class two_D_arry_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row");
        int row = sc.nextInt();
        System.err.println("enter the size of column");
        int col = sc.nextInt();
        int marks[][] = new int[row][col];
        System.out.println("enter the element of row and column");
        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("the entered arry element are");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.printf(marks[i][j]+"");
            }
            System.out.println();
        }
    }
    }
    
