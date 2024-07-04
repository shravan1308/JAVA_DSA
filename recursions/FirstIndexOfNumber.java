package recursions;

public class FirstIndexOfNumber {

    public static int firstIndex(int input[], int x){
    
    return firstIndexi(input, x,0);

    }
    public static int firstIndexi(int input[], int x, int startingIndex){
		if(startingIndex == input.length){
			return -1;
		}
		if(input[startingIndex] == x){
			return startingIndex;
		}
		 
		return firstIndexi(input,x,startingIndex+1);
        
	}
    public static void main(String[] args) {
        int input[] = {1,2,3,4,5};
        int x = 4;
        System.out.println(firstIndex(input, x));
    }
}
