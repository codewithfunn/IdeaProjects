package com.company;
import java.util.Scanner;

public class CWH_06_CBSE_Marks {
    public static void main(String[] args){
// write a program to calculate percentage of a given student in CBSE board exam his marks from 5 subject must be taken as input from keyboard. (Marks are out of 100)
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will calculate your percentage in CBSE board exam");
        System.out.println("Enter your Math Marks");
        float math = sc.nextFloat();
        System.out.println("Enter your Science Marks");
        float science = sc.nextFloat();
        System.out.println("Enter your English Marks");
        float english = sc.nextFloat();
        System.out.println("Enter your Hindi Marks");
        float hindi = sc.nextFloat();
        System.out.println("Enter your S.S.T Marks");
        float sst = sc.nextFloat();
        float total = math + science + english + hindi + sst;
        float percentage = total/500 * 100;

        System.out.println("The percentage of input marks is: "+ percentage);
    }
}

