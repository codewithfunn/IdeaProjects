package com.company;

import java.util.Scanner;

public class CWH_25_practice_set_4 {
    public static void main(String[] args){
//        Write a program to print the following pattern
        /*
        *
        **
        ***
        ****
        *****
         */
        Scanner sc = new Scanner(System.in);
     /*   System.out.print("Enter the value of n :: ");
        int n = sc.nextInt();
        for (int i=n ; i>0; i--){
            for (int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

       /* *//* write a program to sum first n even number using while loop*//*
        System.out.println("Enter the value of n and this program will return you sum of first n number");
        System.out.print("please enter the number :: ");
        int n1 = sc.nextInt();
        int i = 0;
        int sum =0;
        while(i<n1){
            sum = sum + (2*i);
            i++;
        }
        System.out.println("Sum of even number is :: "+sum);*/

//        Write a program to print multiplication table of a given number n
/*
        System.out.println("Enter the value of n and this program will return the table");
        int n = sc.nextInt();

        for (int  j=1 ,i =10 ; i >=1 ; i--,j++ ){
            System.out.println( n +" x "+j+" = "+(j*n));

        }
*/


//        Write a program to print multiplication table of 10 in reverse order
        /*System.out.println("Enter the value of n and this program will return the table in reverse order");
        int n1 = sc.nextInt();
        for (int i =10 ; i > 0 ; i-- ){
            System.out.println( n1 +" x "+i+" = "+(i*n1));
        }*/

//        Write a program to find factorial of a given number using for loop
//        what is factorial  n = n * n-1 * n-2 * n-3 * n-4..... 1
//        5! = 5 * 4 * 3 * 2 * 1
        /*System.out.println("Enter the value of n and this program will return the factorial of n");
        int n2 = sc.nextInt();
        int factorial=1;
        for (int  i=1; i<=n2 ; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of n is :: "+ factorial);
*/

//      Write a program to calculate the sum of the number in the multiplication table of 8
        System.out.println("Enter the value of n and this program will return the sum of n table ");
        System.out.print("Please enter the value :: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i=1 ; i<=10 ; i++){
//            System.out.println(i);
            sum = sum+(num*i);
        }
        System.out.println("The sum of n number is :: "+ sum);

    }
}
