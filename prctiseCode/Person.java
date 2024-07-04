package prctiseCode;

public class Person extends Human{
    int weight;
    String nameOfPerson;
    public Person(int x, String nameOfHuman){
        this.weight = x;
        nameOfPerson = nameOfHuman;
    }
    public void handUses(){
        super.handUses();
        // super.handUses(9);
        System.out.println(super.weight + " is" + weight);
        System.out.println("there a human has only two hand's");
    }
    public void personInfo(){
        System.out.println(nameOfPerson +" : " +weight);
    }
    


}
