package fileHandling.serializ;

public class Student {
    private int rollNo;
    private String name;
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Student {"+ "rollNo= " + rollNo + " , S_name= " + name + '}';
    }
}
