package recursions;

public class IsArraySorted {
    public static boolean checkSorted(int input []){
        if(input.length <=1){
            return true;
        }
        
        //  here we follow recursive leaf of faith in order 
        // 1,2,3 order 

        int smallInput[] = new int [input.length -1];
        for(int i=1; i<input.length;i++){
            smallInput [i -1] = input[i];
        }
        boolean smallAns = checkSorted(smallInput);
        if(!smallAns){
            return false;
        }
        if(input[0] <= input[1]){
            return true;
        }else{
            return false;
        }
    }
    // second way
    // public static boolean checkSorted1(int input[]) {
    //     if(input.length <=1){
    //     return true;
    //     }
    //     //  here we follow recursive leaf of faith in order 
    //     // 1,3,2 order 
    //         if(input[0] > input[1]){
    //             return false;
    //         }
    //         int smallInput [] = new int [input.length -1];
    //         for(int i = 1; i<input.length; i++){
    //             smallInput[i-1] = input[i];
    //         }
    //         boolean smallAns = checkSorted1(smallInput);
    //         return smallAns;
    //     }


    // //  this function checks if the array is sorted from startIndes to end 
    // // this code is better optimise (ABOVE CODE) use of space & time while run 
    
    // public static boolean checkSortedBetter(int input[] , int startIndex){
    //     if(startIndex >= input.length -1){
    //         return true;
    //     }
    //     if(input[startIndex] > input[startIndex +1]){
    //         return false;
    //     }
    //     boolean smallAns = checkSortedBetter(input,startIndex + 1);
    //     return smallAns;
    // }
    public static void main(String[] args) {
        int input[] = {1,2,3};
        // System.out.println(checkSortedBetter(input, 0));
        System.out.println(checkSorted(input));
        // System.out.println(checkSorted1(input));
    }
    
}
