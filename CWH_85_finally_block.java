package com.company;
/*
* java finally block.
    Finally, block contains the code which is always executed whether the exception is handled or not.
    * It is used to execute code containing instruction to release the system resources, close a connection etc */
public class CWH_85_finally_block {
    public static int greet(){
        try{
            int a=50;
            int b=10;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources.......This is the end of this function!");
        }
        return -1;
    }
    public static void main(String[] args){
        int k = greet();
        System.out.println(k);
        int a = 50;
        int b =20;
        while(true){
            try{
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for value of b = " + b);
            }
            b--;

            try{
                System.out.println(50/2);
            }finally {
                System.out.println("yes i can write try with finally !");
            }
        }
    }
}
