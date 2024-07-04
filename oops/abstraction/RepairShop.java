package oops.abstraction;

public class RepairShop {
    public static void repairCar(Car car){
        System.out.println("car is repaired");
    }

    
    public static void main(String[] args) {
        Wagnor wagnor1 = new Wagnor();
        Audi audi1 = new Audi();
        repairCar(wagnor1);
        repairCar(audi1);
    }
    
}
