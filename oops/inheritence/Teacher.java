package oops.inheritence;

public class Teacher extends Person {
    // public Teacher(String name){
    //     super(name);
    //     System.out.println("inside techer constructor");
    // }
         public void teach(){
             System.out.println(name + "is teaching");
        }
        public void eat (){ // here we override the function. tuning kar diye. write over person function
            super.eat(); // parent class ko access karna
            System.out.println(" teacher " + name+ "is eating" );
        }
        public static void laughing(){
            System.out.println("teacher is laughing");
        }
    }
