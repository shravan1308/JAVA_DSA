package codingNinjaOops;

public class Employe {
    String name;
    private int emp_id;
    int rat;
    public Employe(){
        rat = 23;
    }
    // public Employe(int range , String n){
    //     emp_id = range;
    //     name = n;
    // }
public void set_id(int id)
{
    if(id>0)
    emp_id=id;
    else 
    System.out.println("Invalid id");
}
public int get_id()
{
    return emp_id;
}
public void zen(){
    System.out.println(emp_id + "is" + name);
}
}
