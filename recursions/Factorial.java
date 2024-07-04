package recursions;

public class Factorial {
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        fact(n-1);
        System.out.println("first");
        int ss = fact(n-1); 
        System.out.println("second");
        // return n*fact(n-1);
        return n *ss;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = fact(n);
        System.out.println(ans);

    }
}
