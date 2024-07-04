package oops;

class Cog {  
    int legs;
}

public class PassByVR {
    public static void main(String[] args) {
        // int c = 12;
        // int d = 23;
        // swap(c,d);
        // System.out.println(c + " " + d);
    
        // Cog p = new Cog();
        // p.legs = 4;
        Cog r = new Cog();
        r.legs = 3;
        changedDog(r);
        // swapn(p,r);
        System.out.println(r.legs);
    }
    // Through PRIMITIVE Type it show 
    // pass by value & and make another copy a & b; 
    
    static void swap (int a , int b){
        int temp = b;
        b = a;
        b = temp;
    }
    // through non-primitive type
    static void swapn(Cog a , Cog b){
        Cog temp = a;
        a = b;
        b = temp;
    }

    static void changedDog(Cog dog){
        dog.legs  = 6;
    }
}
