package recursion2;

public class ConvertStringToInt {
    // public static int convertStringToInt(String input){
    //     if(input.length() == 1){
    //         return input.charAt(0) - '0';
    //     }
    //     int a = convertStringToInt(input.substring(1));
    //     int b = input.charAt(0) - '0';
    //     return b*10^input.length()-1 + a;
    // } 
    public static int convertStringToInt(String input){
		// Write your code here
		if(input.length() == 1){
            return input.charAt(0)-'0';
        }
        int a = convertStringToInt(input.substring(1));
        int b = input.charAt(0) - '0';
        double du = (int)Math.pow(10,input.length()-1);
           int c = (int)du; 
        return b*c + a;
    } // another way of solving a this question written below
    
    public static void main(String[] args) {
        String input = "1234";
         System.out.println(convertStringToInt(input));
        
    }
}
