package Operators;

import nonPermitiveDataTypes.StackLLEmptyException;
// this is i made this.
public class StackL {
    int data;
    StackL next;
    StackL head;
    int size;

    public StackL(int data){
        next = null;
        head = null;
        size = 0;
        this.data = data;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return (size==0);
    }
    void push(int element){
        StackL newNode = new StackL(element);
        newNode.next = head;
        head = newNode;
        size++;
    }
    int top() throws StackLLEmptyException{
        if(size ==0){
            throw new StackLLEmptyException();
        }
        return head.data;
    }
    int pop() throws StackLLEmptyException{
        if(size()== 0){
            StackLLEmptyException e = new StackLLEmptyException();
            throw e;
         }
        
        int tempData = head.data;
        head = head.next;
        size--;
        return tempData;

    }
    
}
