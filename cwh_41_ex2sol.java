package com.company;
import java.util.Scanner;
import java.util.Random;
public class cwh_41_ex2sol {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for paper
        // 2 for Scissor
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock , 1 for Paper , 2 for Scissor ");
        int userInput = sc.nextInt();
        Random random = new Random();
        int ComputerInput = random.nextInt(3);

        if(userInput == ComputerInput){
            System.out.println("Draw");
        }
        else if(userInput==0 && ComputerInput==2 || userInput==1 && ComputerInput== 0 || userInput==2 && ComputerInput==1 ){
            System.out.println("You Win!");
        }
        else{
            System.out.println("Computer Win!");
        }
        if(ComputerInput == 0){
            System.out.println("Computer Choice is Rock");
        }
        else if(ComputerInput == 1){
            System.out.println("Computer Choice is Paper");
        }
        else {
            System.out.println("Computer Choice is Scissor");
        }
    }
}
