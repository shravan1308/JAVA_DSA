package recursion2;

public class ReturnKeypad {
    
    public static String[] singleDigit(int n){ // combination
       if(n==2){
       String alph[] = {"a","b","c"};
           return alph;
       }else if(n==3){
           String alph[] = {"d","e","f"};
           return alph;
       }else if(n==4){
           String alph[] = {"g","h","i"};
           return alph;
       }else if(n==5){
           String alph[] = {"j","k","l"};
           return alph;
       }else if(n==6){
           String alph[] = {"m","n","o"};
           return alph;
       }else if(n==7){
           String alph[] = {"p","q","r","s"};
           return alph;
       }else if(n==8){
           String alph[] = {"t","u","v"};
           return alph;
       }else{
           String alph[] = {"w","x","y","z"};
            return alph;	       
       }
   }        
   
   public static String[] keypad(int n){
       // Write your code here
       if(n==0){
           String output[] = {""};
           return output;
       }
       int lastDigit = n%10;
       int digit = n/10; 
       String smallerNumberArray[] = keypad(digit);  // smallAns
       String singleDigitOutput[] = singleDigit(lastDigit);  // combination;
       String keyComb[] = new String[singleDigitOutput.length*smallerNumberArray.length];
       int k = 0;
       for(int a = 0; a<singleDigitOutput.length; a++){
       for(int j = 0; j<smallerNumberArray.length;j++){
           keyComb[k] = smallerNumberArray[j] + singleDigitOutput[a];
           k++;  
       }
       
   }
       return keyComb;
       
   
   }
   public static void main(String[] args) {
    int n = 234;
    String finalKC[] = keypad(n);
    for(int i = 0; i<finalKC.length; i++){
        System.out.println(finalKC[i] + i);
    }
   }
}












