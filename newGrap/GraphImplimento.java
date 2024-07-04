package newGrap;
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Edge implements Comparable<Edge>{
    int source;
    int desti;
    int weight;
    @Override
    public int compareTo(Edge o) {
        // this fn is using for sort an array
        // implements all fn; here is only one.
        return this.weight-o.weight; // this is for increasing order
    }
}
public class GraphImplimento {
    public static int findParent(int v, int parents[]){
        if(parents[v] == v){
            return v; 
        }
        return findParent(parents[v], parents);
    }
    // here edge input array is user define type (Class O.K);
    public static void kruskals(Edge input[], int n){
        Arrays.sort(input);
        Edge output[] = new Edge[n-1];
        int parents[] = new int[n];
        for(int i =0; i<n-1; i++){
            parents[i] = i;
        }
        int count = 0; // how much edge we use
        int i = 0; // where in array
        while(count != n-1){
            Edge currentEdge = input[i];
            int sourceParent = findParent(currentEdge.source,parents);
            int destParent = findParent(currentEdge.desti, parents);
            if(sourceParent != destParent){
                output[count] = currentEdge;
                count++;
                parents[sourceParent] = destParent;
            }
            i++;
        }
        for(int l= 0; l<n-1; l++){
            if(output[l].source<output[l].desti)
                System.out.println(output[l].source + " " + output[l].desti + " " + output[l].weight);
                else
                System.out.println(output[i].desti + " " + output[i].source + " " + output[i].weight);
            

        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Edge input[]= new Edge[e];
        for(int i = 0; i<e; i++){
            input[i] = new Edge();
            input[i].source = sc.nextInt();
            input[i].desti = sc.nextInt();
            input[i].weight = sc.nextInt();
        }
        kruskals(input,n);
        sc.close();
    }
    
}
