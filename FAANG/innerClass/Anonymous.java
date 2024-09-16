package innerClass;

public class Anonymous {
    public static void main(String[] args) {
        B obj = new B(){
            public void show(){
                System.out.println("this is anonymous class. This will overrite the show method" + " we achieve this by overrite and polymorphism. this is the beauty of anonymous class  ");
            }
        };

        obj.show();
    }
}

class B {
    static int j;
    public void show(){
        System.out.println("I'm inner class B");
    }
}