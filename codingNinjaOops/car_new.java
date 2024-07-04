package codingNinjaOops;

// public class car_new {
    
    // class Test{
    //     static int marks;
    //     void set_marks(int marks)
    //     {
    //         this.marks=marks;               //Line 1
    //     }
    // }
    // class MCQ {
    //     public static void main (String[] args) {
    //         Test t=new Test();              
    //         t.set_marks(78);                //Line 2
    //         System.out.print(Test.marks);   //Line 3
    //     }
    // }

    // class Book{
    //     int price;
    //     static int count; 
        
    
    //     public Book(int price) {
    //         this.price = price;
    //         count++;
            
    //     }    
    // }
    
    // public class MCQs {
        // public static void main(String[] args) {
         
        // }
    // }


    class Test 
{ 
    int a; 
    int b; 
    Test() 
    {   
        this(10, 20);   
        System.out.print("constructor one "); 
    } 
    Test(int a, int b) 
    { 
        this.a = a; 
        this.b = b; 
        System.out.print("constructor two "); 
    } 
}
// class Vehicle{
//     private Vehicle(){
//         System.out.println("constructor of Vehicle");
//     }
//     public static void main(String[] args) {
//         Vehicle v = new Vehicle();
        
//     }
// }

// class Vehicle{
//     String colour;
//     private int number;
//     void set(int number)
//     {
//         this.number=number;
//     }
//     int get()
//     {
//         return number;
//     }
// }

// class Car extends Vehicle{
//     public static void main(String[] args) {
//         Vehicle v = new Vehicle();
//         v.colour = "white";
//         v.set(1010) ;
//         System.out.println(v.colour + " " + v.get());
//     }
// }


class new_test{
    public static void main(String[] args) 
    { 
        Test object = new Test(); 
        System.out.println();
        System.out.println(object);
        // System.out.println();
    } 
} 
    
// }
