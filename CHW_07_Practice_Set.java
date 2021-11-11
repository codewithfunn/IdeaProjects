package com.company;
import java.util.Scanner;
public class CHW_07_Practice_Set {
    public static void main(String[] args){
//        write a program to sum three number in java
        System.out.println("We are creating a program to sum the given number");
        int num1 = 12;
        int num2 = 23;
        int num3 = 45;
        int sum = num1 + num2 + num3;
        System.out.println("The sum of given number is : " + sum);

//        Write a program to calculate CGPA using marks of three subjects(out of 100)
        Scanner sc = new Scanner(System.in);
        System.out.println("We are creating a program to calculate the CGPA of a given student");

        System.out.println("Enter your Maths Marks");
        float math = sc.nextFloat();
        System.out.println("Enter your Science Marks");
        float science = sc.nextFloat();
        System.out.println("Enter your English Marks");
        float english = sc.nextFloat();
        float total = math+ science + english;
        float avg = total / 30;
        System.out.println("The CGPA of given Number is : "+ avg);
//Write a java program which asks the user to enter his/her name and greets them with "hello <name>, have a good day" text
        System.out.println("this program get name as a input");
        System.out.print("Please Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Hello "+name+" , have a good day");
// Write a Java program to convert kilometer to miles
        System.out.println("Please Enter the distance in Kilometer and this program will convert it into miles");
        float distance_in_kilometer = sc.nextFloat();
        float distance_in_miles = distance_in_kilometer * 1.609344f;
        System.out.println("The distance in Miles : "+ distance_in_miles);
//        Write a program to detect whether a number entered by the user is integer or not
        System.out.println("This program will return true if the user enter integer value and false otherwise");
        boolean enter_value = sc.hasNextInt();
        System.out.println("The value entered by user is a integer if it will return : " + enter_value);



    }
}
