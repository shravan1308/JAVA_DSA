package recursion2;

public class QuickSorting {
 /*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}
	
		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}
	
	}
	
*/


public class Solution {
    public static void quickSort(int[] input) {
       quickSort(input,0,input.length-1);

   }
   public static void quickSort(int[] input,int sI,int eI){
   //base case
      if(sI>=eI)
          return;
       
       int pivotPos=partition(input,sI,eI);
       quickSort(input,sI,pivotPos-1);
       quickSort(input,pivotPos+1,eI);
   }
   public static int partition(int input[],int sI,int eI)
   {
       int pivot=input[sI];
       int count=0;
       for(int i=sI+1;i<=eI;i++)
       {
           if(input[i]<=pivot)
               count++;
       }
       int pivotPos=sI+count;
       int temp=input[sI];
       input[sI]=input[pivotPos];
       input[pivotPos]=temp;
       int i=sI;
       int j=eI;
       while(i<pivotPos && j>pivotPos)
       {
           if(input[i]<=input[pivotPos])
               i++;
           else if(input[j]>input[pivotPos])
               j--;
           else
           {
               int temp_=input[i];
               input[i]=input[j];
               input[j]=temp_;
               i++;j--;
               
           }
       }
       return pivotPos;
   }
   
}   
}
