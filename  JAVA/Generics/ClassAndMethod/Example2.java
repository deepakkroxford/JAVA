package Generics.ClassAndMethod;
class FindingMax {
    public static <T extends Comparable<T>> T maxElement(T[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        
        T max = arr[0];
        for (T t : arr) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Integer arr[] ={1,2,3,12,1241,41,4,1,2};
        System.out.println(FindingMax.maxElement(arr));
    }
}
