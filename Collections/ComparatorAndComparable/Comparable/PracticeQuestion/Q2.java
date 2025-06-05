package Collections.ComparatorAndComparable.Comparable.PracticeQuestion;

import java.util.ArrayList;
import java.util.Collections;

class Products implements Comparable<Products> {
    private int id;
    private String name;
    private double price;

    public Products(int id, String name, double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int compareTo(Products o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Price: " + price;
    }
}

public class Q2 {
    public static void main(String[] args) {
        /**
         * Sort products by price
         * Fields: int id, String name, double price
         * Sort products in ascending order of price.
         */

        ArrayList<Products> arr = new ArrayList<>();
        arr.add(new Products(1, "Laptop", 4221.90));
        arr.add(new Products(2, "Mouse", 21.90));
        arr.add(new Products(3, "Keyboard", 121.90));
        arr.add(new Products(4, "Monitor", 121.90));

        Collections.sort(arr);

        for (Products p : arr)
            System.out.println(p);
    }
}
