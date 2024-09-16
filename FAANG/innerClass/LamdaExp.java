package innerClass;

public class LamdaExp {
    public static void main(String[] args) {
        Bc obj = new Bc() {
            public void show(){
                System.out.println("Lamda Exp for interface and reduce it more line of code");
            } 
        };
        obj.show();
        // we can optimise it more
        Bc ob = () -> {
            System.out.println("hello this is optimised lamda express and anonymous class and remove the boiler code for more optimistic.\n jvm very smart if go and check .class file not found for anonymous$ .class file.Its kind of anonymous and not create \t we remove { } bracket if only one statement in it");
        };
        ob.show();
    }
    
}
@FunctionalInterface
interface Bc { // SAM -> till 1.7 Single Abstract Method chng in v1.8 function interface annotation have @FunctionalInterface.Not more than 1.
    public void show();
}
class Xyz implements Bc {
    public void show(){
        System.out.println("Hello Lamda Expression");
    }
}
