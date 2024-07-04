package recursions;

import java.util.Scanner;

public class NumberOfDigit {
    public static int count(int n){
        if(n == 0){
            return 0;
        }
        int totalDigit = count(n/10);
        return totalDigit+ 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));


        sc.close();
    }
        
}
