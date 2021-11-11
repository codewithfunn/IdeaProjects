package com.company;

class Base{
    int x ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base nd setting x now!!");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am constructor!!");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal{
    String bark;
    int legs;

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
class Dog extends Animal{
    int ears;
    int teeth;

    public int getEars() {
        return ears;
    }

    public void setEars(int ears) {
        System.out.println("setting dog ears ");
        this.ears = ears;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        System.out.println("setting the number of teeth a dog has!");
        this.teeth = teeth;
    }
}
public class CWH_45_inheritance {
    public static void main(String[] args) {
        // Creating an object of  Base class
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        // Creating an object of Derived class
        Derived d = new Derived();
        d.setX(45);
        System.out.println(d.getX());

        // Creating an object of Animal class
        Animal A = new Animal();
        // Creating an object of Dog class
        Dog puppy = new Dog();
        puppy.setBark("bow-bow-bow");
        puppy.setEars(2);
        puppy.setLegs(4);
        puppy.setTeeth(28);
        System.out.println("My puppy has "+ puppy.getLegs()+ " legs nd he bark like "+puppy.getBark());
        System.out.println("the number of teeth my puppy has :: "+puppy.getTeeth()+ " nd he has "+puppy.getEars()+ " ears");

    }
}
