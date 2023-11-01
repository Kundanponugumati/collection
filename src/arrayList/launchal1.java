package arrayList;
import java.util.*;
public class launchal1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(30);
        list.add(25);
        list.add("hello");
        list.add(43.5);
        list.add('j');
        System.out.println(list);
        System.out.println("***************");
        ArrayList list2 = new ArrayList();
        list2.addAll(list);
        list2.add("we can add whole collection of data into another collection");
        System.out.println(list2);
        System.out.println("***************");
        List list3 = new ArrayList();
        list3.add(20);
        list3.add(20);
        list3.add(20);
        list3.add(2,"spring");
        System.out.println(list3);
        System.out.println(list3.isEmpty());

    }
}
