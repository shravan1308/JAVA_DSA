package NewForlop;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner  sc = new Scanner( System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for ( int i = 1; i<=n-2; i++) {
            int c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();

        
            int l = 2;
            int k = 5;
            int result = 1;

              for ( int t = 1; t<=k; t++)
	                result = result *l;

            System.out.print(result);
						
            
            
        

        
        sc.close();
        }
    
}
