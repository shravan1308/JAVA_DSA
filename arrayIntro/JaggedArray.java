package arrayIntro;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
//      no. of row 
//         int student[][] = new int[3][];
//         // for(int i = 0; i<n; i++){
            
// //      first row has 2 coloum 
//         student[0] = new int[2];
// //      second row has 3 coloum 
//         student[1] = new int[3];
//         student[2] = new int[1];
//         // }
// //      Initializing array
//         // int counter = 0;
//         for (int i = 0; i<student.length; i++){
//             for(int j = 0; j<student[i].length; j++){
//                 student [i][j] = sc.nextInt();
//                 // counter++;
//             }
//         }
//         System.out.println("Content of 2d Jagged array");
//         for(int i =0; i<student.length; i++){
//             for(int j = 0; j<student[i].length; j++){
//                 System.out.print(student[i][j] + " ");
//             }
//             System.out.println(i);    
//         }
//  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // 2'nd jagged array : 
        int arr[][] = new int[3][];
        // creating 2d array such that first row 
        // has 1 element second row has two 
        // element and so on. 
        for(int i=0; i<arr.length; i++) { 
        arr[i] = new int[i+1];
        }
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                arr[i][j] = count++;
            }
        }
        System.out.println("contents of 2D jagged array");
        for(int i = 0; i<arr.length; i++){
            // j<arr[i].length show one row has coloum < arr[i].length :
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }    
}
