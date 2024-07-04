package arrayIntro;

public class Insertion {
    public static void main(String[] args) {
        // insertion sort 
        int arr [] = {2,-9,2,6,4,0};
        for (int i = 1; i<arr.length; i++){
        int current = arr[i];
        int j = i-1;
         while  (j>= 0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        // placement of array element
        arr[j+1] = current;
    }
    for(int sort : arr){
        System.out.print(sort + " ");
    }

    }    
}
