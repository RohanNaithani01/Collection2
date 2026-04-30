package org.example;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.PriorityQueue;
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
        System.out.println(ts.floor(1)); // <= 1
        System.out.println(ts.ceiling(2)); // >= 2
        for(var num: ts){
            System.out.println(num);
        }

        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(2);
        ad.offer(1);
        ad.offer(4);
        ad.offer(3);
        for(var num:ad){
            System.out.println(num);
        }
        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.pop());
        System.out.println(ad);

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        pq.offer(1);
        pq.offer(0);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
