package NewForlop;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        // int n = sc.nextInt();
        // float result = 0;
        // for(float i = 1; i<=n; i++){
        //     result += 1 / i ;
        // }
        //     System.out.println(result);

        //     int m = sc.nextInt();
        //     float resultt = 0;
        //     for ( float i = 1; i<= m; i++){
            
        //         if  ( i%2 == 0){
        //             resultt -= 1/i; 
        //         } else{
        //             resultt += 1/i;
        //         }

        //     }
        //     System.out.println(resultt);



            int n = sc.nextInt();
		for( int i = 1; i<=n; i++) {
			for ( int j = 1; j<n-i; j++) {
				System.out.print("  ");
			}
			for ( int j = 1; j<= i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		
		

        sc.close();
    }
}
