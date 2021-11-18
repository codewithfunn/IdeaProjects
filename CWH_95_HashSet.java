package com.company;

import java.util.HashSet;

public class CWH_95_HashSet {
    public static void main(String[] args){
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(3);
        myHashSet.add(5);
        myHashSet.add(9);
        myHashSet.add(12);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
    }
}
