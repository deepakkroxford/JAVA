package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;



public class implementation {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> iterator = list.iterator();

        // Modifying the collection while iterating (causes ConcurrentModificationException)
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add("Orange");  // This will trigger ConcurrentModificationException
        }
    }
}
