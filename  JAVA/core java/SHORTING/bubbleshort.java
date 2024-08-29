import java.util.*;

public class bubbleshort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        int arr [] = new int [size];
        System.out.println("enter the element in the array");
        for(int x = 0;x<arr.length;x++)
        {
            arr[x]= sc.nextInt();
        }

        // bubble short 

        for (int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }

        System.out.println("the shorted  array element is");
        for(int x = 0;x<arr.length;x++)
        {
           System.out.print(arr[x]+" ");
        }
        System.out.println();

        
    }
}
