package pack;

public abstract class Car {
    private int seats;
    private int speed;

    public Car(int seats, int speed) {
    this.seats = seats;
    this.speed = speed;
    System.out.print("This Is Car ");
    }
    Car(){

    }
    public void check1(){
        System.out.println("consto car ka ");
    }
    public abstract boolean isMotorised();
    public abstract String getCompany();

    public void setSeats(int space,int max){
        seats = space;
        speed = max;
    }
    public int getSpeed(){
        return speed+seats;
    }
}
