package com.company;
/*
* The thread class
 the common use constructors of thread class are->
    * Thread()
    * Thread(String name)
    * Thread(Runnable r)
    * Thread(Runnable r , String name)  */

/************* Thread() **************/
class ThreadEmp extends Thread{
    public void run(){
        System.out.println("I am empty constructor!");
    }
}

/************* Thread(String name) **************/
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am a thread");
    }
}

/* ************ Thread(Runnable r) ************* */
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("I am runnable thread");
    }
}

/* ************ Thread(Runnable r , String name) ************* */
class MyRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am runnable thread with name");
    }
}

public class CWH_73_thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("harry");
        MyThr t2 = new MyThr("shary");

        t1.start();
        t2.start();

        System.out.println("The id of the thread t1 is "+ t1.getId());
        System.out.println("the name of the thread t2 is "+ t1.getName());

        System.out.println("the id of the thread t2 is " + t2.getId());
        System.out.println("the name of the thread t2 is "+t2.getName());

        /* ************ Thread(String name) ************* */
        ThreadEmp t3 = new ThreadEmp();
        t3.start();
        System.out.println("the id of the t3 is "+t3.getId());

        /* ************ Thread(Runnable r) ************* */
        MyRunnable bullet1 = new MyRunnable();
        Thread gun1 = new Thread(bullet1);
        gun1.start();
        System.out.println("The id of the gun1 is " + gun1.getId());

        /* ************ Thread(Runnable r , name) ************* */
        MyRunnable2 bullet2 = new MyRunnable2();
        Thread gun2 = new Thread(bullet2 , "sunny");
        gun2.start();
        System.out.println("the name of gun2 is " + gun2.getName());
        System.out.println("the id of gun2 is " + gun2.getId());
    }
}
