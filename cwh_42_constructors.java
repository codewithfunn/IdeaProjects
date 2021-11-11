package com.company;

class MyMainEmployee{
    private String name;
    private int id;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public MyMainEmployee (int id , String name){
        this.id = id;
        this.name = name;
    }
    public MyMainEmployee(){
        id = 0;
        name = "Your-name";
    }
    public MyMainEmployee(String name){
        id = 1;
        this.name = name;
    }
}

public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee emp = new MyMainEmployee();
        MyMainEmployee emp1 = new MyMainEmployee("jaspreet");
        MyMainEmployee emp2 = new MyMainEmployee( 234,"jaspreet singh");
        System.out.println("emp id is "+ emp.getId());
        System.out.println("emp name is "+ emp.getName());

        System.out.println("emp1 id is "+ emp1.getId());
        System.out.println("emp1 name is "+ emp1.getName());

        System.out.println("emp2 id is "+ emp2.getId());
        System.out.println("emp2 id is "+ emp2.getName());

    }
}
