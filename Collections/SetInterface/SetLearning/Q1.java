package Collections.SetInterface.SetLearning;

import java.util.HashSet;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /**
         * find the interaction of two arrays
         * 
         * input:
         * arr1 = {1,2,3,4,5}
         * arr2 = {1,2,3}
         * 
         * output:
         * 1 2 3
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array: ");
         int n1 = sc.nextInt();
         int[] arr1 = new int[n1];
         System.out.println("Enter the elements of the array: ");
         for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
         }
         System.out.println("Enter the size of the array: ");
         int n2 = sc.nextInt();
         int[] arr2 = new int[n2];
         System.out.println("Enter the elements of the array: ");
         for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
         }
         sc.close();
         HashSet<Integer> set = new HashSet<>();
         for(int i=0;i<n1;i++){
            set.add(arr1[i]);
         }
         for(int i=0;i<n2;i++){
            if(set.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
            }
         }
    }
}
