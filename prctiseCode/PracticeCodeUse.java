package prctiseCode;

public class PracticeCodeUse {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setNameOfHuman("harshita");
        h1.HumanInfo();
        // h1.eyeUse();
        // h1.LegsUses();
        h1.weight = 18;
        h1.handUses();
        System.out.println();
        // System.out.println();
        Human h2 = new Human(2,"Shravan");
        Person p1 = new Person(15,"coding ninja");
        p1.handUses();
        p1.personInfo();
        p1.setNameOfHuman("nakul");
        p1.nameOfPerson = "arjun";
        System.out.println(p1.weight + " "+ h2.weight+ " " + p1.getNameOfHuman(19) + p1.nameOfPerson);
        h2.HumanInfo();
        System.out.println("and" + h1.weight);
        System.out.println(h2.getNameOfHuman(5));
        System.out.println(h2.weight);
        System.out.println(Human.hands);
        System.out.println(Human.eyes);
        h2.weight = 4;
        System.out.println(h2.weight);
        
    }
}
