package recursions;

import java.util.Scanner;

public class IncreasingOrder {
    public static void print(int n){
        if(n == 0){
			// System.out.print(n + " ");
            return;
		}
        print(n - 1);
		System.out.print(n+" ");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IncreasingOrder.print(n);
        sc.close();
    }
}
    
