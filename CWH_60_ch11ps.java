package com.company;

abstract class Pen{
     abstract void write();
    abstract void refills();
}

class FountainPen extends Pen{
     public void write(){
         System.out.println("writing a note using pen");
     }
    public void refills(){
        System.out.println("Refilling a pen");
    }
    public void changeNib(){
        System.out.println("Changing a Nibble of pen");
    }

}


public class CWH_60_ch11ps {
    public static void main(String[] args) {
        // 1. Create an abstract class pen with methods write() and refills() as abstract method
        // 2. use the pen class from Q1 to create a Concrete class FountainPen with additional method changeNib()
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refills();
        pen.changeNib();
    }
}
