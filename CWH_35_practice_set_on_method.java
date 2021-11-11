package com.company;
import java.util.Scanner;
public class CWH_35_practice_set_on_method {
    static void multiplication(int n ){
       for (int i = 1; i<= 10;i++) {
//           System.out.println(n +" X "+ i + " = " + (n*i));
           System.out.format("%d X %d = %d \n",n,i,n*i);
       }
    }
    static void pattern(int n){
        for(int i= 0 ; i<n; i++){
            for (int j=0 ; j<i+1 ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    // sum(n) = 1+2+3+4.....n
    // sum(n) = 1+2+3+4....n-1+ n
    // sum(n) = sum(n-1) + n
    static int sumRec(int n ){
        if(n==1){
            // base condition
            return 1;
        }
        else{
            return n + sumRec(n-1);
        }
    }
    public static void pattern_2(int n){
        for(int i= n; i>0 ; i--){
            for (int j=0 ; j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public  static int fib(int n){
        /*if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }*/
        if(n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    static float average(float...avg){
        float sum=0;
        for (float element :
                avg) {
            sum+=element;
        }
        return sum/avg.length;
    }

    // pattern1_rec(3)
    // pattern1_rec(2) +  3 times star and new line
    // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
    static void pattern1_rec(int n){
      if(n>0){
          pattern1_rec(n-1);
          for (int i=0 ; i<n ; i++){
              System.out.print("*");
          }
          System.out.println(" ");
      }
    }
    /*
        * * *
        * *
        *
     */
    // pattern1_rec(3)
    //   3 times star and new + line pattern1_rec(2)
    //    3 times star and new line + 2 times star and new line + pattern1_rec(1)
    //   3 times star and new line + 2 times star and new line + 1 times star and new line + pattern1_rec(0)

    static int sum_n_num(int n){
      int sum = 0;
        for (int i=n; i>=0;i--){
            sum+=i;
        }
        return sum;
    }
    // sum(n) = 1+2+3+4.....n
    // sum(n) = 1+2+3+4....n-1+ n
    // sum(n) = sum(n-1) + n
     static void pattern2_rec(int n){
         if(n>0){
            for (int i=0 ; i<n ; i++) {
                System.out.print("*");
            }
             System.out.println(" ");
            pattern2_rec(n-1);
         }
     }
     static int fahrenheit_to_celsius(int c){
         int fahrenheit;
         fahrenheit = (int)(( c * 1.8 ) + 32); //type casting to int
         return fahrenheit;
     }
    // Fahrenheit (°F) = (Celsius x 1.8) + 32

    public static void main(String[] args){
        // Write a java method to print multiplication table of a number n
        System.out.println("This method will print the 7 table!");
        multiplication(7);

        System.out.println("*****************************************************************************************************************************");
        // Write a program using function to print the following pattern::
//        x
//        xx
//        xxx
//        xxxx
        System.out.println("This program will return a pattern_1 !");
        pattern(4);

        System.out.println("*****************************************************************************************************************************");
        //Write a recursive function to calculate sum of first n natural number
        int c = sumRec(4);
        System.out.println("The sum of first n natural number using recursive is :: " + c);

        System.out.println("*****************************************************************************************************************************");
        //Write a function to print the following pattern
//        * * * *
//        * * *
//        * *
//        *
        System.out.println("This program will return a pattern_2 !");
        pattern_2(4);

        System.out.println("*****************************************************************************************************************************");
        // Write a function to print nth term of fibonacci series using recursion
        // fibonacci series -: 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21
        int  result = fib(4);
        System.out.println("This program will return the fibonacci series of 4 using recursion :: " + result);

        System.out.println("*****************************************************************************************************************************");
        // write a program to find the average of a set of number passed as arguments
        System.out.println("The avg of 45 , 46, 89 and 90  this number is :: "+ average(45,46,89,90) );

        System.out.println("*****************************************************************************************************************************");
        // Write a program using recursive to print the following pattern::
//        x
//        xx
//        xxx
//        xxxx
        System.out.println("This program will print the pattern-1 using recursive approach!");
        pattern1_rec(6);

        System.out.println("*****************************************************************************************************************************");
        //Write a recursive function  to print the following pattern
//        * * * *
//        * * *
//        * *
//        *
        System.out.println("*****************************************************************************************************************************");
        System.out.println("This program will print the pattern2 using recursive! ");
        pattern2_rec(5);

        System.out.println("*****************************************************************************************************************************");
        // Write a function to convert celsius temperature into fahrenheit
        // Fahrenheit (°F) = (Celsius x 1.8) + 32
        System.out.println("This program will convert celsius temperature into fahrenheit :: ");
        System.out.println("please enter temperature in celsius and this program will convert it into fahrenheit :: ");
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        System.out.println("The temperature in fahrenheit is :: "+ fahrenheit_to_celsius(celsius));

        System.out.println("*****************************************************************************************************************************");
        // Write iterative function to calculate sum of first n natural number
        System.out.println("This program will print the sum first n natural number! ");
        System.out.print("Enter the value of n :: ");
        int num = sc.nextInt();
        System.out.println("The first n natural number is :: "+ sum_n_num(num));
    }
}
