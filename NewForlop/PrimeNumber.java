package NewForlop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int m = sc.nextInt();
         for( int i = 2; i*i < m; i++) {
            if ( m % i == 0){
                isPrime = false;
            }
        }
            if ( m<2) isPrime = false;
        System.out.println("is prime " + isPrime);






        int n = sc.nextInt();
        boolean isprime = true;
//        above and below code is ok not to worry ||
        for( int i = 2; i<n; i++) {
            
           if ( n  %  i == 0) {
               isprime = false;
               break;
           }
       }
       if ( n<2 ) isprime = false;
       System.out.println(" is prime " + isprime);
       

        sc.close();
    }
}
