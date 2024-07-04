package oops.interfaces;

public class Person implements Student , YouTube{
    public static void main(String[] args) {
        Person obj = new Person();
        // obj.study();
        // obj.makeVideo();
        YouTube obj2 = obj; // upcasting and only youtube fun can use
        obj2.makeVideo();
        obj2.editVideo();
        
    }

    @Override
    public void study() {
        System.out.println("person is studying in college");
    }

    @Override
    public void makeVideo() {
        System.out.println("Shravan bhagat is a youtuber ok ");           
    }

    @Override
    public void editVideo() {
        System.out.println("youtuber shravan is editing");
        
        
    }
    
}
