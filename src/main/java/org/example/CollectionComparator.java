package org.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionComparator {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(0);
        list.add(3);
        list.sort((a,b)->b-a);
        System.out.print(list);
    }
}
