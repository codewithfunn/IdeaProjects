package com.company;

public class CWH_09_ch2_op_pre {
    public static void main(String[] args){
//        Precedence & Associativity
//  the operator are applied and evaluated based on precedence for example (+ , -) has  less precedence compared to (* ,/) hence * & / are evaluated first
//        int a = ((6*5) - (34/2)); // left to right evaluate
        /*
        Highest precedence goes to * and /. They are then evaluated on the basic of left to right associativity
            =30 - 34/2
            =30 - 17
            =13
         */
//        int b = 60/5 - 34*2;
        /*
            =12 - 34*2
            =12 - 68
            =-56
         */
//        System.out.println(a);
        System.out.println(34/4);
/*    Associativity

        Associativity tells the direction of execution of operator . It can either be Left to Right Or Right to Left
        * , / --> L to R
        + , - --> L to R
        ++ , = --> R to L
*/

    /*
    How will you write the following expression in java
    Quick Quiz
    1. x * y / 2    2.(b^2 - 4ac) / 2a    3. v^2 - u^2    4.a*b-d
     */
      int x = 6;
      int y = 1;
//      int k = (x * y)/2;
//        System.out.println("the value of k is :: "+ k);

//        int a = 1;
//        int b = 5;
//        int c = 4;
//
//        int k = ((b*b) - (4*a*c)) / (2*a);// 25 - 16 /2
//        System.out.println("the value of k is :: "+ k);

//        int v = 5 , u = 8;
//        int k = v*v - u*u;
//        System.out.println("the value of k is :: " + k);

        int a = 4 , b = 6 , d = 8;
        int k = a*b - d;
        System.out.println("the value of k is :: " + k);


    }

}
