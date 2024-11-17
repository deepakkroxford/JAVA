package Collections.MAPInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapImplementation {
    public static void main(String[] args) {
        /*
         * So The initial capacity of the map is -> 16
         * 
         * How HashMap works internally?
         * 
         * sol-> When we create the hashMap it creates a array of bucket like structure
         * internally and intial size is
         * of the bucket is 16.....
         * Each bucket considered as the linkedlist and the linked list contains the
         * nodes...
         * 
         * when we put the elements in the hashmap so it internally calulates the
         * hascode and
         * this hashcode will be used for calculating the index value where we store the
         * key
         * 
         * So then at that index the node will be created and that node contains the
         * information about the
         * hashcode , key , value , next .....
         */

        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = { 1, 2, 1, 1, 1, 1, 2, 2, 2, 5, 3, 2, 5, 1, 4, 23, 23, 45, 2, 3, 5, 6, 7, 7 };

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        map.put(null, 5);

        for (var i : map.entrySet()) {
            System.out.println(i);
        }
        System.out.println(map.entrySet());

        /*
         * The insertion order is not maintained
         * 
         * Hashmap can not store the duplicate key
         * but it can store the duplicate value..
         * 
         * It allow the null key once but and we can give the multiple values
         * 
         * Not synchronized: HashMap is not thread-safe.
         * Inserting the element = O(1)
         * Retrieving the element = O(1)
         * Removing the element = O(1)
         * Checking if a key exists = O(1)
         * Checking the size of the map = O(1)
         * 
         * 
         */

        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(1, 10);
        ht.put(2, 20);
        ht.put(1, 30); // it will override the previous value
        System.out.println(ht);

        // ht.put(null, 10); //it will give the error message not allowed in the hashmap

        /*
         * The insertion order is not maintained.
         * It doesn't allow null values or null keys, unlike HashMap.
         * 
         * It is synchronized, hence thread-safe but slower than HashMap in
         * non-concurrent contexts.
         * 
         * It does not allow duplicate keys, but it allows updating the value associated
         * with an existing key. 
         * 
         * Time complexity for basic operations like put(), get(), and remove() is O(1)
         * on average.    
         * 
         */
        System.out.println(ht);

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "Apple");
        tm.put(3, "Banana");
        tm.put(2, "Cherry");
        tm.put(0, "xaaa");
        tm.put(12, null);
        /*
         * Insertion order is not maintained: TreeMap orders the elements based on the
         * keys, not the insertion order.
         * The keys are sorted in ascending order by default.
         * The values are not sorted, only the keys are.
         * No null keys allowed, but null values are allowed.
         */
        System.out.println(tm);

        LinkedHashMap<Integer, String> lh = new LinkedHashMap<>();
        lh.put(1, "Apple");
        lh.put(2, "Banana");
        lh.put(3, "Cherry");

        lh.put(null, null);
        lh.put(12, null);

        /*
         * Maintains insertion order (or access order if specified).
         * Allows null keys and values.
         * Time complexity is O(1) for put(), get(), remove(), but with slight overhead
         * for maintaining the order.
         */

        System.out.println(lh);

    }
}
