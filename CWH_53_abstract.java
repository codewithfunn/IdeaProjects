package com.company;

 abstract class  Parent2{
    public Parent2(){
        System.out.println("Mai Parent2 ka constructor hoon!");
    }
    public void sayHello(){
        System.out.println("hello");
    }
     abstract public void greet();
     abstract public void greet2();
}
class Child2 extends Parent2{
     public void greet(){
         System.out.println("good morning");
     }
     public void greet2(){
         System.out.println("good afternoon");
     }
}
 abstract class Child3 extends Parent2{
     public void th(){
         System.out.println("th");
     }
}
public class CWH_53_abstract {
    public static void main(String[] args) {
//    Parent2 c = new Parent2();// error
    Child2 c = new Child2();
//    Child3 c = new Child3();// error

    }
}
