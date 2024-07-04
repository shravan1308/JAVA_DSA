package nonPermitiveDataTypes;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        System.out.println(list.size());
        list.add("Shravan");
        list.add("India");
        list.add(1,"mithun");
        list.addFirst("madhu");
        list.set(2, "element");
        list.addLast("Akashay");
        System.out.println(list.size());
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    
    
    
    
    }

    
}
