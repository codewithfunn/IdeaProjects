package com.company;

class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i < 100){
            System.out.println("My Cooking Thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i= 0;
        while (i<100){
            System.out.println("Thread2  for Chatting with her");
            System.out.println("I am super happy");
            i++;
        }
    }
}
public class CWH_70_Multithreading_extending_thread_class {
    public static void main(String[] args){
    MyThread1 th1 = new MyThread1();
    MyThread2 th2 = new MyThread2();
    th1.start();
    th2.start();
    }
}
