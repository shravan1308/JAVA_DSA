package oops;
class Vehicle {
    int wheels;
    int rearIndicator;
    double seat ;
    String color;
    Vehicle(int wheels , String color , double seat){
        this.wheels = wheels;
        this.seat = seat;
        this.color = color;
        rearIndicator = 2;
    }
    int teels;
    String rang;
    Vehicle(int teels, String rang){
        this.teels = teels;
        this.rang = rang;
    }

}

public class MyConstructor {
    // MyConstructor(){
    //     System.out.println("object is now created");
    // }
    public static void main(String[] args) {
        // MyConstructor obj  = new MyConstructor();
        Vehicle car = new Vehicle(4 , "red" , 2.0);
        Vehicle scooty = new Vehicle (2, "blue" , 2.1);
        System.out.println(scooty.wheels +  " " + "wheels " + scooty.seat + " " +  scooty.color + " this is my abraka dabra s");
        Vehicle SudarshanL1 = new Vehicle(4,"red");
        System.out.println(car.wheels + " " + "wheels " + car.color + " this is the that " + car.seat);
        System.out.println(SudarshanL1.teels + " teels is equal to wheels and rang is equal to color  " + SudarshanL1.rang );
    }
}
