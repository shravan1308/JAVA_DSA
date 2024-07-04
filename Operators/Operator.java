package Operators;

// import java.util.Scanner;

import nonPermitiveDataTypes.StackLLEmptyException;

public class Operator {
    public static void main(String[] args) {
        // Scanner sc = new Scanner ( System.in);
       
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int operator =sc.nextInt();
        // switch (operator) {
        //     case 1: System.out.println(a+b);
        //     break;
        //     case 2:
        //     System.out.println(a-b);
        //     break;
        //     case 3: System.out.println(a*b); 
        //     break;
        //      case 4: if ( b ==0 ){
        //          System.out.println(" invalid division");
        //     } else {
        //          System.out.println(a/b);

        //     } 
        //      break;
        //      case 5: if ( b==0){
        //          System.out.println(" invalid divison");

        //     }else {
        //          System.out.println(a%b);
        //     }
        //      break;
        //      default:
        //      System.out.println(" invalid operator");
        //     }

        //     sc.close();


    //         char n = 'h';
    // int y = n;
    // System.out.println(y);

    StackL hkk = new StackL(5);
    for(int i =0; i<5; i++){
        hkk.push(i);
    }
    while(! hkk.isEmpty()){
        try{
            System.out.println(hkk.pop());

        } catch (StackLLEmptyException e){

        }
    }

    }
}
