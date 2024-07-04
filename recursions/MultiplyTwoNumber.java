package recursions;

public class MultiplyTwoNumber {
    public static int multiplyTwo(int m , int n){
        if(m== 0 || n==0){
            return 0;
        }
        
        return m+multiplyTwo(m, n-1); 

    }
    public static void main(String[] args) {
        int m = 5;
        int n = 6;
        System.out.println(multiplyTwo(m, n));
    }
    
}
