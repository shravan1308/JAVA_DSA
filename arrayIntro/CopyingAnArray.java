package arrayIntro;
import java.util.Arrays;

public class CopyingAnArray {
    public static void main(String[] args) {
        char[] copyFrom = {'h','i','m','a','n','i'};  
        //declaring a destination array  
        char[] copyTo = new char[6];  
        //copying array using System.arraycopy() method  
        System.arraycopy(copyFrom, 0, copyTo, 0, 5);  
        //printing the destination array  
        System.out.println(String.valueOf(copyFrom));
        // two dimsnl array clone making
        int[][] src = new int[][] {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9},
            {10, 11, 12}
    };
    
        int[][] copy = copy(src);
        System.out.println("2D CLONE ARRAY");
                System.out.println(Arrays.deepToString(copy));
                int [][] copyi = copyi(src);
                System.out.println("this print same 2D element's of above but here is difference of copying other way");
                System.out.println(Arrays.deepToString(copyi));
                System.out.println("by System.arrayCopy");

            // one dimnsl array cloning
            System.out.println("1D CLONE ARRAY");
            int arr[]={33,3,4,5};  
        System.out.println("Printing original array:");
        for(int i:arr)  
        System.out.println(i);  
        System.out.println("Printing clone of the array:"); 
        int carr[]=arr.clone();  
        for(int i:carr)  
        System.out.println(i);  

        System.out.println("Are both equal?");  
        System.out.println(arr==carr);  
            }  
            // two dimsnl array clone making
            public static int[][] copy(int[][] src) {
                if (src == null) {
                    return null;
                }
 
        int[][] copy = new int[src.length][];
        for (int i = 0; i < src.length; i++) {
            copy[i] = src[i].clone();
        }
 
        return copy;
    }
    public static int[][] copyi(int[][] src) {
        if (src == null) {
            return null;
        }
 
        int[][] copy = new int[src.length][];
 
        for (int i = 0; i < src.length; i++) {
            copy[i] = new int[src[i].length];
            System.arraycopy(src[i], 0, copy[i], 0, src[i].length);
        }
 
        return copy;
    }

}
