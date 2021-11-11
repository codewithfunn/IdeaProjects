package com.company;

public class CWH_Ch2_Operator {
    public static void main(String[] args) {
//        Types of Operator in java
//        1. Arithmetic Operator
//        2. Assignment Operator
//        3. Comparison Operator
//        4. logical Operator
//        5. Bitwise Operator

        // 1. Arithmetic Operator
        System.out.println("Arithmetic Operator in java");
        float num1 = 12f;
        float num2 = 34f;
        int condition1 = 12;
        int condition2 = 15;

        System.out.println("the Addition of num1 and num2 is :"+(num1 + num2));
        System.out.println("the Subtraction of num1 and num2 is :"+(num1 - num2));
        System.out.println("the Multiplication of num1 and num2 is :"+(num1 * num2));
        System.out.println("the division of num1 and num2 is :"+(num1 / num2));
        System.out.println("the Modular division of num1 and num2 is :"+(num1 % num2));
        System.out.println("the pre-Increment Operator  :"+(++num1));
        System.out.println("the post-Increment Operator  :"+(num1++));
        System.out.println("the pre-Decrement Operator :"+(--num1));
        System.out.println("the post-Decrement Operator :"+(num1--));
        System.out.println("the Modular division of num1 and num2 is :"+(num1 % num2));

        System.out.println("Assignment Operator in java");
        //2. Assignment Operator
        System.out.println(" < = > this sign is used to assign value to a variable ");
        System.out.println(" num1 += num2 is evaluate  num1 = num1 + num2 " + (num1 += num2));
        System.out.println(" num1 -= num2 is evaluate  num1 = num1 - num2 " + (num1 -= num2));
        System.out.println(" num1 *= num2 is evaluate  num1 = num1 * num2 " + (num1 *= num2));
        System.out.println(" num1 /= num2 is evaluate  num1 = num1 / num2 " + (num1 /= num2));
        System.out.println(" num1 %= num2 is evaluate  num1 = num1 % num2 " + (num1 %= num2));

        System.out.println("Comparison Operator in java");
        //3. Comparison Operator
        System.out.println("num1 == num2 it will return true if both number has a same value"+(num1==num2));
        System.out.println("num1 >= num2 it will return true if num1 is greater then or equal to num2" + (num1>=num2));
        System.out.println("num1 <= num2 it will return true if num1 is smaller than or equal to num2"+(num1 <= num2));

        //4. logical Operator
        System.out.println("Logical Operator in  java");
        System.out.print("45>9 && 90<100 it will return true if both condition has a same value ");
        System.out.println((90 < 100) && (45 > 9));
        System.out.print("44<9 && 90<100 it will return true if one of the condition meet " );
        System.out.println((45<9) || (90<100));
        System.out.print("!45<9 it will return true if condition is evaluated false ");
        System.out.println(!(45<9));

        //5. Bitwise Operator
        System.out.println("Bitwise Operator in java");
//            10
//          & 11
//        -----------
//            10
        System.out.println("2 & 3 it will return 2 "+(2&3));

//        10
//      | 11
//      ----------
//        11
        System.out.println("2|3 it will return 3"+(2|3));
    }
}
