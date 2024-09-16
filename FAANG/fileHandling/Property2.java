package fileHandling;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Property2 {
    public static void main(String[] args) {
        try {
            Properties p = new Properties();
        InputStream is = new FileInputStream("DataConfig.properties");
        p.load(is);
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("pass") + " Insta 011cs");
        System.out.println(p.getProperty("url"));
        } catch (Exception e) {

        }
        
    }
    
}
