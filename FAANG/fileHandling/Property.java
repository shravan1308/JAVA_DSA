package fileHandling;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Property {
    public static void main(String[] args) {
        try {
            Properties pp = new Properties();
            OutputStream os = new FileOutputStream("DataConfig.properties");
            pp.setProperty("url", "localHost:3305/myDb");
            pp.setProperty("name", "Hello");
            pp.setProperty("pass", "89131149#HIMANI");
            pp.store(os,null);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
