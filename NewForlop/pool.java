package NewForlop;

import java.util.Scanner;

public class pool {
    public static void main(String[] args) {
         Scanner sc = new Scanner( System.in);
        //  int k = sc.nextInt();
        // while ( k <11) {
        //     System.out.println(" apna college");
        // }
        // do{
        //     System.out.println(" apna college");

        // }while (k <11);
           
        //     System.out.println("sum");
            int l = sc.nextInt();
            int factorial = 1;
            for ( int i = 1; i<=l; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
            
            
            
            
            
            
            
            sc.close();

    }
}
