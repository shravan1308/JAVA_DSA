package prctiseCode;

public class Vehicle{
    protected int gate;
    protected final static int headLight =2;
    int seats;
    private int maxSpeed;
    protected final int wiper;
    private int wheels;
    String nameOfVehicle;
    protected String color;
    protected int gerenricArra;

    public void noOfGate(int gT){
        gate = gT;
        System.out.println(" car has total are");
    }
    
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }

    public Vehicle(int gate, int seats, String nameOfVehicle, int maxSpeed){
        this.gate = gate;
        this.seats = seats;
        this.nameOfVehicle = nameOfVehicle;
        this.maxSpeed = maxSpeed;
        // headLight = 2;
        wiper = 2;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public int getWheels(){
        return wheels;
    }
    public void vehicleInfo(){
        System.out.println(wheels + ":" + maxSpeed);
    }
    public Vehicle(String nameOfVehicle, int gate , int seats){
        this.gate = gate;
        this.nameOfVehicle = nameOfVehicle;
        this.seats = seats;
        // headLight = 2;
        wiper = 2;
    }
    public void check1(){
        System.out.println("halwa");
    }
    public Vehicle(int gerenricArra ){
        this.gerenricArra = gerenricArra;
        // headLight = 2;
        wiper = 2;
    }
    public Vehicle(){
        System.out.println("vehicle constr.");
        // headLight = 2;
        wiper = 2;//
    }

}
