package com.company;

public class CWH_80_exception_handling_try_catch {
    public static void main(String[] args){

        /*
  Exception in java
          -> An Exception is an event that occurs when a program is executed disrupting the normal
             flow of instructions

            * There are mainly two types of exceptions in java
              1. Checked Exception -> compile time exceptions ( handled by compiler )
              2. UnChecked Exception -> Runtime Exception

            * Commonly Occurring Exception
             -> Following are few commonly occurring exception in java
                    * Null Pointer Exception
                    * Arithmetic Exception
                    * ArrayIndexOutOfBound Exception
                    * IllegalArgument Exception
                    * NumberFormat Exception
         */

        int a = 6000;
        int b = 0;
        // Without using exception
//        int c = a/b;
//        System.out.println(c);

        // With using exception
        try{
            int c = a/b;
            System.out.println("The Result is : " + c );
        }catch (Exception e){
            System.out.println("We failed to divide. Reason : ");
            System.out.println(e);
        }
        System.out.println("End of the program!");
    }
}
