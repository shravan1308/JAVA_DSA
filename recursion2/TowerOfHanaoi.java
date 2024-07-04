package recursion2;

public class TowerOfHanaoi {


    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {

    if(n== 1){
        System.out.println("move 1st disk from " + source + " to " + destination);
        return;
    }
    // else if(n == 1){
    //     System.out.println(source + " " + destination);
    //     System.out.println("this");
    //     return;
    // }
    towerOfHanoi(n-1, source, destination, auxiliary);
    System.out.println("move  " + n + " nth disk from  " + source + "  //Src  " + " " + destination + " // dst  ");

    towerOfHanoi(n-1, auxiliary, source, destination);
    
    
    
    }
    public static void main(String[] args) {
        towerOfHanoi(4, 's', 'h', 'd');
    }
    
}
