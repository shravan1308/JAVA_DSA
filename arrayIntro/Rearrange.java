package arrayIntro;
import java.util.*;

public class Rearrange {
    public static int findPeak(int n, ArrayList<Integer> arr) {
        // Write your code here.
        if(arr.size() == 0){
            return 0;
        }
        int peakNo = 0;
        int lgt = arr.size();
        for(int i =0; i<lgt; i++){
            if(arr.get(i)<arr.get(i+1)){
                peakNo = i+1;
            }
            
        }if(peakNo<arr.size()-1){

        
        if(arr.get(peakNo-1) < arr.get(peakNo) && arr.get(peakNo+1)<arr.get(peakNo)){
             arr.get(peakNo);   
        }
            
        }
        return arr.get(peakNo);
        
    }
        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            int n = 5;
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(2);
            arr.add(1);
            System.out.println(findPeak(n, arr));
        }
    }
