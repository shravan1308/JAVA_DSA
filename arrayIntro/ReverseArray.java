package arrayIntro;

import java.util.Scanner;

public class ReverseArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //     int [] arr1 = { 1,84,5,8,7,9,5,3,5,6,2,3,5,3};
    //     int n = arr1.length;
    // int [] arr2 = new int[n];
    // int k = 0;
    // for(int i = n-1; i>=0; i--){
    //     arr2[k] = arr1[i];  
    //     k++;
    // }
    // System.out.println(n);
    // for(int item: arr2){
    //     System.out.print(item + " ");
    // }
    // System.out.println();
        
    System.out.println("taking user input and reverse that array");
    // same code but taking input by user
    int m = sc.nextInt();

    int alfa [] = new int[m];
    for(int i = 0; i<m; i++){
        alfa[i] = sc.nextInt();
    }
    int alfa2[] = new int [m];
    int l = 0;
    for(int i= m-1; i>=0; i--){
        alfa2[l] = alfa[i];
        l++;
    }
    for(int item: alfa2){
        System.out.print(item + " ");
    }
    System.out.println();
    System.out.println("you made reverse of array");

    sc.close();
    
    }

}
