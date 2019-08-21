package Javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class Newproperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        File obj = new File(System.clearProperty("user.dir") +"/src/ALL_txt_files/Newfile.properties");
        try {
            FileInputStream fileInputStream = new FileInputStream(obj);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            properties.load(fileInputStream);

        }
   catch (IOException e){
            e.printStackTrace();
   }

   String y = properties.getProperty("Myself");
        System.out.println(y);


    }
}
