package CollectionAndGeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class  CollectionNdList{
    public static void main(String[] args) {
        Collection<Integer> cc = new ArrayList<>(); // this is parametrised Integer. if remove become default.
        System.out.println(cc.size());
        cc.add(223);
        cc.add(10);
        cc.add(5);
        cc.addAll(cc); // added another collection in collection.
        // in collection you cann't sort the collection bcz not have index.
        // Collection.sort(cc); 

        // not support set/Add element at index(indexation) than we use list which have method add to set at index whatever.
        Iterator<Integer> i = cc.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        List<Integer> dd = new ArrayList<>();
        dd.add(23);
        dd.add(2);
        dd.add(012);
        dd.set(2, 120);
        dd.add(2,44);
        dd.remove(1);
        dd.add(34);
        System.out.println(dd.size() + "sdf sz");
        for(int item : dd){
            System.out.println(item);
        }
        // printing the element in one line below is code
        dd.forEach(System.out::print);// insted of print use println.This is stream "api" lamda expression.

        // Object ww[] = dd.toArray();
        // System.out.println(ww.length); of object clss

        // list is always use to sort element and add at index not use collection.
        System.out.println();
       Collections.sort(dd);
       for( int d : dd){
        System.out.println(d + " -_Sort");
       }
    }
}
