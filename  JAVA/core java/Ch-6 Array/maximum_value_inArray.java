import java.util.Scanner;
public class maximum_value_inArray{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.println("enter the element of an array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("the entered element is " + arr[i]);
        }
        int max = arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("the max element is " +max);
    }
}