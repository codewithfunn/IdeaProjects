package com.company;
import  java.util.Scanner;
public class CWH_16_Conditionals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age ");
        int age = sc.nextInt();
//        the syntax of an if-else statement in C looks like that of  C++ and JavaScript . Java has a Similar Syntax too
        if(age >18){
            System.out.println("Yes boy you can drive!");
        }else {
            System.out.println("No boy you cannot drive Yet!");
        }

    }
}
