package BinaryAndTrees;

import java.util.ArrayList;
// import java.util.Queue;
public class Trees <T> {
    public T data;
    public ArrayList <Trees<T>> children;
    public Trees(T data){
        this.data = data;
        children = new ArrayList<>();
    }
    
}
