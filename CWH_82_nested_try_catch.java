package com.company;

import java.util.Scanner;

public class CWH_82_nested_try_catch {
    public static void main(String[] args){
        int [] marks = new int[3];
        marks[0] = 54;
        marks[1] = 32;
        marks[2] = 24;


        // write a java program that allows you to keep accessing an array until a
        // valid index is given by the user

        boolean flag = true;

        while(flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();

            try{
                try{
                    System.out.println("The value at index no "+ind+" is :: "+marks[ind]);
                    System.out.println("You are entering a valid index number!");
                    flag = false;
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist!");
                    System.out.println("Exception in Level 2!");
                }
            }catch (Exception e){
                System.out.println("Exception in Level 1");
            }
        }
        System.out.println("thanks for using this program!");
    }
}
