package recursions;

public class CheckXInArray {
    public static boolean print(int input[],int x){
        if(input.length == 0){
            return false;
        }
        

        int arr [] = new int [input.length-1];
        for(int i = 1; i<input.length; i++){
            arr[i-1] = input[i];
        }
        if(input[0] == x){
            return true;
        }
        boolean find = print(arr, x);
        return find;
        

    }
    public static void main(String[] args) {
        int input [] = {1,2,3,4};
        int x = 6;
        System.out.println(print(input, x));

    }
}
