package BinaryAndTrees;

public class Nodes<T> {

    T data;
    Nodes<T> next;
    Nodes(T data){
        this.data = data;
        next = null;
    }
}
