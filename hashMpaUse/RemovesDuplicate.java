package hashMpaUse;

import java.util.ArrayList;
import java.util.HashMap;

public class RemovesDuplicate {
    public static ArrayList<Integer> removeDuplicate(int arr[]){
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(seen.containsKey(arr[i])){
                continue;
            }
            output.add(arr[i]);
            seen.put(arr[i], true);

        }
        return output;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5,1,2,2,8,9,10000,3,2};
        ArrayList<Integer> output = removeDuplicate(arr);
        for(int i = 0; i<output.size(); i++){
            System.out.println(output.get(i));
        }
    }
    
}
