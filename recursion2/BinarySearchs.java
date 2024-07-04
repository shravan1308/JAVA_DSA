package recursion2;

public class BinarySearchs {

    public static int binarySearch(int a[], int si, int ei,int x){
        if(a.length == 0){
            return -1;
        }
        int middle = (si+ei)/2;
        if(a[middle] == x){
            return middle;
        }else if(a[middle] < x){
            return binarySearch(a, middle+1, ei, x);
        }else{
            return binarySearch(a, si, middle-1, x);
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println(binarySearch(a, 0, a.length-1, 4));
    }



}
