package javaConnDB;
import java.sql.*;

/* 
 * there are not set rules exactly 7 it may up and down according to us.
 * import java.sql. package
 * load and resister the driver -->com.mysql.jdbc.Driver
 * create connection --> Connection
 * create a statement --> Statement
 * execute the query
 * process the result
 * close and be happy
 * 
*/

public class JDBC {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/studentdata";
        // database credentials only checking connection established or not
        String username = "root";
        String password = "Mysql@#123java";
        String Query = "";
        // Query = "select * from student";
        // Query = "insert into student values(5,5,'Himani')";// dml it affect the row in db normal query.
        // another query to get whole table from DB use query as select * from student.
        int userId = 7;
        int userRollNo = 7;
        String antriksh = "Mahima";
        // use variable in query
        Query = "insert into student values(" + userId +" , " + userRollNo +"  , ' " + antriksh +"')"; // ---> notice one thing here we seperate this variable because these variable in double quote's to use as variable not as string not stroe db. rule is " + varialbe name +";
        // -----------------------  Now many varialbe more than 50 than we do manually (" + + ") answer is no. there we use prepared statement for this and set value's accord. and pass this query to prepared statemt and enjoy code has been successfully executed and 1 row affected       ----------------------
        Query = "insert into student values(?,?,?)";


        
        // establish the connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            System.out.println("Connection failed :" + e.getMessage());
        }
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(url, username, password);
        // Statement st = con.createStatement(); // normal statement
        PreparedStatement st = con.prepareStatement(Query);// preparedStatement for many variable to excute and set those values.
        st.setInt(1, userId);
        st.setInt(2, userRollNo);
        st.setString(3, antriksh);
        // int count = st.executeUpdate(Query);// this give how many row affected; if we use prepared statement no need to write query here only in prepared statement;
        int count = st.executeUpdate(); // for preparedStatement
        /*
         * there are 3-type of query in sql 
         * 1--> DDL stand 4 data definition lang(create/drop/alter/truncate..)
         * 2--> DML stand 4 data manipulate lang(update/delete/insert)
         * 3--> DQL stand 4 data query lang(fetching the value from DB)
         */
        // ResultSet rs = st.executeQuery(Query);// this statement give u the whole table not specific data but ResultSet has power to store chunks of data in tabular format.We are using the DQL Query;
        // String std_Data ="";
        // rs.next(); // by default it on name of column like std_name explicitly move it to next element to get data.
        // std_Data = rs.getInt(1) + " : " +rs.getString("std_name");
        // System.out.println(std_Data);
        // // getting 2nd value from table
        
        // rs.next();
        // std_Data = rs.getInt(1) + " : " +rs.getString("std_name");
        // System.out.println(std_Data);
        // // and want to get another value form table what do next write these above 3 line of code again and again to get value of table column.
        // rs.next();
        // std_Data = rs.getInt(1) + " : " +rs.getString("std_name") + " : " + rs.getString("std_id");
        // System.out.println(std_Data);
        // // and than same task of repitation. where repitation comes we use loop here we use while loop until table last data.
        // rs.next();
        // std_Data = rs.getInt(1) + " : " +rs.getString("std_name");
        // System.out.println(std_Data);

        // while (rs.next()) {
        //     std_Data = rs.getInt(1) + " : " +rs.getString("std_name");
        //     // fetching values from db.This query DQL and rtn the resultSet
        //     System.out.println(std_Data);
        // }
        System.out.println(count + " row/s affected");
        st.close();
        con.close();
    }

    
}
