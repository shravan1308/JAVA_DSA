package string;

// import java.util.Scanner;

public class StringInt {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // // System.out.println(name);
        // String name2 = "A great 'warrier' in\tthe \"mahabharat\" was \'Arjun\' \\ \'karan\' \\ \n \'krishan\' bhagawan\fhanuman";
        // // int ctr = name2.codePointCount(1,12);
        // // System.out.println("codepoint count = " + ctr);
        // System.out.println( name2.codePointCount(1,13)); 
        // // codePoint from index 1 to index 10:
        // System.out.println(name2.contains("ar"));
        // String str  = "xpix";
        // int index = str.indexOf("xpix");
        // System.out.println(index);

       
        // int a = 10; 
        // int sum = 0;
        // for (a = 0; a < 10; a++){
        //   if ( a % 2 == 0 )
        //      continue;
        //  sum = sum + a;
            String input = "abcx";
            System.out.println(removeX(input));
            String ch = "ab";
            if(ch.charAt(0) == 'a'){ 
            int hc = ch.indexOf('a');
            System.out.println(hc);
            }
         }
         public static String removeX(String input){
            // Write your code here
            
            if(input.length() == 0){
                // if( input.charAt(0) == 'x'){
                //     return check;
                // }else{
                //     check = input;
                //     return check;
                // }
                return input;
            } 
            
            
            if(input.charAt(0) == 'x'){
                return removeX(input.substring(1));
            }
            return input.charAt(0) + removeX(input.substring(1));            
        }
        
    }