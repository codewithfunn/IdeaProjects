package com.company;
class Phone{
    public void showTime(){
        System.out.println("Time is 10 PM");
    }
    public void on(){
        System.out.println("Turning on Phone......");
    }
}
class SmartPhone extends Phone{
    public void on(){
        System.out.println("Turning on SmartPhone.....");
    }
    public void music(){
        System.out.println("Playing music......");
    }
}

public class CWH_49_Dynamic_method_dispatch {
    public static void main(String[] args) {
        /*
        Phone obj = new Phone();
        obj.on();

        SmartPhone smobj = new SmartPhone();
        smobj.on();
         */
        Phone obj1 = new SmartPhone();// (run time binding) Yes it is allowed
 //        SmartPhone obj2 = new Phone(); // not allowed
        obj1.on();
        obj1.showTime();
        //obj1.music();// not allowed
    }
}
