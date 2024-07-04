package oops;
// class Dog {
//     String name,Breed,colour;
//     int legs,teeth,nails;
//     String SoundOfDog;
//     public void walk(){
//         System.out.println("it walk's");
//     }
//     public void eat(){
//         System.out.println("");
//     }
// }
public class Method {
    public static void main(String[] args) {
        int meal_cost = 12;
        double tax_percent = 8;
        double tip_percent = 20;
        double tip = meal_cost*tip_percent/100;
    double tax = meal_cost*tax_percent/100;
    int s = (int) meal_cost;
    int t = (int)(s+tax+tip);
    System.out.println(t);
        
    }
}
