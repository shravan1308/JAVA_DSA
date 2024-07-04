package Loops;

// import java.util.Scanner;
public class Nested {
    public static void x(int n){
        for(int i =0; i<n; i++){
            System.out.print(" " + n);
            x(n-1);
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
            
            // int number = 1;
            // for (int i = 1; i<=5; i++){
            //     for(int j = 1; j<5-i; j++){
            //         System.out.print("  ");
            //       }
            //       for(int j= 1; j<=i; j++){
            //           System.out.print(number++ + "  ");
            //       }
            //       System.out.println();
            //   }
              x(3);
    
    }
}
