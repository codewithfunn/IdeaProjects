package com.company;

public class CWH_86_ps14 {
    public static void main(String[] args){
        // 1.  write a java program to demonstrate syntax, logical & runtime errors

         // syntax error
        //int a = 43 -> semicolon is missing

        // logical error
        // prime number example
        System.out.println(1);
        for( int i= 1; i<5; i++ ){
            System.out.println(2*i+1);
        }

        // runtime error
        int c = 10;
        int d = 0;
        //int res = c/d; return runtime exception
        //System.out.println(res); return runtime / zero exception
    }
}
