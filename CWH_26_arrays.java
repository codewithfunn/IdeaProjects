package com.company;

public class CWH_26_arrays {
    public static void main(String[] args){
     /*
     * Classroom of 500 students - You have to store marks of these 500 students
     * You have two options:
      1. Create 500 variable
      2. Use Arrays (Recommended)
      * Array indices starts from 0 and goes till (n-1) Where n is the size of the array
      */
//        we can declare array in three ways in java
//         int [] marks = new int[5]; // declare and Memory Allocation
            int [] marks; // declare
            marks = new int[8]; //Memory Allocation

        marks[0] = 98;
        marks[1] = 58;
        marks[2] = 78;
        marks[3] = 87;
        marks[4] = 67;

        System.out.println("the marks of students :: " + marks[4]);


//     declaration , memory Allocation and initialization together
        int []marks_st = {45,89,90,57,89}; // Declare and initialize
        System.out.println("the value of marks_st at 3 is "+marks_st[2]);

    }
}
