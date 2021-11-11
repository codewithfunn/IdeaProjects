package com.company;

public class CWH_31_methods {
     int logic(int x , int y){
        int result ;
        if(x >y){
            result = x+y;
        }
        else{
            result = (x+y)*5;
        }
        return result;
    }
    public static void main(String[] args){
        // sometimes our program grows in size, and we want to separate logic of main method to other method
        /*Syntax of a Method
        * A Method is a function written inside a class . Since java is an object-oriented  language, we need to write the method inside some class */
        int a = 6;
        int b = 5;
        int c ;
        if(a>b){
            c = a+b;
        }
        else{
            c = (a+b)*5;
        }
        int a1 = 1;
        int b1 = 3;
        int c1;
        if(a1>b1){
            c1 = a1+b1;
        }
        else{
            c1 = (a+b)*5;
        }
        System.out.println("*********************************************************************************************************************");
//        System.out.println(logic(a,b));
        System.out.println(c);

        System.out.println("*********************************************************************************************************************");
//        int c2;
//        CWH_31_methods obj = new CWH_31_methods();
//        c2 = obj.logic(a1,b1);
//        System.out.println(c2);
//        Method invocation using object creation
//        calling a Method
//        A Method can be called by creting an object of the class in which the method exists followed by the method called
//        lagic  obj1 = new logic(); Object Creating
//        obj.logic(a,b);
//        System.out.println(logic(a1,b1));
        System.out.println(c1);
    }
}
