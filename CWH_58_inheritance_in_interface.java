package com.company;

interface  sampleInterface{
    void meth1();
    void meth2();
}
// dry -> don't repeat yourself
interface childSampleInterface extends sampleInterface{
    // inheritance in interface
    void meth2();
    void meth3();
}


class MySampleInterface implements childSampleInterface{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}
public class CWH_58_inheritance_in_interface {
    public static void main(String[] args) {
        MySampleInterface obj = new MySampleInterface();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}