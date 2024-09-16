package javaConnDB;
import java.sql.*;

public class DAO {
    public static void main(String[] args) throws Exception{
        // we want to get the name of rollno x,y,z. how we get complete way below
        StudentDAO dao = new StudentDAO();
        Student s2 = new Student();
        s2.rollNo = 8;
        s2.sName = "Archana";
        s2.s_id = 8;
        dao.connect();
        dao.addStudent(s2);
        // above 3 lines of code make easier to access db according to rollno type diff roll no get respective name of student. i.e 1-> shravan,2->deepanshu ...!

        //  To Do List 
        // dao.removeStudent(12);

    }
    
}

// dao pattern
class StudentDAO {
    Connection con = null;
    public void connect(){
        String url = "jdbc:mysql://localhost:3306/studentdata";
        String username = "root";
        String password = "Mysql@#123java"; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public void addStudent(Student s){
        String query = "insert into student values(?,?,?)";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, s.s_id);
            pst.setInt(2, s.rollNo);
            pst.setString(3, s.sName);
            pst.executeUpdate();
            System.out.println("one row affected");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

//  +++++++++++++++ getStudent   +++++++++++++++++
    public Student getStudent(int rollno) {
        
        try {
            String query = "select std_name from student where std_rollno=" + 
            rollno;

            Student s = new Student();
            s.rollNo = rollno;

            // String url = "jdbc:mysql://localhost:3306/studentdata";
            // // database credentials only checking connection established or not
            // String username = "root";
            // String password = "Mysql@#123java";
            
            
            // Class.forName("com.mysql.cj.jdbc.Driver");
        
            // con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            rs.next();
            String name = rs.getString("std_name");
            s.sName = name;
            return s;
        } catch (Exception e) {
           System.out.println(e);
        }
        return null; 
        // see very carefully here while rtn s have roll&name but we have only roll no Not name of student we fetch name of the that roll no student from the DB. In line no - 21 the fetch code written.
    }
}
// -------------    STUDNET CLASS    --------------
class Student {
    int rollNo;
    String sName;
    int s_id;

}