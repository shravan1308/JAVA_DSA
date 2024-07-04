package recursions;

public class SumOfArrayElement {
    public static int sum(int input[]){
        
    //     if(input.length == 0){
    //         return 0;
    //     }
    //     if(input.length == 1){
    //         return input[0];
    //     }

    //     int smallInput[] = new int[input.length-1];
    //     for(int i = 1; i <= input.length - 1; i++){
    //         smallInput[i-1] = input[i];
    //     }

    //     return input[0] + sum(smallInput);
    // }



        if(input.length == 1){
            return input[0];
        }
    int arrS[] = new int [input.length -1];
    for(int i = 1; i<input.length; i++){
    arrS[i -1] = input[i];     
    // int sum1 = 0;
    // for(int j = 0; j<input.length; j++){
    // //  sum1 += arrS[i];
    //  System.out.println(sum1);
    // }
 }
     int x = sum(arrS);
    //  return input[0] + sum(arrS);// both same hai ye likhe wo likho;
    return input[0] + x;
}
public static void main(String[] args) {
    int input [] = { 1 , 2 , 3 };
    System.out.println(sum(input));
}
}
