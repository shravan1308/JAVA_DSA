package recursion2;

public class MergeSortS {
    public static void megerSort(int input[], int sI, int eI){
        if(sI>= eI){
            return ;
        }
        int mid = (sI+eI)/2;
        // part1
        megerSort(input, sI, mid);
        // part2
        megerSort(input, mid+1, eI);
        megerHeler(input, sI, eI);
    }

    private static void megerHeler(int input[], int sI, int eI){
        int mid = (sI+eI)/2;
        int ans[] = new int[eI-sI+1];
        int i = sI;
        int j = mid+1;
        int k = 0;
        while(i<= mid && j<= eI){
            if(input[i] < input[j]){
                ans[k] = input[i];
                i++;
                j++;
            }else{
                ans[k] = input[j];
                j++;
                k++;
            }
        }

        while(i <= mid){
            ans[k] = input[i];
            i++;
            k++;
        }
        while(j <= eI){
            ans[k] = input[j];
            j++;
            k++;
        }

        for(int index = 0; index<ans.length; index++){
            input[sI+index] = ans[index];
        }

    }
    public static void main(String[] args) {
        int input[] = {5,2,8,9,1};
        megerSort(input, 0 , input.length-1);
        for(int i = 0; i<input.length; i++){
            System.out.print(input[i] + " ");
        }
    }
}
