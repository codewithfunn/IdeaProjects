package com.company;
import  java.util.Scanner;


public class CWH_12_ps2 {
    public static  void main(String[] args){

//    Practice set
//    what will be the result of the following expression
        float ans = 7/4.0f * 9/2.0f ;
        System.out.println("the value of a is :: " + ans);

//    write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade
        System.out.println("please enter your grade and this program will encrypt your grade");

        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        grade = (char)(grade + 8);

        System.out.println("Your encrypted grade is :: " + grade);

        char de_grade = (char)(grade - 8);
        System.out.println("this will decrypt your grade :: " + de_grade);

//      use comparison operator to find out whether a given number is greater than the user entered number oR not

        System.out.println("This program will return true if the user enter 30 Or more than that ");

        int user_inp = sc.nextInt();
        boolean result = 30 <= user_inp;
        if(result) {
            System.out.println("The number is greater than Or equal to  default number ");
        }
        else{
            System.out.println("the number is smaller than default number");
        }
//      Write the following expression in a given program
//        v^2 - u^2 /2as

        System.out.println("please Enter the value of v , u , a and s");
        float v = sc.nextFloat();
        float u = sc.nextFloat();
        float a = sc.nextFloat();
        float s = sc.nextFloat();

        float R = ((v*v) - (u*u)) / (2*a*s);
        System.out.println("the result is equal to :: " + R);

//      find the value of the following expression
        int x = 7;
        int res = 7*49/7 + 35/7;
        System.out.println("the result is equal to :: " + res);

    }
}
