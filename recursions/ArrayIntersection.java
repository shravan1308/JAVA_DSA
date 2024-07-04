package recursions;

public class ArrayIntersection {
    // public static int findUnique(int[] arr) {
    //        //Your code goes here
    //        int val=0;
    //        for (int i=0;i<arr.length;i++)
    //        {
    //            val=val^arr[i];
    //        }
    //        return val;
    //    }
       
	// public static void intersection(int[] arr1, int[] arr2) {
	//     //Your code goes here
        
        
	// }
    public static int[] sortArr1(int [] arr1){
        if(arr1.length == 1){
            return arr1;
        }
        int [] rand = new int[arr1.length-1];
        for(int i =0; i<rand.length; i++){
            rand[i] = arr1[i+1];
        }
        int [] finalOut = sortArr1(rand);
        if(arr1[0] <= arr1[1]){
            return finalOut;
        }else{
            return finalOut;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {2,7,4,2,6,7};

        System.out.println(sortArr1(arr1));    


         



    }
}