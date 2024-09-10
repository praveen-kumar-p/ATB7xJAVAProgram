package AUGUST.Aug_ex24082024;

import java.util.PriorityQueue;

public class QueueLab059 {
    public static void main(String[] args) {

        // Queue --> It is used less than(<) 1% in Automation
        // Duplicated not allowed
        PriorityQueue p = new PriorityQueue();
        p.offer("18");
        p.add("20");
        p.offer("5");
        p.add("1");
        p.add("10");
        System.out.println(p);
        p.peek();
        System.out.println(p);
    }
}
