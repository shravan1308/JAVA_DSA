package Conditional;

// import java.util.Scanner;

public class Switch1 {
    private int roll;
    public static void main(String[] args) {
    Switch1 s1 = new Switch1();       
    s1.setRoll1(12);
    System.out.println(s1.getRoll());
        s1.setRoll1(512);
        System.out.println(s1.getRoll());
    }  
    public void  setRoll1(int Rn){
        roll= Rn;
        // return roll;
    }
    public int getRoll(){
        System.out.println("i called");
        return roll;
    }

}
