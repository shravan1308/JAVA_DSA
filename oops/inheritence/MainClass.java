package oops.inheritence;

public class MainClass {
    public static void main(String[] args) {
        // Teacher t1 = new Teacher("Mrs himani tomar");
        Teacher t1 = new Teacher();
        Singer s1 = new Singer ();
        Person p = t1;
        Teacher t = (Teacher)p;
        // t.name = "heera";
        t1.eat();
        // boolean yo = t1 instanceof Teacher;
        System.out.println(t1 instanceof Teacher);
        System.out.println(s1 instanceof Singer);
        System.out.println(t1 instanceof Person);
        System.out.println(t instanceof Person);
        System.out.println(p instanceof Singer);
        


    

    }
}
