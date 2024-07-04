package recursions;

// import java.util.Scanner;

public class LastIndex {

    public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

        return lastIndex(input,input.length,x);
		
	}
	public static int lastIndex(int input[],int startIndex, int x){
        if(startIndex == 0){
            return -1;
        }
        
        if(input[startIndex] == x){
            return startIndex;
        }
        
        
        return lastIndex(input,startIndex-1,2);
        
    }

	
	public static void main(String[] args) {
		int[] input = {9,8,10,8};
		int x = 8;
		System.out.println(lastIndex(input, x));
	}
}