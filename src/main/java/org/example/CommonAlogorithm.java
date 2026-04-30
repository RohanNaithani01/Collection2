package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommonAlogorithm {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(3);
        list.add(-1);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(Collections.frequency(list,3));
//        System.out.println(Collections.binarySearch(list,2));
        System.out.println(Math.pow(2,3));
    }
}
