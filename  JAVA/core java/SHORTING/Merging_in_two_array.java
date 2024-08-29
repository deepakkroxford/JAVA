import java.util.Scanner;

public class Merging_in_two_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of first array");
        // int m = sc.nextInt();
        // int a [] = new int [m];
        // for(int i=0;i<m;i++)
        // {
        //     a[i] = sc.nextInt();
        // }

        // System.out.println("enter the size of second array ");
        // int n = sc.nextInt();
        // int b[] = new int [n];
        // for(int j =0;j<n;j++)
        // {
        //     b[j]= sc.nextInt();
        // }

        
        int a[] ={12,15,16,19};
        int b[] ={1,5,7,9};
        int c[] = new int [7];
        int i,j,k;
        int m =4;
        int n=4;
        i = j=k=0;
         while(i< m && j< n  )
         {
            if(a[i]<b[j])
            {
                c[k] =a[i];
                k++;i++;
            }
            else
            {
                c[k]=b[j];
                k++;j++;
            }
            while(i<m)
            {
                c[k]=a[i];
                k++;i++;
            }
            while(i<n)
            {
                c[k]=b[j];
                k++;j++;
            }
         }

         for(int p=0;p<=c.length;p++)
         {
            System.out.println(c[i]);
         }
        
    }
    
}
