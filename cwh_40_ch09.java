package com.company;

class MyEmployee{
    private int id ;
    private String name;

    public String getName(){
        return  name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class cwh_40_ch09 {
    public static void main(String[] args){

        MyEmployee emp1 = new MyEmployee();
        // emp1.id = 45; this will throw an error due to private access modifier
        // emp1.name = "jaspreet singh";
        emp1.setId(45);
        emp1.setName("CodeWithHarry");
        System.out.println("employee id is "+emp1.getId());
        System.out.println("employee name is "+ emp1.getName());
    }
}
