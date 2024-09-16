package Dedication_POTD_24; 
class Hi extends Thread {
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

class Hello extends Thread {
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
        }
    }
}

public class Threading {
    public static void main(String[] args) throws Exception{
    Hi obj = new Hi();        
    Hello obj2 = new Hello();
    obj.start(); 
    
    try {
        Thread.sleep(300);
    } catch (Exception e) {
        
    }
    System.out.println(obj.isAlive()); // detect is running or not
    obj2.start();
    obj.join();
    obj2.join();
    System.out.println("bye bye bye"); // bye will prt join the party we dont want to join u will print after the party understanding language only
    }
}
