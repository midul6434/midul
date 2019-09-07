package DBconntection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class Readpropertiesfiles {
    public static void main(String[] args) {
        readproperties() ;
    }

    public static Properties readproperties() {
        Properties properties = new Properties();
        File filepath = new File("/Users/midul/Documents/All_QAwork/Midul/src/DBconntection/Newfile.properties");
        try {

            FileInputStream inputStream = new FileInputStream(filepath);
            InputStreamReader obj = new InputStreamReader(inputStream);
            properties.load(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String username = properties.getProperty("username");
         String password = properties.getProperty("password");
         String url = properties.getProperty("url");
       // System.out.println(username);
        //System.out.println(password);
       // System.out.println(url);



return properties;
    }


}