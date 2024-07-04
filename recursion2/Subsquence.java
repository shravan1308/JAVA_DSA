package recursion2;

public class Subsquence {
    public static String[] subseq(String str){
        if(str.length() == 0){
            String ans[] = {" "};
            return ans;
        }
        String smallAns[] = subseq(str.substring(1));
        String ans[] = new String[2*smallAns.length];
        // int k = 0;
        for(int i = 0; i<smallAns.length; i++){
            ans[i] = smallAns[i];
            // k++;
         }
         for(int i = 0; i<smallAns.length; i++){
             ans[i+smallAns.length] = str.charAt(0)+ smallAns[i];
            //  ans[k] = str.charat(0)+smallAns;
            //  k++;
         }
         return ans;
    }
    public static void main(String[] args) {
        String str = "xyz";
        String ans[] = subseq(str);
        for(String item: ans){
            System.out.println(item);
        }
        
    }
}
