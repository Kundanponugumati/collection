package linkedList;

import java.util.*;

public class launchll2 {
    public static void main(String[] args) {
        System.out.println("hello");
        LinkedList list = new LinkedList();
        list.add(30);
        list.addFirst(20);
        System.out.println(list);
        LinkedList ll1 = new LinkedList();
        ll1.add(30);
        ll1.addFirst(20);
        System.out.println(ll1);
        ll1.clear();
        ll1.add("java");
        System.out.println(ll1);
        System.out.println(ll1.contains("javaa"));
        ll1.offer(23);
        ll1.offerFirst(233);
        System.out.println(ll1);
        ll1.push(20);
        System.out.println(ll1);
        ll1.addFirst(21);
        System.out.println(ll1);
        ll1.pop();
        System.out.println(ll1);
    }
}
