package dp;

public class minCountSquare {
    // public static int minSquareCount(int n){ 
    //     // this by recursion;
    //     if(n==0){
    //         return 0;
    //     }
    //     int res = Integer.MAX_VALUE;
    //     for(int i=1; i*i<=n; i++){
            
    //         int currAns = minSquareCount(n-i*i);
    //         if(res>currAns){
    //             res = currAns;
    //         }
    //     }
    //     int ans = 1+res;
    //     return ans;
    // }
    public static int byDP(int n){
        // this by dynamic programing

        if(n==0){
            return 0;
        }
        int dp[] = new int[n+1];
        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        }
        if(n==0){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for(int i=1; i*i<=n; i++){
            int currAns;
            if(dp[n-i*i] == -1){
               currAns = byDP(n-i*i);
                dp[n-i*i] = currAns;
            }else{
                currAns = dp[n-i*i];

            }
            if(res > currAns){
                res = currAns;
            }
        }
        int ans = 1+res;
        return ans;
        

    }
    // public static int iterativeApproach(int n){
        
    //     int iterDP[] = new int[n+1];
    //     iterDP[0] =0;
    //     // iterDP[1] =1;
    //     int minAns = Integer.MAX_VALUE;
    //     for(int i = 1; i<n; i++){
    //         int currAns;
    //         for(int j = 1; j*j<i; j++){
                
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int n = 17;
        System.out.println(byDP(n));
    }
    
}
