package com.company;

public class CWH_24_break_continue {
    public static void main(String[] args) {
//        Break and continue using loops
//        Break statement is used to exit the loop irrespective of whether the condition is true or false .
//        Whenever a break is encounter inside the loop , the control is sent outside the loop
        /*for (int i=0 ; i<50; i++){
            System.out.print(i +"::");
            System.out.println("java is great!");
            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
        }*/


        /*int i=0;
        while (i<50){
            System.out.println(i+" :: ");
            System.out.println("java is great!");
            if (i==2){
                System.out.println("Ending the loop!");
                break;
            }
            i++;
        }*/

        /*
        int i =0;
        do {
            System.out.println(i +" :: ");
            System.out.println("Java is great!");
            if (i==2){
                System.out.println("Ending the loop!");
                break;
            }
            i++;
        }while (i<50);
        System.out.println("loop end here!");
    */
//   The continue statement is used to immediately move to the next iteration of the loop. the control is taken to the next iteration thus skipping everthing
//   below "continue" inside the loop for the iteration
        /*for (int i=0 ; i<50; i++){
            if(i==2){
                System.out.println("Continue statement will skip second iteration \n");
                continue;
            }
            System.out.print(i + " :: ");
            System.out.println("Java is great!");

        }*/

        int i =0;
        do {
            i++;

            if (i==2){
                System.out.println("Continue statement will skip second iteration \n");
                continue;
            }
            System.out.println(i +" :: ");
            System.out.println("Java is great!");

        }while(i<50);
        System.out.println("Ending the loop!");
    }
}
