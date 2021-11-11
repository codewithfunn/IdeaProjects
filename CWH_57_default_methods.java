package com.company;

interface Camera{
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
interface  Wifi{
    String[] getNetwork();
    void ConnectToNetwork(String Network);
}

class cellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends cellPhone1 implements Wifi,Camera{
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

//    @Override
//    public void record4KVideo(){
//        System.out.println("snap nd Recording in 4k Video!");
//    }
}
public class CWH_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        // ms.greet();// error (private hai)
        ms.record4KVideo();
        String[] ar =  ms.getNetwork();
        for (String item:ar) {
            System.out.println(item);
        }

    }
}
