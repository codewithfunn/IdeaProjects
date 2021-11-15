package com.company;

class ThrSol1 extends Thread{
    int i=0;
   public void run(){
       while(i<500){
       System.out.println("Good morning!");
       i++;
    }
    }
}
class ThrSol1b extends Thread{
    int j=0;
    public void run(){
        while(j<500){
            System.out.println("Welcome!");
            j++;
            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class CWH_76_practiceSet13 {
    public static void main(String[] args){
        // Write a program to print "good Morning" and "welcome" Continuously on the screen in java using Thread
        ThrSol1 t1 = new ThrSol1();
        ThrSol1b t2 = new ThrSol1b();
        t1.start();
        t2.start();
        // Write a sleep method in welcome thread of question1 to delay its execution for 200ms
    }
}
