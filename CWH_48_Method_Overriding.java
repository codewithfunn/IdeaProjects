package com.company;
// If the child class implements the same method present in the parent class again, it
// is known as method overriding

// when an object of subclass is created and the override method is called , the method which
// has been implemented in th subclass is called & its code is executed


class A {
    public  int a ;
    public  int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of Class A");
    }
}
class B extends A{
    // overriding a meth2
    @Override
    public void meth2(){
        System.out.println("I am method 2 of Class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of Class B");
    }
}
public class CWH_48_Method_Overriding {
    public static void main(String[] args) {
    A a = new A();
    a.meth2();

    B b = new B();
    b.meth2();
    }
}
