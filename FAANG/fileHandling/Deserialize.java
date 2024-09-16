package fileHandling;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import fileHandling.serializ.College;
import fileHandling.serializ.Student;

public class Deserialize {
    public static void main(String[] args) throws Exception{
        try {
            XMLDecoder xmld = new XMLDecoder(new BufferedInputStream(new FileInputStream("MyCollegeData.xml")));
            College c = (College)xmld.readObject();
            List<Student> s = c.getStudents();
            for(Student value : s){
                System.out.println(value);
            }
            xmld.close();
        } catch (FileNotFoundException ex) {
             Logger.getLogger(SerilizeXML.class.getName()).log(Level.SEVERE, null ,ex);
        }
    }
    
}
