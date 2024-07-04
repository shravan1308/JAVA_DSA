package oops.singleton;

public class MainClass {
    public static void main(String[] args) {
        AppCongi obj = AppCongi.getInstance();
        obj.name = "anuj kumar";
        System.out.println(obj.name);

    }
    
}
