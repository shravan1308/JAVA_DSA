package CollectionFrame;
import java.util.*;

public class Sets {
    public static void main(String[] args) {
        // add,addAll,retainAll,size,contains,containsAll,remove,removesAll,isEmpty,toArray. method's of set and implimentation in Ennum,HashSet,LL,TreeSet.
        Set<String> student_Name = new HashSet<>();
        // set is always unique and unordered item in it.const t.c operation.
        student_Name.add("Aman");
        student_Name.add("Murgan");
        student_Name.add("virat kohli");
        student_Name.add("Himani");
        student_Name.add("Shravan");
        student_Name.add("Anushka Sharma");
        System.out.println(student_Name);
        // it will prt "false" if we are adding dupilcate else "True"
        System.out.println(student_Name.add("virat kohli"));
        student_Name = new LinkedHashSet<>();
        student_Name.add("Amar");
        student_Name.add("Akbar");
        student_Name.add("Anthani");
        student_Name.add("birbal");
        // we want output as same we gave input than use LinkedHashSet.
        // using linear fashion to store Data & behaviour of set always unique no const operation t.c.
        System.out.println(student_Name);
        //  want o/p in sorted form and using set behaviour too than we use treeSet
        student_Name = new TreeSet<>();
        student_Name.add("Ziva");
        student_Name.add("Dhoni");
        student_Name.add("Kohli");
        student_Name.add("Shravan");
        System.out.println(student_Name);
    }
    
}
