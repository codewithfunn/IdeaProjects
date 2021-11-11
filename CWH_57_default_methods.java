package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
}
interface  Wifi{
    String[] getNetwork();
    void ConnectToNetwork(String Network);
}

class cellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends cellPhone implements Wifi,Camera{
   public void takeSnap(){
       System.out.println("Taking a snapShort...");
   }
   public void recordVideo(){
       System.out.println("Recording a Video...");
   }
   public void callNumber(int phoneNumber){
       System.out.println("dialing number..."+ phoneNumber);
   }
   public void pickCall(){
       System.out.println("C");
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
}
public class CWH_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar =  ms.getNetwork();
        for (String item:ar) {
            System.out.println(item);
        }

    }
}
