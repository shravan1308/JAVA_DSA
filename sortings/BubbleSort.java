package sortings;
// here i don't import SelectionSort class bcz it belongs to same package.
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {10,-1,8,3,1,5,9,7878,654,-4,-87961310,0,45,68,89,1000000000,798,979,979,46,98,987,97654,649,798,979,8798,7987,98,798,7};
        bubbleSorting(arr);// private method
        System.err.println("calling Selection SOrt in bubble class and bubble too");
        SelectionSort.getterSelectionSorting(arr);
    }
    public static void getterBubbleSorting(int arr[]){
        bubbleSorting(arr);
    }
    // stopping unauthorisied manipulation in this funtion.
    private static void bubbleSorting(int arr[]){
        int n = arr.length;
        long start = System.currentTimeMillis();
        // for loop(Outer loop) iterate til n-1 for not sort.
        mm:
        for(int i = 0; i<n-1; i++){
            // inner loop checks every two indices element until big is not place at last.For each outer loop iteration. 
            // we optimise (n-1) to (n-i-i).bcz already from back each larger number are sorted automatically no need to do so for you.Run at upto i-times.
            boolean checkSort = true;// go at line no 31.
            for(int j = 0; j<n-1-i; j++){
                // if condition checks right is big or small.
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    checkSort = false;
                }
                
            }
            // we optimise inner loop.Suppose if an arr already,in 1,2 iteration get sorted no need to go again upto 'n-1'(length). What we do it we "check is already sorted or not".That's why we use inside the outer loop everytime it checks
            if(checkSort){
                break mm;
            }
        }
        long end = System.currentTimeMillis();
        for(int item : arr){
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("This will show how much time will it take to excute complete programm " + (end - start));

    }
}
