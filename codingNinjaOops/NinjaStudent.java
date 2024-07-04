package codingNinjaOops;

public class NinjaStudent {
  
    public static void main(String[] args) {
      // Student s1 = new Student("Himani Tomar", 24);
      // Student s2 = new Student("Shravan Bhagat", 23);
      Check c1 = new Check(5,"manu",5); // #1 checked how constr. help to create an object
      // Student sq = new Student(" name"); A=1
      //  we can't make abstract class instance's bcz declaring abstract class. A= 3
      //  here incomplete class for student make instance's A=2

      // System.out.println(c1);
      // c1.human = "shravan";
      // System.out.println();
      System.out.println(c1.setNam("rahul"));
      System.out.println(c1.getNeem() + " first");// #2 same above written
      c1.print();
    
      
      
  // Student s = new Student(12);
  // s.print();
      // Box b = new Box();
      
      // b.height = 5;
      // b.width = 4;
      // b.volume();
      // s2.name = "Rani";
      // s2.setrollNum(2);
      // s1.name = "Shravan";
      
      // s1.setrollNum(25);
      // s1.print();
      // s1.print();
      // s2.print();
  
              
  
      // System.out.println(s2.rollNum); //<yahan par field visible nahi hai isliye access nahi kar pa rahe hain >
        //rollNum ko pane ke liye method bnna padega phir access kar payenge. don't confuse prove below.

      // System.out.println(s2.name +" " );
      // System.out.println(s1);
      // System.out.println(s2);
      // s2.print();
      // System.out.println(s1.name);
      // s1.print();
      // // System.out.println(s2.getRollNum());
      // System.out.print(Book.count + " ");
      // Book b1 = new Book(500);
      // Book b2 = new Book(600);
      // System.out.println(Book.count);
      // System.out.println(b1.price);
      // System.out.println(b2.price);
      



      
    }
    
}
