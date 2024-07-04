package oops;

public class Method1 {
    public static void main(String[] args) {
        int x = 12;
        int y = 15;
        float k = 15;
        checkAge(x,y); // here you can pass value by x,y(element) & calling a function;
        checkAge(20,12); // Call the checkAge method and pass along an age of 20;
        sumOfBoth(x,k); 
        // this function show return;
        int usingReturn = SubOfBoth(12,15,12);
        System.out.println(usingReturn);
        sumOfBoth();
        sumOfBoth();
    }
        
    
  // # function = 1, Create a checkAge() method with an integer parameter called age
  static void checkAge(int age , int old) {

    // If age is less than 18, print "access denied"
        if (age < old) {
            System.out.println("Access denied - You are not old enough!"); 
      
    // If age is greater than, or equal to, 18, print "access granted"
        } else {
             System.out.println("Access granted - You are old enough!"); 
        }
    
    } 
    //# funtion =2, we try to adding two number through function:
    static int sumOfBoth(int a , float b){ // method over loading break with same name of method & differ parameter pass that's why;
        int sum = a+ (int) b;
        System.out.println(sum);
        return 1;
    }
    // # functoiion = 3, here we add two numberusing return keyword :
    static int SubOfBoth(int a,int x, int c){
        return a-x-c;
    }
    // # function = 4; not return any value bcz used is void 
    static void sumOfBoth(){
        System.out.println("hello ji");
        System.out.println("nice good morning for you");
    }
}
