package generic;

public class GenericUse {
    public static void main(String[] args) {
    
        // GenericMethod <String> gm1 = new GenericMethod<String>("ab", "cd");
        // gm1.setFirst("def");
        // String output = gm1.getSecond();
        // System.out.println(output);
        // GenericMethod <Integer> gm2 = new GenericMethod<Integer>(1,2);
        // GenericMethod <Character> gm3 = new GenericMethod <>('a','c');
        GenericMethod <Integer,String> loki = new GenericMethod<Integer,String>(45,"Shravan");
        loki.setFirst(6);
        loki.setSecond("loki laufeson");


    
    }   
}
