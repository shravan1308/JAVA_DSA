package Operators;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in);
        System.out.println("ENTER FIRST NO.");
        int a = sc.nextInt();
        System.out.println("ENTER SECOND NO.");
        int b = sc.nextInt();
        int result = 0;
        System.out.println(" enter the operation ");
        sc.nextLine();
        char operation = sc.nextLine().charAt(0);
        switch ( operation) {
            case '+':
            result = a+b;
            break;
            case '-':
            result = a-b;
            break;
            case '/':
            result = a/b;
            break;
            default :
            System.out.println(" invalid operation ");
        }
            System.out.println(" the operattin " + result);
            sc.close();


    }
}
