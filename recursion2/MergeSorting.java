package recursion2;
public class MergeSorting{
    public static void mergeSort(int input[]){

        if(input.length <= 1){
            return ;
        }
        int mid = input.length/2;
        int part1[] = new int[mid];
        for(int i = 0; i<mid; i++){
            part1[i] = input[i];
        }
        int part2[] = new int [input.length - mid];
        for(int i = mid; i<input.length; i++){
            part2[i-mid] = input[i];
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(input,part1,part2);
    }
    public static void merge(int[] arr, int s1[], int s2[]){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<s1.length && j<s2.length){
            if(s1[i] <= s2[j]){
                arr[k] = s1[i];
                k++;
                i++;
            }else{
                arr[k] = s2[j];
                k++;
                j++;
            }
        }
            if(i<s1.length){
                while(i<s1.length){
                    arr[k] = s1[i];
                    i++;
                    k++;
                }
            }
            if(j<s2.length){
                while(j<s2.length){
                    arr[k] = s2[j];
                    j++;
                    k++;

                }
            }
    }

    public static void main(String[] args) {
        int input[] = {5,2,8,9,1};
        mergeSort(input);
        System.out.println("hello");
        // for(int i = 0; i<input.length; i++){
        //     System.out.println(input[i]);
        // }
        for(int e: input){
            System.out.println(e);//both are write this is done by for each loop
        }
    }
}