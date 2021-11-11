package com.company;
// write a program to calculate (recursion must be used) factorial of a number in java?
public class CWH_34_recursion {
    static int factorial(int n ){
        //factorial(n) = n * (n-1) .... * 1
        //factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
        // factorial(n) = n * factorial(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else {
             return  n *  factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if (n==1 || n==0){
            return 1;
        }
        else {
            int product = 1;
            for (int i =1; i <= n; i++) {
                product *= i;
            }
            return product;
        }

    }
    public static void main(String[] args){
        int x = 5;
        System.out.println("This program will solve recursion problem!");
        System.out.println("the value of x is :: " + x);
        System.out.println("Getting the factorial of n using recursive approach :: "+ factorial(x));
        System.out.println("Getting the factorial of n using iterative approach :: " + factorial_iterative(x));
    }

}
