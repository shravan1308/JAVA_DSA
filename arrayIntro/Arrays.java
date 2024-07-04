package arrayIntro;
public class Arrays {
    int marks;
    String name;
    public static boolean exist(char[][] board, String word) {
        int k=0;
        boolean result = false;
        boolean presentChar = false;
         char nish[] = word.toCharArray();
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                
                if(board[i][j] == nish[k] && k<=nish.length-1){
                    result = true;
                    presentChar = true;
                    k++;
                }else{
                    result = false;
                    presentChar = false;
                }
            }
        }
        if(result && presentChar){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        String word = "SEE";
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(board, word));
        System.out.println();
        int num[][] = new int[3][];
        for(int i = 0;  i<3; i++){
            int random = (int)(Math.random()*6) + 1;
            num[i] = new int[random];
            for(int u = 0; u<num[i].length; u++){
                // if(lenOfFir==0 && u == 0)
                    // num[i][u] = 12;
                // else
                    num[i][u] = (int)(Math.random()*13);
            }
        }
       // printing 2d array in for enhanced loop;
       for(int n[]:num){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
       }
       // printing for 3d array [][][] calling index of 3d array 0,0,0 etc
       int [][][] d_3d = {{{1,2,3},{4,5},{6,7,8,9}}};
       for(int [][] arr :d_3d){
           for(int []arr2:arr){
               for(int arr3:arr2){
                   System.out.print(arr3 + " ");
               }
               System.out.println();
           }
           System.out.println();
       }
       // an array of objects it not create obj only stores references of those instance variable and need to separately assign value's to inst-variable
       Arrays arr = new Arrays();
       Arrays arr1 = new Arrays();
       arr.marks = 89;
       arr.name = "Himani";
       arr1.marks = 75;
       arr1.name = "Shravan";
       arr.marks = 81;
       arr.name = "Ram";

       Arrays referencArrays[] = new Arrays[2];
       for(int i = 0; i<referencArrays.length; i++){
            System.out.println(referencArrays[i].marks +" : " + referencArrays[i].name);
       }
        
        // int [] marks = new int [5];  // 1-D ARRAY:
        // marks[0] = 21;
        // marks[1] = 12;
        // marks[2] = 14;
        // marks[3] = 24;
        // marks[4] = 21;
        // for(int item: marks){
        //  System.out.println(item);
        // }

    //     float temperature[] [] = new float[3][3];
    //     // int n = temperature[0].length;
    //     temperature[0][0] = (float) 23.6;
    //     temperature [0][1] = (float)25.25;
    //     temperature [0][2] = (float)41.25;
    //     temperature [1][0] = (float)12.32;
    //     temperature [1][1] = (float)50.0;
    //     temperature [1][2] = (float)100.1;
    //     for (int i= 0; i<temperature[0].length; i++){
    //         for(int j = 0; j<temperature[0].length; j++){
    //         System.out.println(temperature[i][j] + "  " + j);
    //         // System.out.println(n);
    //     }
    // }
    
}

}
