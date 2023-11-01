package HashSet;

import java.util.*;

public class launchhs1 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(25);
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(75);
        hs.add(75);
        hs.add(125);
        hs.add(175);
        System.out.println(hs);
        System.out.println("*************");
        LinkedHashSet hs1 = new LinkedHashSet();
        hs1.add(25);
        hs1.add(100);
        hs1.add(50);
        hs1.add(150);
        hs1.add(75);
        hs1.add(75);
        hs1.add(125);
        hs1.add(175);
        System.out.println(hs);
    }
}
