package com.company;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<800){
            System.out.println("thread 1 is running");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<800){
            System.out.println("thread 2 is running");
            i++;
        }
    }
}
public class CWH_71_Runnable {
    public static void main(String[] args){
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }

}
