package com.company;

import java.util.Scanner;

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

        // 2. Write a java program that prints "Hafta" during Arithmetic exception and "Hehe" during an Illegal
        //    argument exception

        try{
            int a = 6666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }
        catch (ArithmeticException e){
            System.out.println("Hafta");
        }

        // 3. Write a program that allows you to keep accessing an array until a valid index is given . If
        //    max retries 5 print "Error"

        int [] marks = new int[3];
        marks[0] = 45;
        marks[1] = 53;
        marks[2] = 9;
        boolean flags = true;
        Scanner sc = new Scanner(System.in);
        int ind;
        int i = 0;
        while(flags && i<5){
            try {
                System.out.println("Enter the value of index ");
                ind = sc.nextInt();
                System.out.println("The value of marks[ind] is " + marks[ind]);
                flags = false;
            }
            catch (Exception e){
                System.out.println("Invalid index ");
                i++;
            }

        }
    }
}
