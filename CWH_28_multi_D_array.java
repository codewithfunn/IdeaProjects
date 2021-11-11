package com.company;

public class CWH_28_multi_D_array {
        public static void main(String[] args){
            /* Multidimensional Array are Array of Arrays Each element of  M-D Array is an array itself marks in the previous example was a 1-D array*/
//            int [] marks ; // A 1-D Array
            int [][]flats; // A 2-D Array
            flats = new int[2][3];
            flats[0][0] = 101;
            flats[0][1] =102;
            flats[0][2] = 103;

            flats[1][0] =201;
            flats[1][1] = 202;
            flats[1][2] =203;
            for (int i=0 ; i<flats.length;i++){
                for (int j=0; j<flats[i].length;j++){ // 0 1 2
                    System.out.print(flats[i][j]+" ");
                }
                System.out.println(" ");
            }

//            similarly, A 3-D array can be created as follows :
//            String [][][] arr = new String[x][y][z]
        }
}
