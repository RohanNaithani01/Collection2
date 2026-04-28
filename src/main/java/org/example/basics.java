package org.example;

import java.util.HashSet;
import java.util.TreeSet;

public class basics {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(3);
        hs.add(0);
        hs.add(2);
        hs.add(4);
        System.out.println(hs);
        hs.remove(2);
        System.out.println(hs);
        for (var num:hs){
            System.out.println(num);
        }

        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(0);
        ts.add(-1);
        System.out.println(ts);
        System.out.println(ts.floor(1));
        System.out.println(ts.ceiling(2));

    }
}
