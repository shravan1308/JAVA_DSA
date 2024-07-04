package recursions;

import java.util.Scanner;

public class Natural {
    public static int sumOfnaturalNo(int n){
        if(n==1){
            return 1;
        }
        return n + sumOfnaturalNo(n-1);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // int sum = sumOfnaturalNo(n);
    System.out.println(sumOfnaturalNo(n));
    // System.out.println(sum);
    sc.close();
    
    }
    
}
