package oops.singleton;

public class AppCongi {
    String name;
    //singleton means only one object of a class
    private AppCongi(){

    }
    private static AppCongi obj = null;
    public static AppCongi getInstance (){
        if (obj == null){
            obj = new AppCongi();
        }
     return obj;   
    }
}
