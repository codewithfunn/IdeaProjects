package com.company;
import java.util.*;
public class CWH_92_LinkList {
    public static void main(String[] args){
        System.out.println("linkList in java");
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(12);
        l2.add(15);
        l2.add(18);

        l1.add(5);
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(3);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(l2);
        l1.addLast(585); // Insert a specific element at the end of this linkedList
        l1.addFirst(222);// Insert a specific element at the beginning of this LinkedList
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(5));// return the index of  specific element in the list in first occurrence
        System.out.println(l1.lastIndexOf(5));// return the index of specific element in the list in last occurrence
        System.out.println(l1.isEmpty()); // return true if Array list is empty
        Iterator<Integer> it = l1.iterator(); // iterator is used to iterate or loop through a specific ArrayList
        l1.remove(1); // remove the element in the specific position in the list
//        l1.removeAll(l2); // remove all the element that are contained in the specific collection
        l1.set(0,5); // Replace the element at the specific position in the list with the specific element
//        l1.clear();
//        l1.clone();
        for (int i=0 ; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
