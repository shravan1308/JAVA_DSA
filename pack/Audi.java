package pack;

import prctiseCode.Human;
import prctiseCode.Vehicle;
// import prctiseCode.*; this write if you not above two write then it use this line.


public abstract class Audi extends Car {
    Audi(){
        super(2,4);

    }
    Audi(int x, int y) {
        super(x,y); 
        System.out.print("This Is Para Audi ");
        }
        void Audai() {
        System.out.print("This Is Def Audi");
        }
        @Override
        public boolean isMotorised() {
            // abstract class    /
            //                  /
            return false;
        }
        public void check1(){
            super.check1();
            System.out.println("const");
        }
        public static void main(String[] args) {
         Truck t1 = new Truck();
         Vehicle v1 = new Vehicle();
         Human h1 = new Human();
         h1.HumanInfo();
         h1.getNameOfHuman(34);
         t1.check1();
         t1.setMaxSpeed(254);
         
         
        //  Car c = new Audi(5,6);
        
         t1.maxLoadingCapacity = 23;
         t1.print();
         t1.check1();
         t1.vehicleInfo();
         v1.vehicleInfo(); 
        //  Audi a = new Audi(5,7);
        // a.Audai();  
        }
    } 

