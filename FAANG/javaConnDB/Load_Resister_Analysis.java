package javaConnDB;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Load_Resister_Analysis {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // DAO [Data Access Object] pattern write jdbc steps in Dao layer.
        // Pqr pqr = new Pqr();
        // why static and instace block code is executed. because as we write 1st part --> Pqr pqr = this load the class and execute the static and then as we write the 2nd part--> new Pqr(); it create instance therefore it execute the  instance block.
        // -------------------- Let go deep in Class.forName(); ----------------
        // Class.forName("Pqr"); // this will do same as 1st want 2nd then use newInstance(is depericated) to get value.This Load & resister Driver.
        // Class.forName("Pqr").newInstance();

        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver()); // this exactly same as above line no-15.while loading the class it load resister(Static block of code).

    }
    
    
}
class Pqr{
        static {
            System.out.println("in static");
        }
        // instance block
        {
            System.out.println("in instance");
        }
}
