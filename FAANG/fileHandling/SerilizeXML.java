package fileHandling;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import fileHandling.serializ.College;
import fileHandling.serializ.Student;

public class SerilizeXML {
    public static void main(String[] args) throws FileNotFoundException {
        Student s1 = new Student();
        s1.setName("Shravan");
        s1.setRollNo(24);
        

        Student s2 = new Student();
        s2.setName("Shravan");
        s2.setRollNo(24);
        List<Student> s = new ArrayList<>();
        s.add(s1);
        s.add(s2);
        // System.out.println(s2);
        College rgpv = new College();
        rgpv.setStudents(s);
        // System.out.println("getting a list of list at index");
        System.out.println(rgpv.getStudents());

        //XML FILE STORING DATA
        try {
            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("MyCollegeData.xml")));
            x.writeObject(rgpv);
            x.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerilizeXML.class.getName()).log(Level.SEVERE, null ,ex);
        }



        
        
    
    }
    
}
