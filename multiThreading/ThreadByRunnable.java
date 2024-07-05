package multiThreading;

class Hi implements Runnable {
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

class Hello implements Runnable {
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

public class ThreadByRunnable {
    public static void main(String[] args) {
        Runnable obj = new Hi();        
        Runnable obj2 = new Hello();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.start(); 
    // after creating the t1 inst start will call thread not hi and hello class run method.we solve this by passing runnable in both thread constructor as obj/2.
    try {
        Thread.sleep(300);
    } catch (Exception e) {
        // why we use try block bcz a clash b/w hi and hello print time that delay the excution of them. at time of clash a schedulor decide who get 1st priority to print.
    }
    t2.start();

    }
}


