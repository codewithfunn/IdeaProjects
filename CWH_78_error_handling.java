package com.company;

/*
    No matter how smart we are , errors are our constant companions with practice , we keep getting better
    at finding & Correcting them

    * there are three type of errors in java
    1. Syntax error
    2. Logical error
    3. Runtime error
     */
public class CWH_78_error_handling {
    public static void main(String[] args){
        /*
        * Syntax error -> when compiler finds something wrong with our program it throws a Syntax error */
        int a = 56;
        System.out.println(a);
        //System.out.println(c); // through an error variable not declared
        /*

        Logical error -> A logical error or bug occurs when a program compiler and runs but does
                            the wrong things
         -> message delivered wrongly
         -> Wrong time of chats being displayed
         -> incorrect redirects

         */

        /*

         Runtime error -> java may sometimes encounter an error while the program is running. These
                          are also called exception
          -> These are encountered due to circumstance like bad input and resources constraints
          Ex. User Supplies 'S' + 5 to a program which adds 2 numbers

          Syntax errors and Logical errors are encountered by the programmer whereas  Runtime errors
          are encountered by the users

         */
    }
}
