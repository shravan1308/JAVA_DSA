package recursion2;

public class quickST {
    int age;
    String name;
    public void printInfo(){
        System.out.println("age = " + age + " name is = " + name);
    }
    public quickST(quickST s1){
        this.name = s1.name;
        this.age = s1.age;

    }
    public quickST(){

    }
    public static void main(String[] args) {
        quickST s1 = new quickST();
        s1.name = "Himani";
        s1.age = 22;
        s1.printInfo();
        quickST st1 = new quickST(s1);
        st1.printInfo();

    }
}
