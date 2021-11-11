package com.company;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int noOfGuesses = 0;
    public int inputNumber;
//    public int getNoOfGuesses() {
//        return noOfGuesses;
//    }
//
//    public void setNoOfGuesses(int noOfGuesses) {
//        this.noOfGuesses = noOfGuesses;
//    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }
    public void  takeUserInput(){
        System.out.println("Please Enter a number :: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    public boolean isCorrectNumber(){
        noOfGuesses++;
    if (inputNumber==number){
        System.out.format("Yes you guessed it right , it was %d \n You guessed it in %d attempts",number , noOfGuesses );
        return true;
    }
    else if(inputNumber> number){
        System.out.println("Num you are entered is too high!");
    }
    else {
        System.out.println("Num you are entered is too low!");
    }
    return false;
    }
}

public class CWH_50_ex2sol {
    public static void main(String[] args) {
        /*
        * Create a class Game , which allows a user to play "Guess the Number" game once. Game should have the following methods:-
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
         * Use properties such as noOfGuesses(int) , etc. to get this task done!
         */
        Game obj = new Game();
        boolean b = false;
       while(!b){
           obj.takeUserInput();
           b=obj.isCorrectNumber();
       }
    }
}
