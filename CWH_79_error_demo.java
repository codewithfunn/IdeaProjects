package com.company;

import java.util.Scanner;

public class CWH_79_error_demo {
    public static void main(String[] args){
        // Syntax error demo
        // int a = 2 Error: no semicolon!
        // b = 45;  Error: b is not declared!

        // Logical error demo
        // write a program to print all prime numbers b/w 1 to 10
        System.out.println(2);
        for (int i=1 ; i<5;i++){
            System.out.println(2*i+1);
        }
        // result -> 2 3 5 7 (9) is not a prime num -> logical error

        // Runtime error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("The Integer part of 1000 divided by k is :: " + 1000/k);
    }
}
