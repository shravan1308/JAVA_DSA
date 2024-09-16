package ennumClass;
interface MobileComp{
    final static String APPLE = "Apple";
    String SAMSUNG = "Samsung";
}

public class EnnumDemo {
    enum MobileCo {
        APPLE,SAMSUNG,HTC;
    }
    public static void main(String[] args) {
        if(MobileComp.APPLE == "Apple");
        System.out.println("own range of mobile");
        // if(MobileComp.SAMSUNG == 1){
        //     System.out.println("error not know about str or cont compariosn with variable");
        // }
        // we use enum for finite constant i.e month,week,companies of car.unlike other progmm lang enum can be define in in/out side the class.
        // by default jvm inherit value,valueof,ordinal method and extd not allowed bydefauld extd enum class only impli so many interface.
        
        System.out.println(MobileCo.APPLE);
    }
}
