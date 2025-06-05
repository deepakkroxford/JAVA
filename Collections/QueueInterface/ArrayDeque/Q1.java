package Collections.QueueInterface.ArrayDeque;

import java.util.ArrayDeque;

public class Q1 {
    public static void main(String[] args) {
        ArrayDeque<String> queue3 = new ArrayDeque<>();
        queue3.add("Hello World");
        String str = queue3.poll();
        System.out.println("printing str "+str);
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }
}
