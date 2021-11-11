package com.company;
/*
 Noun      ->   class         ->      Employee
 Adjective ->   Attribute     ->      name,id,salary
 Verb      ->   Method        ->      setSalary , getSalary */
class Employee{
    int id;
    int salary;
    String name;
    public void printDetail(){
        System.out.println("My id is " +id);
        System.out.println("And my name is "+ name);
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
}
public class CWH_38_custom_class {
    public static void main(String[] args){
        Employee harry = new Employee();// Instantiating a new Employee object
        Employee john = new Employee();// Instantiating a new Employee object

        // Setting Attribute for Harry
        harry.id = 12;
//        harry.salary = 48;
        harry.setSalary(48);
        harry.name = "harry";

        // Setting Attribute for John
        john.id = 24;
//        john.salary = 12;
        john.setSalary(12);
        john.name = "john khandelwal";

        // printing Attribute
        harry.printDetail();
        System.out.println("The salary of harry is "+ harry.getSalary() + " k");
        System.out.println("*************************************************************************************************************************");

        john.printDetail();
        System.out.println("The salary of john is " + john.getSalary() + " k");
        System.out.println("*************************************************************************************************************************");

//        System.out.println(harry.id);
//        System.out.println(harry.name);

    }
}
