package org.example;

import java.util.*;

public class PracticeCollection {

    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);

        Set<Integer> st= new HashSet<>();
        st.add(1);
        st.add(1);
        System.out.println(st);
        System.out.println(st.contains(1));




    }
}



//List<Integer> list=new ArrayList<>(8);
//        list.add(6);
//        list.add(8);
//        list.add(9);
//        list.add(7);
//        list.add(10);
//        list.add(4);
//        list.add(2);
//        list.add(5);
//        System.out.println(list.size());
//        list.add(1);
//        list.add(3);
//        System.out.println(list.size());
//
//        System.out.println(list.get(1));
//        for(var num:list){
//            System.out.println(num);
//        }
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//
//        list.remove(4);
//        System.out.println(list);
//
//        System.out.println(list.contains(5));
//        list.clear();
//        System.out.println(list);
//
//        list.add(6);
//        list.add(8);
//        list.add(9);
//        list.add(7);
//        list.add(10);
//        list.add(4);
//        list.add(2);
//        list.add(5);
//        list.add(1);
//        list.add(3);
//        list.sort(null);
//
//        for(int i=0;i<list.size();i++){
//            if(list.get(i)%2==0){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);
//
//        Integer[] arr= list.toArray(new Integer[0]);
//        System.out.println(arr[2]);
//        List<Integer> list1=new ArrayList<>(Arrays.asList(arr));
//        System.out.println(list1);
//
//        list1.sort((a,b)->b-a);
//        System.out.println(list1);
//        Collections.shuffle(list);
//        System.out.println(list);