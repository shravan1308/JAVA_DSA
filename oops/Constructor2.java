package oops;

 class Behicle {
    int wheels;
    int indicator;
    String red;
    // here we pass parameter in constructor it is parametarised ! if we remove it it will no arg costructor
    Behicle (int wheels){
        this.wheels = wheels;
        indicator = 4;
    }
    Behicle (){  
        // we can't call((object banna ke baad) default constructor if we need have to define it.
    }
        Behicle( int wheels , String red){
            this.wheels = wheels;
            this.red = red;
        }
    }
    
    public class Constructor2 {
        // Constructor2(){
            //    System.out.println("hello");
    // }
    public void check (){
        System.out.println("is reight");
    }
    class Student{
        
    }

    public static void main(String[] args) {
        // Constructor2 obj = new Constructor2();
        Behicle bike = new Behicle(3);
        // both of Vehicle( value ) value take if not take it no arg costructor
        Behicle car = new Behicle(4);
        System.out.println(bike.wheels );
        System.out.println(car.wheels + " Indicator & wheels " + car.indicator + "= wheels");
              Behicle random = new Behicle();  // = default const
        // constuctor like method overloadin of method
         Behicle rikshaw = new Behicle( 4, " black");
         System.out.println(rikshaw.red +" as per your choice we paint" +  rikshaw.wheels);
        System.out.println(random.wheels);
        



    
    }
}
