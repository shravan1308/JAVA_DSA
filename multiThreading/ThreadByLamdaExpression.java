package multiThreading;

public class ThreadByLamdaExpression {
    public static void main(String[] args) {
        // ---> recall annonymous class 
        //     Runnable obj = new Runnable() {
        //     public void run() {
        //         for (int i = 0; i < 5; i++) {
        //             System.out.println("Hi");
        //             try {
        //                 Thread.sleep(1000);
        //             } catch (Exception e) {

        //             }
        //         }
        //     }
        // };

        // ---> calling by annonmously  reduce the no. of line's after annonmous.

        // Runnable obj2 = new Runnable() {
        //     public void run() {
        //         for (int i = 0; i < 5; i++) {
        //             System.out.println("Hello");
        //             try {
        //                 Thread.sleep(1000);
        //             } catch (Exception e) {

        //             }
        //         }
        //     }
        // };

        // ---> lamda expression This lamda expression we reduce no. of lines after lamda expression. we will more modify it.
        // ---> we passing obj and obj2 in thread refrences now we direct paste the code i.e Runnable obj = () -> { ...} same for obj2.

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        });

        t1.start();
        try {
            Thread.sleep(300);
        } catch (Exception e) {
        }
        t2.start();
    }
}
