package Basics;

import java.util.Scanner;

public class IntegerOverflow {
    public static void main(String[] args) {
        int limit = Integer.MAX_VALUE;
        System.out.println(limit);
        long limit1 = Integer.MAX_VALUE; 
        System.out.println(limit1);
        float f = Float.MAX_VALUE;
        System.out.println(f);
        byte Limit = Byte.SIZE;
        System.out.println(Limit);
        int a = 130;
        byte b = (byte)a;
        System.out.println(b); // this not convert bcz overflow of limit of byte.  
        int bn = 0b110;
        int num = 1_00_00_200;
        char x = 'a';
        x++;
        long lg = 46464646l;
        double db = 4646.45d;
        float fn = 54.25f;
        double db1 = 4.255e4;
        // when we upcasting exlicitly ex-1 int to byte what happen while changing. it show result by remender divide by 256(range of byte 8bit)(using operant '%')
        int ax = 300;
        byte bx = (byte)ax;
        System.out.println(lg);
        System.out.println(db);
        System.out.println(fn);
        System.out.println(db1);
        
        System.out.println( "this is for line 24 comment understanding upcasting" + bx);
        System.out.println(bn);
        System.out.println(num);
        System.out.println(x);

        Scanner sc = new Scanner(System.in);
        System.out.println("pattern printing");
        System.out.println("printing this pattern rule is n --> "+" and xx --> " +" " + "n equal to (xx+1/2) and xx will always odd");
        int n = sc.nextInt();
        int xx = sc.nextInt();
        for (int i=0; i<n; i++) {
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for(int j = i; j<xx-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m=1; m<n; m++) {
            for(int l=1; l<n-m; l++){
                System.out.print(" ");
            }
            
            for(int w=0; w<(m*2 +1); w++){
                System.out.print("*");
                if(w==xx)
                break;
            }
            System.out.println();
            
        }
sc.close();

    }
}
