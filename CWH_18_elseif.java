package com.company;
import  java.util.Scanner;
public class CWH_18_elseif {
    public static void main(String[] args) {
        System.out.print("Please Enter your age :: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

//      Switch Case Control Instruction
//        Switch-Case is used when we have to make a choice b/w number of alternative for a given variable
//        variable can be an integer,character or String in java
        switch (age) {
            case 18: {
                System.out.println("You are going to become an Adult!");
                break;
            }
            case 23: {
                System.out.println("You are going to join a job!");
                break;
            }
            case 60: {
                System.out.println("You are going to retired!");
                break;
            }
            default: {
                System.out.println("Enjoy your life!");
            }

            System.out.print("Please enter your name :: ");
            String name = sc.next();
//            enhance switch

            switch (name) {
                case "harry" -> {
                    System.out.println("You are going to become an Adult!");
                }
                case "jaspreet" -> {
                    System.out.println("You are going to join a job!");
                }
                case "shubham" -> {
                    System.out.println("You are going to retired!");
                }
                default -> {
                    System.out.println("Enjoy your life!");
                }
            }





/*
        System.out.print("Please Enter your age :: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
//        else-if ladder
//        Instead of using multiple if statement, we can also use else if  along with if thus forming an if-else-if-else ladder
//        Using such kind of logic reduce indents. last else is executed only if all the condition fail
        if(age>52){
            System.out.println("You are experienced");
        }
        else if(age>45){
            System.out.println("You are semi-experienced");
        }
        else if(age>32){
            System.out.println("You are semi-semi-experienced");
        }
        else {
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }*/
        }
    }
}
