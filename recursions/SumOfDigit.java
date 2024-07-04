package recursions;

public class SumOfDigit {
    public static int SumOfDigits(int input){
        int sum;
        if(input == 0){
            return 0;
        }
        sum =  input%10 + SumOfDigits(input/10);
        return sum;
    }
    // another fun going to making:
    public static int sumOfdigi(int input){
        if(input == 0){
            return 0;
        }
        int lastdigi = input%10;
        int recurse = sumOfdigi(input/10);
        return lastdigi + recurse;

    }
    public static void main(String[] args) {
        int input = 234;
        System.out.println(SumOfDigits(input));
        System.out.println(sumOfdigi(input));
    }
}
