package Generics.CovarienceAndInvarince;

import java.util.*;

public class AchivingCovariance {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        // ✅ Covariant reference:
        // We're telling Java: l1 can point to a list of any type that extends Number (like Integer, Double, Float, etc.)
        List<? extends Number> l1 = a1;

        // ✅ We can read the data because every element is guaranteed to be a Number or its subtype
        for (Number number : l1) {
            System.out.println(number);
        }

        // ❌ l1.add(12); 
        // Compile-time error: We cannot add elements because the exact subtype is unknown (could be Integer, Double, etc.)
        // Java prevents adding to ensure **type safety**
    }
}
