package innerClass;


public class InnerClasses {
    public static void main(String[] args) {
        // A a = new A();
        // a.i = 24;
        // System.out.println(a.i);// this is normal way of initializing the inst variable value. but how to inner class we have another way to do it
        // // let us go with me to know more 
        // // B b = new B(); this will not work bcz this normal way of instainciate because it means a class out side  
        // ====================right way below==================
        // // A.B obj = new B(); // this is also not work not right way right ==================way below=========================
        // A.B obj2 = a.new B();
        // obj2.j = 266;

        // System.out.println(obj2.j);// this is right way. This is non static inner class/ member class example

//     ---------------  NOW WE DO STATIC INNER CLASS EXAMPLE -------------------

        A.i = 45;
        System.out.println("for making a class static than we check a.i = " + A.i);

        // A.B ab= new A.B();
        // earlier we dont do this in member class but can in static class. A.B for accessing b it is in inside a(inner class b) member of A class or instance of A class.
        A.B.j = 100;
        System.out.println(A.B.j + " = this is static class b accessing not using line no 21 direct as static it behaviour did you know ");

    }
    
}
class A {
    // ============FOR STATIC INNER CLASS EXAMPLE WE ADD STATIC===============
   static int i; 
    static class B {
        static int j;
        public void show(){
            System.out.println("I'm inner class B");
        }
    }
}

