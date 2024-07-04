package nonPermitiveDataTypes;

import java.util.ArrayList;

public class ArrayDemo {
    
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(); //by default 10 capacity we give own capacity.
        System.out.println(list1.size()); // size of that array 0; user put value is size and capacity how much can put.
        list1.add(15);
        list1.add(20);
        list1.add(25);
        System.out.println(list1.get(2));
        list1.add(2,50);
        System.out.println(list1.size());
        System.out.println(list1.get(2));
        System.out.println( " all elements of arraylist"); 
        list1.remove(1);
        for(int i = 0; i<=list1.size()-1; i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println("above is normal loop below through enhanched loop");
        for(int item:list1){
            System.out.print(item + " ");
        }
    }
    
    
}
