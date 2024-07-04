package oops;

public class PassByValue {
    public static void main(String[] args) {
    
    
        // int c = 23;
        // int d =  21;
        // swap(c,d);
        // System.out.println(c + " " + d);
        Dog c = new Dog();
        c.legs = 4;
        Dog d = new Dog();
        d.legs = 3;
        swap(c,d);
        System.out.println(c.legs + " " + d.legs);
  }
// static void swap(int a , int b) {
//   int temp = a;
//   a= b;
//   b= temp;
//     }
    static void swap (Dog a , Dog b){
        Dog temp = a;
        a= b;
        b= temp;
    }
}
class Dog{
    int legs;
}
