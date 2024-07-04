package string;
import java.util.*;

public class leetCode {
    public static boolean isCircularSentence(String sentence) {
        char c[]= sentence.toCharArray();
        int length = c.length;
        int i =0;
        while(i<length){ 

            if(c[i] == ' '){
                if(c[i-1] != c[i+1]){
                    return false;
                }
            }
        }
        if(c[0]!=c[length-1]){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        // String sentence = "leetcode excercises sound delightful";
        // System.out.println(isCircularSentence(sentence));
        // double spend = X;
        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int monthlyIncome = (int)Math.pow(2,x);
		int ans = 0;
		int totalExpense = sc.nextInt();
		if(totalExpense != 0){
            for(int i =0; i<totalExpense; i++){
                int fifty_per = (monthlyIncome*50)/100;
		        ans = monthlyIncome-fifty_per;
		        monthlyIncome = ans;
		        
		    }
            System.out.println(ans);
		}else{
		    System.out.println(monthlyIncome);
		    
		}
        // System.out.println(ans);
        sc.close();
        int n = sc.nextInt();
		int monthlyIncome1 =(int) Math.pow(2,x);
		int expense[] = new int[n];
		if(expense.length == 0){
		    System.out.println(monthlyIncome);
		}
		for(int i=0; i<expense.length; i++){
		    expense[i] =monthlyIncome1 - (monthlyIncome1*50)/100;
		    monthlyIncome = expense[i];
		}
				    System.out.println(expense[n-1]);
    }
    
}
