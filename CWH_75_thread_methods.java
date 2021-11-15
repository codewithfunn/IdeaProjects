package com.company;

class MyTh1 extends Thread{
    int i = 0;
    public void run(){
        while(i<450){
            System.out.println("I am thread 1");
            i++;
            /*
            Sleep() Method :
        1. The sleep() method in Java is useful to put a thread to sleep for a specified amount of time.
        2. When we put a thread to sleep, the thread scheduler picks and executes another thread in the queue.
        3. Sleep() method returns void.
        4. sleep() method can be used for any thread, including the main() thread also.*/
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }

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
        /*
        Join() method In Java :
    1.  The join()method in Java allows one thread to wait until the execution of some other specified
        thread is completed.
    2.  If t is a Thread object whose thread is currently executing, then t.join() causes
        the current thread to pause execution until t's thread terminates.
    3.  Join() method puts the current thread on wait until the thread on which it is called is dead.
     */
//        try {
//            t1.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        t2.start();
    }
}
