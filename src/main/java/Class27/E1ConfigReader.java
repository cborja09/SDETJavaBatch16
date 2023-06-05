package Class27;
    /*
    Get the location of the file
    Either navigate to that file or bring that file into the memory
     */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
       //System.out.println("user.dir") => it gives you the path til your project
        String path=System.getProperty("user.dir")+"/Files/Config.properties";
        //Brings the data frm the file in the form of bytes
        FileInputStream fis=new FileInputStream(path);
        //Converts the data in the form of key value pairs
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println(prop.get("userName"));

    }
}
