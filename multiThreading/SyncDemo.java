package Dedication_POTD_24;

class Counter {
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class SyncDemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        Thread t = new Thread(new Runnable() 
        {
            public void run(){
                for(int i =0; i<1000; i++){
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() 
        {
            public void run(){
                for(int i =0; i<1000; i++){
                    c.increment();
                }
            }
         });
        t.start();
        t2.start();
        t.join();
        t2.join();
        
        System.out.println("Count " + c.count);
    }
}
