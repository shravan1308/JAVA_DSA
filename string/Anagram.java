package string;

public class Anagram {
    public static void main(String[] args) {
        String a = "aab";
        String b = "acb";
        boolean isAnagram = true;
    //     boolean visited[] = new boolean[b.length()];
    //     if(a.length()== b.length()){

    //     // anagram check
    //     for (int i = 0; i < a.length(); i++){
    //         char c = a.charAt(i);
    //         isAnagram = false; // check 
    //         for(int j = 0; j < b.length(); j++){
    //             if (b.charAt(j) == c && !visited[j]){
    //                 visited[j] = true;
    //                 isAnagram = true;
    //                 break;
    //             }

    //         }
    //         if(!isAnagram) break;
    //     }
    // }
    int al[] = new int[256];
    int bl[] = new int[256];
    for(char c : a.toCharArray()){
        int index = (int)c;
        al[index]++;
    }
    for(char c : b.toCharArray()){
        int index = (int)c;
        al[index]--;
    }
    for (int i = 0; i<256; i++){
        if(al[i] != bl[i]){
            isAnagram = false;
            break;
        }
    }
        if(isAnagram){
            System.out.println("yes this is an angram ");
        }else {
            System.out.println("this is not an angram ");
        }
    }
    
}
