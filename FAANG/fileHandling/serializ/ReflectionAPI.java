package fileHandling.serializ;

class B {

}
class A extends B {
    //when compile A.class can be class or A.class can be interface

}
public class ReflectionAPI  {
    public static void main(String[] args) throws Exception{
        Class<?> c = Class.forName("fileHandling.serializ.A");
        
        //  class obj of class to know more about to class debugging
        System.out.println(c.isInterface() + " give false because a is class I make change class to interface it will give ture");
        System.err.println(c.getSuperclass() + " A class not extending any class bydefault every class extnd Object class gives the fully qualify obj folder location. if any other class xtd then give that folder location like a extd b or nothing will give object location");
        
        System.out.println(c.getGenericInterfaces() + " genter");
        System.out.println(c.cast(c));
    }

    
}
