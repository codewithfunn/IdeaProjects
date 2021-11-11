package com.company;

class Employee_1{
    int salary;
    String name; // by_default the value of name is null

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }

    public  Employee_1() {
        System.out.println("employee!");
    }
    public  Employee_1(int id){
        System.out.println("your id is :: "+ id);
    }

    public void setName(String name) {
        this.name = name;
    }
}

class cellphone{
    public void ring(){
        System.out.println("your phone is ringing!");
    }
    public void vibrate(){
        System.out.println("your phone is vibrating!");
    }
    public  void callFriend(){
        System.out.println("Calling Mukal...!");
    }
}
class Square{
    private int side =2;
    public void set_side(int side){
        this.side = side;
    }
    public int areaOfSquare(){
        return side * side;
    }
    public int perimeterOfSquare(){
        return (4*side);
    }
}
class Rectangle{
    private float width;
    private float height;

    public void setWidth(float width){
        this.width = width;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public float areaOfRectangle(){
        return height * width;
    }
    public float perimeterOfRectangle(){
        return 2*(height+ width);
    }
}
class  TommyViceCity{
    public void hit(){
        System.out.println("Hitting the enemy!");
    }
    public  void run(){
        System.out.println("Running from the enemy!");
    }
    public  void fire(){
        System.out.println("Firing on the enemy!");
    }
}
class circle{
    private float radius;
    private float pi = 3.14f;
    public void setRadius(float radius){
        this.radius = radius;
    }

    public float  areaOfCircle(){
        return pi * (radius*radius);
    }
    public float perimeterOfCircle(){
        return 2*pi*radius;
    }
}
public class CWH_39_ch8_ps {

    public static void main(String[] args){
        /*
        // 1. Create an employee with the following properties and methods :-

        * salary(property) (int)
        * getSalary(method returning int)
        * name (property) (String)
        * getName(method returning String)
        * setName(method changing name)
        */
        Employee_1 Harry1 = new Employee_1();
        Employee_1 Harry = new Employee_1(52);
        Harry.setName("codeWithHarry");
        Harry.salary = 5988;
        System.out.println("your name is :: " + Harry.getName());
        System.out.println("Your salary is :: " + Harry.getSalary());


        /*
        create a class cellphone with methods to print "ringing" , "vibrating" , etc

        cellphone oppF3 = new cellphone();
        oppF3.ring();
        oppF3.vibrate();
        oppF3.callFriend();
         */

        /*
        create a class square with a method to initialize its side, calculating area , perimeter etc.
        Square obj1 = new Square();
        obj1.set_side(5);
        System.out.print("the area of square is :: "+obj1.areaOfSquare());
        System.out.print("\n The perimeter of square is :: "+obj1.perimeterOfSquare());
         */

        /*
        create a class Rectangle with a method to initialize its width and height , calculate area , perimeter etc.

        Rectangle obj1 = new Rectangle();
        obj1.setHeight(12.5f);
        obj1.setWidth(11.5f);
        System.out.println("the area of rectangle is :: " + obj1.areaOfRectangle());
        System.out.println("The perimeter of rectangle is :: "+obj1.perimeterOfRectangle());
         */
        /*
        Create a class tommyViceCity for Rockstar Games capable of hitting(print hitting ) , running , firing ect.

        TommyViceCity player1 = new TommyViceCity();
        player1.fire();
        player1.run();
        player1.hit();


    /*
        create a class circle with a method to initialize its radius , calculate area , perimeter etc.

    */


       /* circle obj1 = new circle();
        obj1.setRadius(4);
        System.out.println("the area of circle is :: " + obj1.areaOfCircle());
        System.out.println("the perimeter of circle is :: " + obj1.perimeterOfCircle());

*/
    }
}
