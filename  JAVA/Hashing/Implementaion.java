import java.util.HashMap;
import java.util.Map;

public class Implementaion {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("aman", 28);
        map.put("akash", 21);
        map.put("harry", 18);
        map.put("yash", 16);

        // the method get return the value or the null if the key is not present
        System.out.println(map.get("dipu"));

        // the method put the value and it also update the value
        System.out.println(map.put("aman", 32));
        System.out.println(map.get("aman"));

        // remove method-> this method remove the value if the key harry is present.
        // if the given key is not present then its print the null
        System.out.println(map.remove("harry"));

        // checking if the key is in the hashmap
        System.out.println(map.containsKey("akash")); // it gives the output as true
        System.out.println(map.containsKey("dipu"));// it gives output as flase

        // Adding the new entry only if the new key doesnot exisit

        if (!map.containsKey("dipu")) {
            map.put("dipu", 21);
        }
        System.out.println(map.get("dipu"));
        // second way to do that is
        map.putIfAbsent("ujala", 22);

        // Get all the Key of the HashMap
        // [ujala, aman, akash, yash, dipu]
        System.out.println(map.keySet());// it will print the key

        // Get all the values of the hashmap
        // [22, 32, 21, 16, 21]
        System.out.println(map.values());// it will print the value

        // it will give the output as key and value both
        /*
         * [aman=32, akash=21, yash=16, dipu=21] like this
         */
        System.out.println(map.entrySet());

        

    }
}