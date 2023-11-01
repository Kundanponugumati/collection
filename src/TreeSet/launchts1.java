package TreeSet;

import java.util.TreeSet;

public class launchts1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(25);
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);
        System.out.println(ts.ceiling(140));
        System.out.println(ts.higher(140));
        System.out.println(ts.ceiling(150));
        System.out.println(ts.higher(150));
        System.out.println(ts.floor(140));
        System.out.println(ts.floor(150));
        System.out.println(ts.lower(140));
        System.out.println(ts.lower(150));
        System.out.println(ts.subSet(25,125));
        System.out.println(ts.headSet(100));
        System.out.println(ts.tailSet(35));

    }
}
