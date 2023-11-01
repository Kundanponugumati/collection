package dequeue;

import java.util.ArrayDeque;

public class launchadq1 {

    public static void main(String[] args)
    {
        ArrayDeque ad = new ArrayDeque();
        ad.add(23);
        ad.addFirst("java");
        ad.addLast("end");
        System.out.println(ad);
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(23);
        ad1.add("java");
        ad1.add("end");
        System.out.println(ad1);

    }
}
