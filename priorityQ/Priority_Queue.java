package priorityQ;

import java.util.ArrayList;

public class Priority_Queue {
    /* two type of heap 1st is min heap and 2nd is max heap 
    here is doing we min heap;
    */
    private ArrayList<Integer> heap; 
    public Priority_Queue(){
        heap = new ArrayList<>();
    }
    boolean isEmpty(){
        return heap.size()==0;
    }
    int size(){
        return heap.size();
    }
    int getMin()throws Priority_QueueEmptyException{
        if(isEmpty()){
            throw new Priority_QueueEmptyException();
        }
        return heap.get(0);
    }
    public void insert(int element){
        heap.add(element);
        int childIndex = heap.size()-1;
        int parentIndes = (childIndex-1)/2;
        while(childIndex >0){ 
        if(heap.get(childIndex) < heap.get(parentIndes)){
            int temp = heap.get(childIndex);
            heap.set(childIndex, heap.get(parentIndes));
            heap.set(parentIndes, temp);
            childIndex = parentIndes;
            parentIndes = (childIndex - 1)/2;
        }else{
            return;
        }
    }
    }
    int removeMin() throws Priority_QueueEmptyException{
        if(isEmpty()){
            throw new Priority_QueueEmptyException();
        }
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size() -1));
        heap.remove(heap.size()-1);
        int index = 0;
        int minIndex = index;
        int leftChildIndex = 1;
        int rightChildIndex = 2;
        while(leftChildIndex<heap.size()){

        
        if(heap.get(leftChildIndex)<heap.get(minIndex)){
            minIndex =leftChildIndex;

        }
        
        if( rightChildIndex < heap.size()&&heap.get(rightChildIndex)<heap.get(minIndex)){
            minIndex =rightChildIndex;

        }
        if(minIndex == index){
            break;
        }else{ 
        int temp1 = heap.get(index);
        heap.set(index,heap.get(minIndex));
        heap.set(minIndex, temp1);
        index = minIndex;
        leftChildIndex = 2*index + 1;
        rightChildIndex = 2*index + 2;

        }
    }
    return temp; 

}
    
}
