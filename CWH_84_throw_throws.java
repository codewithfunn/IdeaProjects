package com.company;
/*
The Throws exception
    * The java throws keywords is used to declare an exception. This gives an information to the
    * programmer that there might be an exception so, it better to be prepared with a try catch block

*/

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative!";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative";
    }
}

public class CWH_84_throw_throws {
    public static double AreaOfCircle(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r *r;
        return result;
    }
    public static int divide(int a , int b) throws ArithmeticException{
        // Made by harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args){
        // Shivam - uses divide function created by harry
        try{
            int c = divide(2,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception!");
        }
        //  area of circle
        //double r = AreaOfCircle(2); you have to handle exception first
        try{
            double r = AreaOfCircle(-1);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
