package recursions;

public class ReplacePi {
    public static String replace(String input){
        String output;
        if(input.length()<= 1){
            return input;
        }
        String small  = replace(input.substring(1));
        if(input.charAt(0) == 'p' && input.charAt(1) == 'i'){
            output = "3.14" + small.substring(1);
        }else{
            output = input.charAt(0) + small;
         }
         return output;
    }
    public static void main(String[] args) {
        String input = "sxpixpi";
        System.out.println(replace(input));
    }
    
}
