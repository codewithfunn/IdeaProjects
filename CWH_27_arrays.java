package com.company;

public class CWH_27_arrays {
    public static void main(String[] args){
//        Arrays length property which give the length of the arrays

/*
        float [] marks_f = {68.5f , 78.5f , 89.5f , 78.5f , 83.5f }; // declaring float type array
        System.out.println("this will return the length of float type array :: " + marks_f.length);
        String [] student = {"Harry", "Shubham" , "Jaspreet" , "Simran" }; // declaring String type array
        System.out.println("This will return the length of String type array :: "+ student.length);
*/

        int []marks ={ 89 , 94 , 58 , 87 , 82 }; // declaring integer type array
//        System.out.print("this will return the length of integer type array :: " );
//        System.out.println(marks.length);

        // Displaying the Array (Naive Way)
        System.out.println("printing an array in naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("Printing an array using for loop");
        for (int i=0; i<marks.length ;i++){
            System.out.println(marks[i]);
        }

        // Quick Quiz : Displaying the Array in reverse order (for loop)
        System.out.println("printing an array in reverse order using for loop");
        for (int i = marks.length - 1 ; i>=0 ; i--){
            System.out.println(marks[i]);
        }
//        Displaying an Array using for-each loop in java
        System.out.println("Printing an array using for-each loop ");
        for (int element : marks) {
            System.out.println(element);

        }
    }
}
