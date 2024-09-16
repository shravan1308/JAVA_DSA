package fileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {
    public static void main(String[] args) throws  Exception{
        // storing data in file . and retrieve those data from file
        File f = new File("DemoFileHandling.txt");
        
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Hello this is the file handling");
        dos.close();
        // above code is show we write in the file 
        // now below code is showing we retrieve msg from file by console.
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(" this is the code of retriving data by console-- " + str);
        dis.close();
    }
}
