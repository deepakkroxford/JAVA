import java.util.Scanner;

public class SelectionShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("enter the element of an array");
        for (int x = 0; x <size; x++) {
            arr[x] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println("the sorted array element is ");
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x] + " ");
        }

    }

}
