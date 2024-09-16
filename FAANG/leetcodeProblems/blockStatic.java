package leetcodeProblems;

public class blockStatic {
    static int a =0;
    public blockStatic(){
        a++;
    }
    
    public void counter(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        blockStatic bs = new blockStatic();
        blockStatic bs2 = new blockStatic();
        bs.counter();
        bs2.counter();
        p.rain();
    }
    
}
class p {
    static int i = 5;
    public static void rain (){
        System.out.println("Hi");
        System.out.println(i);
    }
    
}
