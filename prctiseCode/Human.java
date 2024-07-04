package prctiseCode;

public class Human {
    Human human;
    static final int hands = 2;
    static final int legs = 2;
    static final int eyes = 2;
    private String nameOfHuman;
    int weight;
    

    public void setNameOfHuman(String name){
        System.out.println("name of human has changed according to your request");
        nameOfHuman = name;
    }
    public String getNameOfHuman( int x){
        weight = x;
        System.out.println("this is your out put name of the human is " + nameOfHuman);
        return nameOfHuman;
    }
    public void HumanInfo(){
        System.out.println("The human has these properties are "+nameOfHuman+" : "+legs + " : "+eyes+" : " + hands);
        System.out.println("All human has diff. brain and their diff. behaviour");
    }
    public void handUses(){
        System.out.println("The human has 2 hands. And can perform certain action");
    }
    // public void handUses(int x){
    //     System.out.println("like  to make, to write, to work, to many action's are");
    // }
    public void eyeUse(){
        System.out.println("human see/watch/look around with help of eye");
    }
    public int LegsUses(){
        System.out.println("A diff. human can use their legs in diff. way.May be a cricketer,footballer,runner");
        return 0;
    }
    public Human(int hands,String name){
        this.nameOfHuman = name;
    }
    public Human(){
        
    }

}
