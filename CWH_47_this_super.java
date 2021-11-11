package com.company;

class Ekclass{
    int a ;
    public int getA(){
        return a;
    }
    Ekclass(int a){
        this.a = a;
    }
    public int returnNone() {
        return 1;
    }
}
class DoClass extends Ekclass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}

public class CWH_47_this_super {
    public static void main(String[] args) {
    Ekclass e = new Ekclass(43);
    DoClass d = new DoClass(54);
    System.out.println("the value of  a  is :: "+ e.getA());

    }
}
