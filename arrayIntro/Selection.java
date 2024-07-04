package arrayIntro;

public class Selection {
    public static void main(String[] args) {
        int selected [] = {2,5,6,-9,6,2};
        // System.out.println(selected[5]);
        // System.out.println("chalo bhaago");
        int n = selected.length;
        for (int i = 0; i<n-1; i++){
            int minInd = i;
            for(int j = i; j<n; j++){
                if(selected[j]  <selected[minInd]){
                    minInd = j;
                }

            }
            int temp = selected[i];
            selected[i] = selected[minInd];
            selected[minInd] = temp;
        }
        for(int e : selected){
            System.out.print(e + " ");
        }
    }
}
