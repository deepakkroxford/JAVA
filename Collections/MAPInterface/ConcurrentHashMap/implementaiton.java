package Collections.MAPInterface.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class implementaiton {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> ch = new ConcurrentHashMap<>();
        ch.put(1, 89);
        ch.put(2, 421);
        ch.put(3, 990);
        ch.put(4, 90);
        ch.put(5, 34);
        ch.put(6, 76);
        System.out.println(ch.entrySet());
        System.out.println(ch.values());
    }
}
