package codingNinjaOops;

public class Mains {
    public static void main(String[] args) {
        Car c = new Car();
        c.Print();
    }
}
    class Vehicle {
        public void Print() {
            System.out.print("Vehicle's Print() ");
        }
    }
    
    class FourWheelers extends Vehicle {
        public void Print() {
            System.out.print("FourWheelers's Print() ");
        }
    }
    
    class Car extends FourWheelers {
        public void Print() {
            super.Print();
            System.out.print("Car's Print()");
        }
    }
        
         
    // }
