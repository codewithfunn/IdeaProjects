package com.company;
import java.util.Scanner;
public class CWH_23_for_loop {
    public  static void main(String[] args){
//        for (int i=1; i<=10; i++){
//            System.out.println("the value of i is :: "+ i);
//        }
//        2n -> return even number
//        2n + 1 -> return odd number
//        Quick Quiz : Write a program to print first n odd number using a for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and this program will return first n odd number ");
        /*int n = sc.nextInt();
        for (int i=0 ; i<=n ; i++){
            System.out.println("The value of n is :: "+((2*i)+1));
        }*/
//        Quick Quiz : write a program to print first n natural number in reverse order
        System.out.print("Enter the value of n and this program will return n in decrement order :: ");
        int n = sc.nextInt();
        for (int i=n; i!=0; i--){
            System.out.println("the value of n in decrement order is :: "+i);
        }
//        this loop will run until i become 0
    }
}
