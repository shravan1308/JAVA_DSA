package oops.abstraction;

public abstract class Car { // we canot create obje of this class no required
    public abstract void accelerating(); // this helpful for their child class no meaning of 
    // itself creating obj etc because abstract ke karan;
    public abstract void breaking();
    public void honk(){
        System.out.println( " car is honking");
    }
}
