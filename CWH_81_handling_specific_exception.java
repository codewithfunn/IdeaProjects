package com.company;

import java.util.Scanner;

public class CWH_81_handling_specific_exception {
    public static void main(String[] args){
        // Handling specific exception
        // In java, we can handle specific exceptions by typing multiple catch blocks
        int [] marks = new int[3];
        marks[0] = 42;
        marks[1] = 54;
        marks[2] = 24;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();

        try{
            System.out.println("the value of array index entered is : " + marks[ind]);
            System.out.println("the value of array -> value/number is : " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Some ArithmeticException Occurred!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Some Array index out of bound Exception Occurred!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some Other Exception Occurred!");
            System.out.println(e);
        }

    }
}
