package org.example;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDataStructure {
    public static void main(String[] args) {
        HashMap<Integer, String> mp=new HashMap<>();
        mp.put(1,"Rohan");
        mp.put(2,"Raj");
        mp.put(3,"Mohit");
        mp.put(4,"Rohit");
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.get(3));

        TreeMap<Integer, String> tm= new TreeMap<>();
        tm.put(1,"Rohan");
        tm.put(2,"Raj");
        tm.put(3,"Mohit");
        tm.put(4,"Rohit");
        System.out.println(tm);
        System.out.println(tm.get(2));
        System.out.println(tm.get(4));
        Set<Integer> st= tm.keySet();
        System.out.println(st);
        System.out.println(tm.ceilingKey(2));
        System.out.println(tm.floorKey(3));
        System.out.println(tm.floorEntry(1));
    }
}
