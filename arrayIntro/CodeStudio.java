package arrayIntro;
// import java.util.HashMap;
public class CodeStudio {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;

        for(int i = 0; i<n-1; i++){
            int minInd = i;
            for(int j = i; j<n; j++){
                if(heights[j]>=heights[minInd]){
                    minInd = j;
                }
            }
            int temp = heights[i];
            heights[i] = heights[minInd];
            heights[minInd] = temp;
            String temp1 = names[i];
            names[i] = names[minInd];
            names[minInd] = temp1;
            
        }
        return names;

    }
    public static void varargs(String... values){
        System.out.println("Display method is invoked without method overload");
    }
    // public static int timeIsOk(String time){

    // }
    static void display(String... values){  
  System.out.println("display method invoked ");  
  for(String s:values){  
   System.out.println(s);  
  }  
 } 
    public static void main(String[] args) {
        String names[] = {"marry", "john","emma"};
        int heights[] = {180,165,170};
        sortPeople(names, heights);
        for(String e : names){
            System.out.println(e);
        }
        String gh = "12"+":"+"35";
        System.out.println(gh.length());
        varargs(names);
        varargs("this work without parameter not used for loop in varagas");
        display(names);
        display("hello");
        display("my","name","is","varags");

    }


}