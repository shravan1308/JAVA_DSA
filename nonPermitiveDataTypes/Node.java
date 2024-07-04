package nonPermitiveDataTypes;

public class Node <T> { 
    public T data;
    public Node <T> next; // <T> meaning of this line is connect with same type like Integer,Character.etc.
   public Node(T data){
        this.data = data;
        next = null;
    }
    
}
