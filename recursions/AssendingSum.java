package recursions;

public class AssendingSum {
    

public static void assendingSum(int i, int n, int sum){
    if(i==n){
        sum+=i;
        System.out.println(sum);
        return;
    }
    sum +=i;
    assendingSum(i+1, n, sum);
}
public static void main(String[] args) {
    assendingSum(1, 10, 0);

 }
       
}
