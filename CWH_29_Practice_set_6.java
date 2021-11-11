package com.company;

public class CWH_29_Practice_set_6 {
    public static void main(String[] args){
//        Create an array of 5 floats and calculate their Sum
/*        float [] marks = { 45.8f , 56.4f , 67.9f , 89.54f , 89.9f };
        float sum = 0;
        for (int i =0 ; i<marks.length ; i++){
            sum += marks[i];
        }
        System.out.println("the total marks of five student is :: "+sum);

//        Write a program to find out whether a given input is present in an array or not
        float [] marks = { 45.8f , 56.4f , 67.9f , 89.54f , 89.9f };
        float num = 45.8f;
        boolean isInArray = false;
        for (float element :
                marks) {
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("the value is present in the array!");
        }
        else {
            System.out.println("the value is not present in the array!");
        }
//        calculate the average marks from an array containing marks of all students in physics using for-each loop
        float [] physics_marks = { 98.4f , 78.5f , 89.54f , 89.98f , 78.32f };
        float sum= 0;
        for (float element :
                physics_marks) {
            sum+=element;
        }
        System.out.println("the value of average marks is  :: " + sum/physics_marks.length);

//        create a java program to add two matrices of size 2x3
        int [][] mat1 = {{ 1,2,3 } ,
                         { 4,5,6}};
        int [][] mat2 = { {2 ,6 ,7},
                          {4 ,8 ,8}};
        int [][] result = {{0,0,0}
                          ,{0,0,0}};
//        printing the element of 2-d array
        for (int i = 0; i<mat1.length; i++){ // rows  number of times
            for (int j=0 ; j<mat1[i].length; j++){ // columns number of times
//                System.out.format("Setting value for i = %d and  j= %d\n",i,j);
                result[i][j] = mat1[i][j] +mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");//printing a new-line
        }
        System.out.println("\n***********************************************************************************************");

//        Create a java program to reverse an array
        int [] arr = {1,2,3,4,5,6};
        int l= arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i = 0; i<n; i++){
            //Swap  a[i] and a[l-1-i]
            //  a   b  temp
            // |3| |4| ||
            temp = arr[i];
           arr[i] = arr[l-i-1];
           arr[l-i-1] = temp;
        }

        for (int element :arr) {
            System.out.print(element + "  " );
        }
        // write a java program to find maximum element in an array
        int [] arr = {1,2,3,4,5,6};
        int max = Integer.MIN_VALUE;

        for (int element:arr) {
            if(element>max){
                max = element;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+max);
        System.out.println("***************************************************************************************************************");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        // write a java program to find the minimum element in a java array
        int [] arr1 = {23,34,55,34,53,12};
        int min = Integer.MAX_VALUE;
        for (int element :arr1) {
            if(element<min) {
                min = element;
            }
        }
//        System.out.println("the value of the minimum element in this array is :: " + min);
//        System.out.println("***************************************************************************************************************");
        boolean isSort = true;
        int [] arr2 ={23,34,56,78,90,99,200};
       for (int i=0 ; i<arr2.length-1 ; i++){
           if(arr2[i] > arr2[i+1]){
               isSort = false;
                break;
           }
       }
       if (isSort){
           System.out.println("this array is sorted !");
       }
       else {
           System.out.println("this array is not sorted !");
       }
       */

    }
}
