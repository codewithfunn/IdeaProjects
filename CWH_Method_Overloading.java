package com.company;
// void return type -> when we don't wont our method to return anything , we use void as the return type
//Static return type -> static keyword is used to associate a method of a given class with the class rather than the object . Static method in a class is shared by all the object


public class CWH_Method_Overloading {
     static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism");
    }
    static void change(int a ){
         a = 98;
    }
    static void change1(int [] arr){
         arr[0] = 98;
    }
    static void foo(){
        System.out.println("Hello Good Morning Bro!");
    }
    static void foo(int a ){
        System.out.println("Hello Good Morning " + a+ " Bro!");
    }
    static void foo(int a , int b){
        System.out.println("Hello Good Morning " + a + " Bro!");
        System.out.println("Hello Good Morning " + b+ " Bro!");
    }
    public static void main(String[] args){
//        tellJoke();
        // Changing the Integer value
        //int x = 45;
        //change(x);
        //System.out.println("The value of x after running change is :: " + x);

        // Changing the Array
        //In case of Array , the reference is passed , Same is the case for Object passing to methods.
        // int [] marks = {95,34,58,34,23,34};
        //change1(marks);
        //System.out.println("The value of marks[0] after running change_1 is :: " + marks[0]);

        // Method overloading in java
        //Two or more method can have same name but different parameters. Such methods are called Overloaded Methods
        foo();
        foo(300);
        foo(300,499);
        // argument are actual
        // Method overloading cannot be performed by changing   the return type of method
    }
}
