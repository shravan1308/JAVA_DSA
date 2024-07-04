package recursion2;
public class RemoveX {
 public static void main(String[] args) {
    String input = "xaxgdx";
    System.out.println(removeX(input));
 }
    
// public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
        if (input.length()==0)
        {
            return "";
        }
        String smallOutput=removeX(input.substring(1));
        if (input.charAt(0)=='x')
        {
            return ""+smallOutput;
        }
        else
        {
            return input.charAt(0)+smallOutput;
        }
	}
}

    
// public static String removeX(String str){
//     if(str.length()-1 == 0){
//         return "";
//     }
//     String ans = "";
//     if(str.charAt(0) != 'x'){
//         ans = ans + str.charAt(0);
//     }
//     String smallAns = removeX(str.substring(1));
//     return ans + smallAns;
// }
// }
