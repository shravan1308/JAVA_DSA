package fileHandling;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
 // save class
    class Save implements Serializable {
        int i;
    }
public class SerializationSt {
    public static void main(String[] args) throws Exception{
        Save obj = new Save();
        obj.i=52;

        File f = new File("Serial.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        // Retriving value by file handling by codeEditor display on console.
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj2 = (Save) ois.readObject();
        System.out.println("this the value of obj2 " + obj2.i);
        ois.close();
        oos.close();
    }
   
    
}
