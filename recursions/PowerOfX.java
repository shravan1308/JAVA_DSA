package recursions;

import java.util.Scanner;

public class PowerOfX {
    public static int power(int x , int n){
        
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int expo = power(x,n-1);
        int totalpower = x*expo;
    	return totalpower;	
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
        System.out.println();
        sc.close();

    }
    
}
