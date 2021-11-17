package com.company;

import java.util.Scanner;
class MaxRetries extends Exception{
    public String toString(){
        return "Number of try is exceed to 5 ";
    }
    public String getMessage(){
        return "Number of try is exceed to 5";
    }
}
public class CWH_86_ps14 {
//    public static void accessingAnArray() throws MaxRetries{
//        int [] mark =new int[3];
//        mark[0] = 23;
//        mark[1] = 25;
//        mark[2] = 3;
//        Scanner sc = new Scanner(System.in);
//        int index ;
//        int j= 0;
//        boolean flag = true;
//
//        while(flag&&j<5){
//            try{
//                System.out.println("Enter the value of index ");
//                index = sc.nextInt();
//                System.out.println("the value at "+ index +" is "+ mark[index]);
//                flag = false;
//            }
//            catch (Exception e){
//                j++;
//                System.out.println("invalid index number");
//            }
//        }
//        if(j<=6){
//            try{
//                throw new MaxRetries();
//            }catch (MaxRetries e){
//                System.out.println(e);
//            }
//        }
//    }
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
            if(i>=5){
                    System.out.println("Error");
            }
            }

        // modify program in Q3 to throw a custom Exception if max retries are reached

        int [] mark =new int[3];
        mark[0] = 23;
        mark[1] = 25;
        mark[2] = 3;
        int index ;
        int j= 0;
        boolean flag = true;

        while(flag&&j<5){
            try{
                System.out.println("Enter the value of index ");
                index = sc.nextInt();
                System.out.println("the value at "+ index +" is "+ mark[index]);
                flag = false;
            }
            catch (Exception e){
                j++;
                System.out.println("invalid index number");
            }
        }
        if(j<=6){
            try{
                throw new MaxRetries();
            }catch (MaxRetries e){
                System.out.println(e);
            }
        }

        // Wrap the program in Q3 inside a method which throws your custom Exception not fully understood
    }
}
