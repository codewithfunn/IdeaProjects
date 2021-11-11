package com.company;

interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning sunny!");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k......");
    }
    //  Default methods enable us to add new functionality to existing interfaces without breaking
    //  older implementation of these interfaces
}
interface  Wifi2{
    String[] getNetwork();
    void ConnectToNetwork(String Network);
}

class cellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone1 extends cellPhone2 implements Wifi2,Camera2{
    public void takeSnap(){
        System.out.println("Taking a snapShort...");
    }
    public void recordVideo(){
        System.out.println("Recording a Video...");
    }
    public void callNumber(int phoneNumber){
        System.out.println("dialing number..."+ phoneNumber);
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting List of Network");
        String[] NetworkList = {"Harry" , "SimranSuri" , "JaspreetSuri"};
        return  NetworkList;
    }
    @Override
    public void ConnectToNetwork(String Network) {
        System.out.println("Connecting to " + Network);
    }
    void sampleMeth(){
        System.out.println("this is a sample method");
    }
}

public class CWH_59_polymorphism {
    public static void main(String[] args) {
        Camera2 cam = new MySmartPhone1(); // this is a smartPhone but use it as a camera
        //cam.getNetworks(); --> Not allowed
        // cam.sampleMeth(); --> Not allowed
        cam.record4KVideo();
    }
}
