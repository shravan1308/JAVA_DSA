package codingNinjaOops;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        if(denominator == 0){
            // TOdo error out
            return;
        }
        this.denominator = denominator;
        simplify();
    }    
    public void setNumerator(int numerator){
        this.numerator = numerator;
        simplify();
    }
    public int getNumerator(){
        return numerator;
    }
    public void setDenominator(int d){
        if(d == 0){
            // TOO error out
            return;
        }
        this.denominator = d;
        simplify();
    }
    public int getDenominator(){
        return denominator;
    }
    public void print(){
        if(denominator == 1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator + "/" + denominator);
        }
    }
    private void simplify(){
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for(int i = 2; i<=smaller; i++){
            if(numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
            numerator/= gcd;
            denominator/= gcd;    
        }
    public static Fraction add(Fraction f1 , Fraction f2){
        int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int newDeno = f1.denominator + f2.denominator;
        Fraction f = new Fraction(newNum , newDeno);
        return f;
    }
    public void add(Fraction f2){
        this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator;
        this.denominator = this.denominator*f2.denominator;
        simplify();
    }
    public void multiplication(Fraction f2){
        this.denominator = this.denominator*f2.denominator;
        this.numerator = this.numerator*f2.numerator;
        simplify();
    }
}