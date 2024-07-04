package recursion2;

public class PairString {
    public static String addStars(String s) {
        String newSt = "";
        if(s.length() == 1){
            newSt = s;
            return newSt;
        }
        String smallAns = addStars(s.substring(1));
        if(s.charAt(0) == s.charAt(1)){
            newSt = s.charAt(0) + "*" + s.charAt(0) + smallAns;
            return newSt;
        }else{
            return smallAns + newSt;
        }
    }
    public static void main(String[] args) {
        String n = "seek";
        System.out.println(addStars(n));
    }
    
}
