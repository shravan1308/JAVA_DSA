package CollectionAndGeneric.time;

import java.util.ArrayList;

public class Time {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<=1000000;i++){
            arr.add(i);

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start + "milliSecond time took to complete array");
        // every time different value depend upon the cpu process while executing how much cpu is free or doing other task. 
        long since1975 = System.currentTimeMillis();
        System.out.println(since1975 + " this is total ms since 1 jan 1975 to present");
    }
    
}
