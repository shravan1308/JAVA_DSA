package  generic;
public class GenericMethod <T,v> {
    private T first;
    private v second;
    
    public GenericMethod(T first, v second){
        this.first = first;
        this.second = second;
    }
    public void setFirst(T first){
        this.first = first;
    }
    public T getFirst(){
        return first;
    }
    public void setSecond(v second){
        this.second = second;
}
    public v getSecond(){
        return second;
    }
}
