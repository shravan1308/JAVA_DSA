package codingNinjaOops;
class Box{
    int width;
    int height;
    int length;
    void volume(){
        System.out.println(length * width * height);
    }
}
// class Student{
//     String name;
//     int rollNo;
//     Student(int num){
//     rollNo = num;
//     }
       
//     public void print(){
//     System.out.print(name +" " + rollNo +" ");
//     }
// }
 class Check{   // #1 checked here how constr. help to create an object c1.human 
    int type;   // #2 ... this line 1-10 not a part of code this self made for understanding.

    
    private String human;
    int range;
    int eye;
    public Check(int w, String y, int z){
        // type = w;
        eye = 4;
        human = y;
        // range = z;
    }
    public int  setNam(String names){
        human = names;
        return 5;
    }
    public String getNeem(){
        return human;
    }
    
    public void print(){
        System.out.println(type + " :" + " "+ human + " " + range + " eye = " + eye);
    }
} //#10


public abstract class Student {
    public String name;
     private final int rollNum;            // declaration of final kywrd. initilaze but not good bcz every student get same roll no.
    //  public void setrollNum( int rn){  (// this comment out here because after final kywrd 
    //    if(rn<=0){                     // declared above only set valye at moment otherwise at in const. #2)
    //        return;  
    //    }
    //     // rollNum = rn;
    //  }

    public Student(String name, int rollNum){ // (here we made const.because of final kywrd.#1)
        this.name = name;
        this.rollNum = rollNum;
    }

     public int getRollNum(){
         return rollNum;
     }
     public void print(){
         System.out.println(name + " :" + " "+ rollNum);
     }
     public abstract boolean isOurSchoolStudent();
    

    }
     
