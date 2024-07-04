package string;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("the sky is blue");
        for(int i = 0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
        // // char at index 0
        // System.out.println(sb.charAt(0));
        // // set char at index
        // sb.setCharAt(0,'s');
        // System.out.println(sb);
        // // D replace by s bcz of builder

        // // insert a charator at 0 (where you cna insert)
        // sb.insert(0,'d');
        // System.out.println(sb);
        // sb.insert(1,'D');
        // System.out.println(sb);
        // // delete extra d and s;
        // sb.delete(0,3);
        // System.out.println(sb);
        // System.out.println(sb.length());

        // // append means add char at last place of word 
        // sb.append(" and ");
        // sb.append("christin");
        // sb.append(" plamer");
        // System.out.println(sb.length());
        


    }
    
}
