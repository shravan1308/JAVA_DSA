package generic;
import java.util.*;
public class Casual {
  
	public static void main(String[] args) {
		// System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
            String str = sc.next();
            char s[] = str.toCharArray();
            int noOfDigit = 1;
            for(int i = 0; i < s.length; i++) {
                if(s[i] == '?'){
                    if( i == 0 ) {
                        noOfDigit*=9;
                    }else{
                        noOfDigit*=10;
                    }
                }
            }
            if(s[0] == '0'){
                noOfDigit = 0;
            }
            System.out.println(noOfDigit);
        }
        sc.close();
	}
    
}
