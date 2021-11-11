package com.company;
import java.util.Scanner;
public class CWH_19_ch4_ps {
    public static void main(String[] args){
//        what will be the output of this program question
//        int a = 10;
//        if (a=10){
//            System.out.println("I am 11");
//        }
//        else{
//            System.out.println("I am not 11");
//        } result an error int cannot be converted to boolean

// Write a program to find out a student is pass oR fail. if it required total of 40% and at least 33% in each subject and take marks as an input from the user
        byte physics,math,chemistry;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        physics = sc.nextByte();
        System.out.println("Enter your marks in Maths");
        math = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        chemistry = sc.nextByte();
        float avg = (physics + math +chemistry)/3.0f;
        System.out.println("Your overall percentage is :: "+avg);
        if (avg>40 && physics>=33 && math >=33 && chemistry>=33){
            System.out.println("Congratulations, You have been promoted!");
        }
        else {
            System.out.println("Sorry, you have not been promoted! Please try again.");
        }
        System.out.println("*********************************************************************************************************************************");

        float tax = 0;
        System.out.println("please Enter your annual income and this program will return your annual tax ");
        float income = sc.nextFloat();
// Calculate income tax paid by an employee to the government as per the slabs mentioned below ::--
//        income slabs           Tax
//        2.5l - 5.0l             5%
//        5.0l - 10.0l            20%
//        Above 10.0l             30%

//      there is no tax below 2.5l
        if(income <= 250000){
            tax = 0;
        }
        else if(income > 250000 && income <=500000){
            tax = tax + 0.05f *(income - 250000);
        }
        else if(income > 500000 && income <= 1000000){
            tax = tax + 0.05f *(income- 250000);
            tax = tax + 0.2f *(1000000 - 500000 );
        }
        else {
            tax = tax + 0.05f * (income - 250000);
            tax = tax + 0.2f * (500000 - 1000000);
            tax = tax + 0.3f * (income - 1000000);
        }
        System.out.println("The total tax paid by the employee is : "+tax);
        System.out.println("*********************************************************************************************************************************");

        System.out.println("Please enter \n\t 1 for Monday \n\t 2 for Tuesday \n\t 3 for Wednesday \n\t 4 for Thursday \n\t 5 for Friday  \n\t 6 for Saturday \n\t 7 for Sunday");
        byte day = sc.nextByte();
//        Write a java program to find out the day of the week given the number[ 1 for monday , 2 for tuesday and so on!]
        switch (day){
            case 1 -> System.out.println("Monday!");
            case 2 -> System.out.println("Tuesday!");
            case 3 -> System.out.println("Wednesday!");
            case 4 -> System.out.println("Thursday!");
            case 5 -> System.out.println("Friday!");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday!");
        }
        System.out.println("*********************************************************************************************************************************");
        System.out.println("Enter a year and this program will show you userEnter year is a leap year or not");
        int year = sc.nextInt();
        if((year%400 == 0 )|| ((year%100 != 0) && (year%4 ==0)) ){
            System.out.println("The year you are enter is a leap year!");
        }
        else {
            System.out.println("the year you are enter is not a leap year!");
        }
        System.out.println("Enter your Website and this program will return your domain extension ");
        String website = sc.next();
//        write a program to find out the type of website from the url
//        .com -> Commercial Website
//        .org -> Organisation Website
//        .in  -> Indian Website

        if(website.endsWith(".com")){
            System.out.println("This website is for commercial use");
        }
        else if(website.endsWith(".org")){
            System.out.println("This website is for Organisation use");
        }
        else if (website.endsWith(".in")){
            System.out.println("This website is used in India");
        }
        else {
            System.out.println("The Domain extension your are input is wrong!");
        }
    }
}
