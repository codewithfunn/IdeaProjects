package com.company;
class Th1 extends Thread{
    public Th1(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<5 ){
            System.out.println("I am a thread with a name of "+ this.getName());
            i++;
        }
    }
}
public class CWH_74_thread_priorities {
    public static void main(String[] args){
        Th1 t1 = new Th1("harry1");
        Th1 t2 = new Th1("harry2");
        Th1 t3 = new Th1("harry3");
        Th1 t4 = new Th1("harry4");
        Th1 t5 = new Th1("harry5");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
