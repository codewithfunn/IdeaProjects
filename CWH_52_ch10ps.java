package com.company;
class Circle{
    public float radius;
    Circle(float r){
        System.out.println("I am circle parameterized constructor!");
        this.radius = r;
    }
    Circle(){
    System.out.println("I am non param of circle!");
    }
    public float area(){
        return (float) (Math.PI*this.radius*this.radius);
    }
}
class Cylinder1 extends Circle{
    public float height;
    Cylinder1(float h , float r){
        super(r);
        System.out.println("I am Cylinder parameterized constructor!");
        this.height = h;
    }
    public float volume(){
        return (float) (Math.PI*this.radius*this.radius*this.height);
    }
}
class Rectangle3{
    public float breath;
    public float height;
    Rectangle3(float breath , float height){
        this.breath = breath;
        this.height = height;
    }
    float areaOfRec(){
        return breath*height;
    }

}
class Cuboid extends Rectangle3{
    public  float length;
    Cuboid(float breath , float height , float length){
        super(breath,height);
        this.length = length;
    }
    float surfaceArea(){
        return 2*(this.length*this.breath + this.breath*this.height + this.height*this.length);
    }
    float volume(){
        return 2*this.height*(this.length+ this.breath);
    }
    float perimeter(){
        return 2*(this.length+ this.breath + this.breath);
    }
}
public class CWH_52_ch10ps {
    public static void main(String[] args) {
        // create a circle and use inheritance to create another class cylinder from it.
        Circle objC = new Circle(5);
        Cylinder1 obj = new Cylinder1(5,3);

        // Create a class Rectangle and use inheritance to create another class cuboid , try to keep it as close to real
        // world scenario as possible
    }
}
