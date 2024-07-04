package Conditional;

import java.util.Scanner;

public class Useer {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    


        if ( a == b) {
            System.out.println(" equal");
            System.err.println(" the");
        }else if ( a>b) {
            System.out.println(" A is greater");
        }else {
            System.out.println( "this the mul of number");
        } 
        int Button = sc.nextInt();
        if ( Button == 15){
            System.out.println(" hellow");
            System.out.println(" wannakam");
        }else if ( Button == 2) {
            System.out.println(" namaste");
        }  else if ( Button == 3){
            System.out.println(" bonjour");
        } else {
            System.out.println(" invalid no. press");
        }
        switch (Button) {
            case 1:
            System.out.println(" PRINT OMEGHA NAMASTE");
            break;
            case 2:
            System.out.println(" hello mrs univeerse ");
            break;
            case 3:
            System.out.println(" bounjour");
            break;
            default:
            System.out.println( " the invalid no. ");

        }



        sc.close();
    }
}
