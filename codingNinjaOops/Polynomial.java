package codingNinjaOops;

public class Polynomial {
    int cofficient;
    int power;
    public Polynomial(int power , int cofficient){
        this.power = power;
        this.cofficient = cofficient;
    }
    public void simplify(){
        System.out.println(cofficient + "x^"+ power);
    }
    
}
