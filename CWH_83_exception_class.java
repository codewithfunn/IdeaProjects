package com.company;
/*
* Exception class in java
    * we can write our custom Exception using Exception class in java
 */

/*
 *The Exception class has following important methods:
 * String toString() -> execute when Sout(e) is non
 * void printStackTrace() -> prints Stack trace
 * String getMessage() -> prints the Exception message
 */

/*
* Throw Keyword
    * The Throw Keyword is used to throw an exception explicitly by the programmer */
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am a toString!";
    }
    @Override
    public String getMessage(){
        return "I am a getMessage!";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString(){
        return "Age cannot be greater than 120!";
    }
    @Override
    public String getMessage(){
        return "Make sure the value enter for age is correct";
    }
}

public class CWH_83_exception_class {
    public static void main(String[] args){
        int a ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                /* throw new MyException();
                throw new ArithmeticException(); */
                throw  new MaxAgeException();

            } catch (MaxAgeException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
