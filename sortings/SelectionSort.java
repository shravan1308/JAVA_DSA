package sortings;
// here i don't import BubbleSort class bcz it belongs to same package.
// time complexity of bubble and selection is n(n+1)/2 => n*n(n^2);
public class SelectionSort {
    public static void main(String[] args) {
        // here i tried what i learned in OOP's [Access Modifier's];
        // bubble class call here vice versa
        int arr[] = {5,0,-4,15,1,3};
        BubbleSort.getterBubbleSorting(arr);// getter is public and static no need create it's class object.
        System.out.println("above is Bubble Sort and below is SelectionSort \n");
        selectionSorting(arr);//private Selection Method call 

    }
    private static void selectionSorting(int arr[]){
        int n = arr.length;
        long start = System.currentTimeMillis();
        for(int i = 0; i<n-1; i++){
            int small = arr[i];
            for(int j = i; j<n; j++){
                if(small > arr[j]){
                    small = arr[j];
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }
            }
        }
        long end = System.currentTimeMillis();
        for (int item : arr) {
            System.out.print(item + ",");
        }
        System.out.println();
        System.out.println(" Time taken to execute " +( end - start));
    }
    
    public static void getterSelectionSorting(int arr[]){
        selectionSorting(arr);
    }
}
