package CollectionAndGeneric;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Set_Map_Use {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(5);
        set.add(2);
        set.add(5);
        Set<Integer> set2 = new TreeSet<>();
        set2.add(23);
        set2.add(5);
        set2.add(2);
        set2.add(5);
        System.out.println(set.add(5));// duplicate give false
        for(int i : set){
            System.out.println(i +" this set print randomlly and unique element");
        }
        for(int i : set2){
            System.out.print("print in sorted order -->" +i +" ");
        }
        System.out.println();
        System.out.println("welcome map world uses of its f^n ");
        Map<String,String> map = new HashMap<>();
        map.put("BestCricketer", "shravan");
        map.put("MG", "Hector");
        map.put("ph", "8851767965");
        map.put("actor", "akshay");
        map.put("actor", "Amir-Kn");
        System.out.println(map.get("actor") + " value ");
        System.out.println(map.get("actor2"));
        System.out.println(map.containsKey("actor") +" contains");
        System.out.println(map.remove("actor2") +"remove actor2");
        Set<String> kk = map.keySet();
        for (String key: kk) {
            System.out.println(map.get(key));
        }
        /*
            HashTable is synchronized,it is thread safe,but it become slow
            while HashMap is not synchronized, it is not Thread Safe,but it is fast. In Normal way use hashMap.
        */
        //+++++++++++++++---------------+++++++++++++++
        /*
        Question for Interview perspective is can we print all map entry not using KeySet();.Yes we can do by Entry interface in Map interface 
        (have you ever listen/seen a interface in interface [Nested Inteface] look in map & entry). 
        We can achieve by map.entry

        */
        System.out.println("\n" + "MapEntry");
        Set<Map.Entry<String,String>> entry = map.entrySet();
        for(Map.Entry<String,String> mapEntry : entry){
            System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
            mapEntry.setValue("III");
        }

    }
    
}
