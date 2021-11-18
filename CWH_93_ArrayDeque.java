package com.company;

import java.util.ArrayDeque;
import java.util.Iterator;

public class CWH_93_ArrayDeque {
    public static void main(String[] args){
        ArrayDeque<Integer> ad1 = new ArrayDeque<>(5);
        ad1.add(1);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(2);
        ad1.addLast(0);
        System.out.println("getting the first element in arrayDeque :: "+ad1.getFirst());
        System.out.println("getting the last element in arrayDeque :: " + ad1.getLast());
        Iterator<Integer> it = ad1.iterator();

        for(int i=0; it.hasNext();i++ ){
            System.out.print(it.next());
            System.out.print(",");
        }
    }
}
