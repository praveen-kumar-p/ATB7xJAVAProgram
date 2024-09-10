package AUGUST.Aug_ex24082024;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab054 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add("Node 1");
        l.add("Node 2");
        l.add("Node 3");
        System.out.println(l);

        // The storage will be like "a"-->"b"-->"c" [Node 1, Node 2, Node 3]

        ArrayList l1 = new ArrayList();
        l1.add("Node 1");
        l1.add("Node 2");
        l1.add("Node 3");
        System.out.println(l1);

        // The storage will be [Node 1, Node 2, Node 3]
    }
}
