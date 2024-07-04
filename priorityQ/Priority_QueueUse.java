package priorityQ;

// import java.util.ArrayList;

public class Priority_QueueUse {
    private static void insertIntoVirtualHeap(int []arr,int i){
        int childIndex = i;
        int parentIndex = (childIndex -1)/2;
        while(childIndex > 0){
            if(arr[childIndex] < arr[parentIndex]){
                int temp = arr[childIndex];
                arr[childIndex] = arr[parentIndex];
                arr[parentIndex] = temp;
                childIndex = parentIndex;
            }else{
                return;
            }
        }
    }
    private static int removeFromVirtualHeap(int arr[], int heapSize){
        int temp = arr[0];
        arr[0] =  arr[heapSize-1];
        heapSize--;
        int index = 0;
        int leftChildIndex =  2*index + 1;
        int rightChildIndex = 2*index + 2;
        while(leftChildIndex < heapSize){
            int minIndex = index;
            if(arr[leftChildIndex] <arr[minIndex]){
                minIndex = leftChildIndex;
            }
            if(rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex]){
                minIndex = rightChildIndex;
            }
            if(minIndex != index){
                int temp1 = arr[index];
                arr[index] = arr[minIndex];
                arr[minIndex] = temp1;
                index = minIndex;
                leftChildIndex = 2*index + 1;
                rightChildIndex = 2*index + 2;
            }else{
                break;
            }
        }
        return temp;
        }   
    
    public static void main(String[] args) {
    //  Priority_Queue pq = new Priority_Queue();
     int arr[ ] = {5,1,9,2,0,6};
     for(int i = 0; i<arr.length; i++){
        insertIntoVirtualHeap(arr, i);
     }
     for(int i =0; i<arr.length; i++){
         arr[arr.length-1-i] = removeFromVirtualHeap(arr,arr.length-1);
        }

        for(int i = 0; i<arr.length; i++){
           System.out.println(arr[i] + " ");
        }
        //  while(!pq.isEmpty()){
    //     System.out.println();
    //  }
    //  System.out.println();
    
    

    }
}
