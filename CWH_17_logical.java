package com.company;

public class CWH_17_logical {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;

        if(a && b){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        if(a || b){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        System.out.println("For logical Not ");
        System.out.println("Not(a) is "+!a);
        System.out.println("Not(b) is "+!b);
    }
}
