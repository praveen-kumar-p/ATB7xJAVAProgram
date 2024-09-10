package AUGUST.Aug_ex24082024;

import java.util.*;

public class Lab058 {
    public static void main(String[] args) {

        // List -- allows the duplication of elements
        // Set -- does not allow duplicated of elements

        // 3 types of Sets
        // 1 HashSet
        // 2 LinkedHashSet
        // 3 TreeSet


        //HashSet -- Mechanism to store the elements but "No Order". And duplicate will not be allowed
        Set hs = new HashSet();
        hs.add("Kiwi");
        hs.add("Apple");
        hs.add("Grapes");
        hs.add("Grapes");
        hs.add("null");
        hs.add("Orange");
        hs.add("WaterMelon");
        System.out.println(hs);
        // HashSet output = [Apple, Kiwi, Grapes, WaterMelon, Orange]
        System.out.println("---------------------------------------------------");

        // LinkedHashSet -- Order will be maintained but Duplicate now allowed
        Set lhs = new LinkedHashSet();
        lhs.add("Grapes");
        lhs.add("Banana");
        lhs.add("Gauva");
        lhs.add("null");
        lhs.add("Cherry");
        System.out.println(lhs);
        // LinkedHashSet = [Grapes, Banana, Gauva, Cherry]

        System.out.println("-------------------------------------------");
        // TreeSet -- Automatic Sorted based on First Letter
        // In this null not allowed
        Set ts = new TreeSet();
        ts.add("Watermellon");
        ts.add("Grapes");
        ts.add("Banana");
        ts.add("Guava");
        ts.add("Apple");
        ts.add("Cherry");
        System.out.println(ts);
        // TreeSet = [Apple, Banana, Cherry, Grapes, Guava, Watermellon]

        System.out.println("-------------------------------------");
//        To Print each elements
        for (Object s : ts){
            System.out.println(s);
        }
        System.out.println("--------------------------");
        for (Object l: lhs){
            System.out.println(l);
        }
        System.out.println("--------------------------");
        for (Object h : hs){
            System.out.println(h);
        }
    }
}
