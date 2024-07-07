package encapuslation;
    class Dog {
        int legs;
    }
public class JavaPassByValue {
    public static void main(String[] args) {
        /*java is always java pass by value */
        int c = 23;
        int d = 25; 
        swap(c, d);
        // there is no change's will reflect while changing value in swap. bcz java is pass by value. primitve DType 1st copy and then pass it.
        System.out.println(c + " " + d);
        
        // non primitve
        Dog cc = new Dog();
        cc.legs = 3;
        Dog dd = new Dog(); 
        dd.legs = 4;      
        swaap(cc, dd);
        System.out.println(cc.legs + " " + dd.legs);
        // we are accepting swapped of dog legs but not. Bcz Java is pass by value even in non primitive. in both case primitive and non primitive java is pass by value.
        Dog cnd = new Dog();
        cnd.legs = 1;
        changeLeg(cnd);
        // why this calling value will cng bcz it share have same reference.
        System.err.println(cnd.legs + " this is will change leg of dog 1 to 5  ");
    }

    static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
    }

    // let check for Non primitive DType here is also java is pass by value but in non primitive DType referece's (memory location) share to them ,. let go dive into it
    static void changeLeg(Dog x){
        x.legs = 5;
        // if we do any changes will reflect on the original one we have same memory location
    }
    static void swaap(Dog a, Dog b){
        Dog temp = a;
        a = b;
        b=temp;
    }
    
}
