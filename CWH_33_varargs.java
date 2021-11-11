package com.company;
// A function with vararg can be created in java using the following syntax
public class CWH_33_varargs {
//    public static int sum(int a,int b ){
//     return a+b;
//    }
//    public static int sum(int a , int b , int c){
//        return a+b+c;
//    }
//    public static int sum (int a , int b , int c, int d){
//        return a+b+c+d;
//    }
//    static  int sum(int ...arr){
////        Available as int[] arr;
//        int result =0;
//        for (int a : arr) {
//            result += a;
//        }
//        return result;
//    }
    // if we want user  to enter at least one argument than
    public static int sum (int x ,int ...arr){
//        Available as int[] arr;
    int result =x;
    for (int a : arr) {
        result += a;
    }
    return result;
}

    public static void main(String[] args){
        System.out.println("Welcome to Varargs Tutorials!");
//        System.out.println("The sum of Nothing is :: " + sum()); this will throw an error
        System.out.println("The sum of 4 and 5 is :: " + sum(4,5) );
        System.out.println("The sum of 4,3 and 5 is :: " + sum(4,5,6) );
        System.out.println("The sum of 4,5,6 and 2 is :: " + sum(4,5,6,2));
    }
}

