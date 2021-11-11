package com.company;

public class CWH_10_resulting_data_type {
    public static void main(String[] args){
//        Resulting data type after arithmetic operator
        /*
        following table summarizes the resulting data types after arithmetic operation on them

        R = b + S  -> int
        R = S + i -> int
        R = l + f -> float
        R = i + f -> float
        R = c + i -> int
        R = l + d -> double
        R = f + d -> double
        --------------------------------------------------------------------------------------------------------------------------------------------------
        b = byte            l = long
        s = short           f = float
        i = integer         d = double
        c = character
         */
        int yo ;

//        byte x = 5;
//        int y = 6;
//        short z = 8;
//        int a = y+ z;
//        float b = 6.54f + x;
//        System.out.println(" the value of b is :: "+ b);



//        Increment and decrement operators in java
        int i = 56;
        int b = i++; // First b is assigned i (56) then i is incremented
        System.out.println(b);

        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(c);

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);


//        Quick Quiz what will be the value of the following expression(x)
        int y= 7;
        int x = ++y * 8;
        System.out.println("the value of x is :: " + x);

        char a ='B';
        a++;
        System.out.println("the value of a++ is :: "+a);
    }
}
