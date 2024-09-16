package CollectionAndGeneric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupliBraces {
    public static void main(String[] args) {
        List<Integer> digit = new ArrayList<>();
        digit.add(15);
        digit.add(28);
        digit.add(23);
        digit.add(28);
        digit.add(15);
        System.out.println(digit.get(2));
        // here we initialize the array and set some value. can we create element w/o reference.
        // answer is Yes two way 1st = asList();method 2nd = by double curly brackets {{ }} outer is anonymous and inner bracket is insta initialize. let do some example.
        digit = Arrays.asList(12,54,87,989,12);
        digit = new ArrayList<>(){{
            add(45);
            add(23);
            add(0, 56);
        }};
        // List<String> str = new ArrayList<>(){{
        //     str.add("Sushil");
        // }};
        for(int item : digit){
            System.out.println(item);
        }
        // ---------------- Duplicate   +++++++++++++++++  element print  ++++++
        ArrayList<Integer> al = new ArrayList<>();
        al.add(52);
        al.add(12);
        al.add(52);
        al.add(93);
        al.add(12);
        Set<Integer> dup = new HashSet<>();
        // dup.add(al.get(0));
        System.out.println(dup.add(al.get(0)) + " inserted dupli");
        for(int item:al){
            if(dup.add(item) == false)
            System.out.println(item);
        }
        

    }
    
}
