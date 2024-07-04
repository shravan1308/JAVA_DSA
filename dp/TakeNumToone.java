package dp;

public class TakeNumToone {
    public static int minStepsToOne(int n){
        if(n ==1){
            return 0;
        }
        int op1 = minStepsToOne(n-1);
        int minSteps = op1;
        if(n%3 ==0){
            int op2 = minStepsToOne(n/3);
            if(op2<minSteps){
                minSteps = op2;
            }
        }
        if(n%2 ==0){
            int op3 = minStepsToOne(n/2);
            if(op3<minSteps){
                minSteps = op3;
            }
        }
        return 1+minSteps;

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(minStepsToOne(n));
    }
    
}
