package Javaio;

import java.io.*;
import java.util.Properties;

public class Readpropertiesfiles {
    public static void main(String[] args) {
        Properties properties = new Properties();
        File filepath = new File(System.clearProperty("user.dir")+"/src/ALL_txt_files/Newfile.properties");
        try {

            FileInputStream  inputStream = new FileInputStream(filepath);
            InputStreamReader obj = new InputStreamReader(inputStream);
            properties.load(obj);
        }

    catch (IOException e){
            e.printStackTrace();
    }
    String no= properties.getProperty("Myself");
    String yes = properties.getProperty("AGE");
    String msybe = properties.getProperty("Study");
        System.out.println(no);
        System.out.println(yes);
        System.out.println(msybe);



    }
}
