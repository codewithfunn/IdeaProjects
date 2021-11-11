package com.company;
class Cylinder{
    private float radius;
    private float height;


//    constructor -> alt+insert key -> generate -> constructor -> select radius nd height -> OK
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public float surfaceAreaCylinder(){
        return (float) (2*Math.PI*radius*(radius+height));
    }
    public float volumeOfCylinder(){
        return (float) (Math.PI*radius*radius*height);
    }

}
class Rectangle1{
    private int length;
    private int breath;

    public Rectangle1() {
        this.length = 4;
        this.breath = 5;
    }

    public Rectangle1(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
}
class Sphere {
    private float radius;

    public Sphere(float radius) {
        this.radius = radius;
    }

    public Sphere() {
        radius = 2;
    }
    public float volumeOfSphere(){
        return (float) ((4/3)*3.14f*((3*3*3)));
    }
    public float surfaceAreaOfSphere(){
        return (float) (4*Math.PI*radius*radius);
    }
}
public class cwh_44_ps09 {
    public static void main(String[] args) {
         // create a class Cylinder and use getter and setter to set its radius and height
        // steps  Options->Code->Generate->create Getter and Setter -> select radius getter/setter and height getter/setter
/*        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12.5f);
        myCylinder.setRadius(4.5f);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());

        // use one to calculate surface area and volume of the cylinder
        Cylinder myCylinder1 = new Cylinder();
        myCylinder1.setRadius(9);
        myCylinder1.setHeight(12);
        System.out.println("the total surface area of cylinder is :: "+myCylinder1.surfaceAreaCylinder());
        System.out.println("The volume of Cylinder is :: "+myCylinder1.volumeOfCylinder());
        // use a constructor and repeat (1)
    Cylinder myCylinder = new Cylinder(9 , 12);


//    Overload a constructor used to initilized a rectangle of length 4 and breath 5 for using custom parameters

    Rectangle1 myRectangle = new Rectangle1();
    Rectangle1 myRectangle2 = new Rectangle1(8,9);
        System.out.println("the length of rectangle1 is :: "+ myRectangle.getLength()+" nd breath is :: "+ myRectangle.getBreath());
        System.out.println("the length of rectangle1 is :: "+ myRectangle2.getLength()+" nd breath is :: "+ myRectangle2.getBreath());
 */
   //
     Sphere mySphere = new Sphere(3);
        System.out.println("the volume of mySphere is :: "+mySphere.volumeOfSphere());
        System.out.println("the surface area of mySphere is :: " + mySphere.surfaceAreaOfSphere());
    }
}
