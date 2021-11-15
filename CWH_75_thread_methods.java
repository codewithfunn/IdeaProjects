package com.company;

class MyTh1 extends Thread{
    int i = 0;
    public void run(){
        while(i<450){
            System.out.println("I am thread 1");
            i++;
        }
    }
}
class MyTh2 extends Thread{
    int i= 0;
    public void run(){
        while(i<450){
            System.out.println("I am thread 2");
            i++;
        }
    }
}
public class CWH_75_thread_methods {
    public static void main(String[] args){
        MyTh1 t1 = new MyTh1();
        MyTh2 t2 = new MyTh2();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}
