package codingNinjaOops;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(20,30);
        f1.print();
        
        f1.setNumerator(12);
        int d = f1.getDenominator();
        System.out.println("initial");
        System.out.println(d);
        f1.print();
        System.out.println("first");

        f1.setNumerator(10);
        f1.setDenominator(7);
        f1.print();
        System.out.println("second");

        Fraction f2 = new Fraction(3,4);
        f1.add(f2);
        f1.print();
        f2.print();
        System.out.println("third");

        Fraction f3 = new Fraction(4,5);
        f1.multiplication(f3);
        f3.print();
        f1.print();
        System.out.println("fifth");

        Fraction f4 = Fraction.add(f1,f3);
        f4.print();
        f1.print();
        f3.print();
        System.out.println("last");
        //////////
        //COMPLEX NO.
        
    }
    
}
