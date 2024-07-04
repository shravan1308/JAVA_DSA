package oops.inheritence;

public class Singer extends Person {
    // public Singer (String name){
    //     super(name);
    //     System.out.println("inside the constructor");
    // }
    public  void sing(){
        System.out.println("person is singing");
    }
    public void eat (){
        System.out.println("singer" + name+ "is eating" );
    }
    public static void laughing(){
        System.out.println("singer is laughing");
    }
}
