package hashMpaUse;

import java.util.HashMap;
import java.util.Set;
public class MapUse {
    public static void main(String[] args) {
         HashMap <String, Integer> map = new HashMap<>();
        
        // insert
        map.put("abc",1);
        map.put("def",2);
        map.put("abc",1);
        map.put("def",2); // if same key then size will be before if diff then print other size
        if(map.containsKey("abc")){
            System.out.println("Has abc");
        }

        if(map.containsKey("abc1")){
            System.out.println("Has abc1");
        }

        System.out.println("size:" + map.size());
        
        if(map.containsValue(2)){
            System.out.println("has 2 as value");
        }
        
        // get Value
        int v = 0;
        if(map.containsKey("abc1")){
            v = map.get("abc1");
        } 
        System.out.println(v);
        
        // removes 
        int s = map.remove("abc");
        System.out.println(s);

        // iterative all map many way are 1st is keyset;
         Set<String> keys = map.keySet();

         for(String str : keys){
            System.out.println(str);
         }
       
        System.out.println("hellow world");
        
    }
    
}
