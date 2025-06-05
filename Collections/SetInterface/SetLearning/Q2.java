package Collections.SetInterface.SetLearning;

import java.util.HashSet;

public class Q2 {
    public static boolean checkSame(int arr1[], int arr2[]){
        if(arr1.length != arr2.length){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            if(!set.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /**
         * Check the two arrays are contains same elements or not
         * 
         * input:
         * arr1 = {1,2,3,4,5}
         * arr2 = {1,2,3}
         * 
         * output:
         * false
         * 
         * input:
         * arr1 = {1,2,3,4,5}
         * arr2 = {1,2,3,4,5}
         * 
         * output:
         * true
         * 
         */
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
        System.out.println(checkSame(arr1, arr2));
    }
}
