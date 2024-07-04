package Loops;

import java.util.Scanner;

public class Whiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        float Sum = 0;
        for(float i = 1; i<=k; i++){
            if( i%2==0){
            Sum  -= 1/i;
        }else{
            Sum -= 1/i;
        }
    }
        System.out.println(Sum);
        
    
        int m = sc.nextInt();
        int n = sc.nextInt();
        int name_tusr = 12;
        System.out.print(n + " ");
        System.out.print(m+ " ");
        // System.out.print(n + " ");
        for(int i =0; i<name_tusr; i++){
          int p = m+n;
          n=p;
          System.out.print(p + " ");
        }
        // System.out.println(p);
        sc.close();
        
    }
}
