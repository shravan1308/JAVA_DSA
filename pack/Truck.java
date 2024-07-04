package pack;

import prctiseCode.Vehicle;

public class Truck extends Vehicle {
    int maxLoadingCapacity;
    
    public void print(){
        System.out.println("Truck maxLoadingCapacity is " + maxLoadingCapacity);
        System.out.println("Truck color has " + color);
        System.out.println();
        System.out.println("Truck has maxSpeed is" + getMaxSpeed());
        System.out.println("Truck has gate is" + gate);
        System.out.println("Truck has headLight is" + headLight );
        System.out.println("Truck has wiper is " + wiper);
        
    }
    

}
