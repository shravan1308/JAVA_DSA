package generic;

import prctiseCode.Vehicle;

public class PrintArray {
    public static <T extends Vehicle> void printArrayGeneric(T a[]){
        for(int i = 0; i<a.length; i++){
           a[i].check1();// kisi ke pass hai or kisi ke pass nahi like vehicle ko dekho abi bound what kind of t accept here 
           System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer a[] = new Integer[10];
        for(int i = 0; i<10; i++){
            a[i] = i+1;
        }
        // a[3].check1();
        String s[] = new String[10];
        for(int i = 0; i<10; i++){
            s[i] = "abc";
        }
        // starts here generic bound ok
        Vehicle v[] = new Vehicle[10];
        for(int i = 0; i<10; i++){
            v[i] = new Vehicle(10);
        }
        v[1].check1();
        // printArrayGeneric(s); 
        // printArrayGeneric(a);
        printArrayGeneric(v );
    }
    
}
