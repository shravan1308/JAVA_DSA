package nonPermitiveDataTypes;

public class StackUsingLL <T> {
    private Node<T> head;
    private int size;
    public StackUsingLL(){
        head = null;
        size = 0;
    }
    int size(){
        return size;
    }

    T top() throws StackLLEmptyException{
        if(size()==0){
            StackLLEmptyException e = new StackLLEmptyException();
            throw e;
            // this also work above throw 
            // throw new StackLLEmptyException();
        }
        return head.data;

    }
    boolean isEmpty(){
        return(size()==0);
    }

    void push(T element){
            Node<T> newNode = new Node<T>(element);
            newNode.next = head;
            head = newNode;
            size++;
    }
    T pop() throws StackLLEmptyException{
        if(size()== 0){
           StackLLEmptyException e = new StackLLEmptyException();
           throw e;
        }
        T tempData = head.data;
        head = head.next;
        size--;
        return tempData;
    }
    
}
