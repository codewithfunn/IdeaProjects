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
public class CWH_58_inheritance_in_interface {
}
