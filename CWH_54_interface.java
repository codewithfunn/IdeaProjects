package com.company;

interface  Bicycle{
    final int a = 64;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    public int x = 45;
    void blowHornKY3();
    void blowHornMHN();
}

class AvonCycle implements Bicycle , HornBicycle{
    public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo ");
    }
    public void applyBrake(int decrement){
         System.out.println("Applying Brake!");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUp!");
    }
    public void blowHornKY3(){
        System.out.println("Main hoon naa!!");
    }
    public void blowHornMHN() {
        System.out.println("Kabhi Khushi Kabhi Gum!!");
    }
}
public class CWH_54_interface {
    public static void main(String[] args) {
        AvonCycle harryCycle = new AvonCycle();
        harryCycle.applyBrake(34);
        // You can create a properties in interface
        System.out.println(harryCycle.a);
        // You cannot modify a properties in interface
        // harryCycle.a = 45;// through an error
        // System.out.println(harryCycle.a);
        harryCycle.blowHornKY3();
        harryCycle.blowHornMHN();
        System.out.println(harryCycle.x);
    }
}
