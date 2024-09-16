package leetcodeProblems;

import java.util.HashMap;

/**
 * isomorphic
 */
public class isomorphic {

    public static boolean isIsomorphic(String s , String t){
        if(s.length() == 0 && t.length()== 0){
            return true;
        }
        HashMap<Character,Character> hm = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                if(!hm.get(s.charAt(i)).equals(t.charAt(i)))
                return false;
            }else{
                if(hm.containsValue(t.charAt(i))){
                    return false;
                }
                hm.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

        // (foo & tue) not isomorphic mpping is not good o hve two fce U & E 
    public static void main(String[] args) {
        boolean ans = isIsomorphic("egg","add");
        
        System.out.println(ans);
    }
}