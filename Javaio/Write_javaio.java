package Javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_javaio {
    public static void main(String[] args) {
        File file = new File(System.clearProperty("user.dir")+"/src/ALL_txt_files/Write_demo");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hi");
            fileWriter.write("\r");
            fileWriter.write("My name is Midul Talukder");
            fileWriter.close();
        }
    catch (IOException e){
            e.printStackTrace();
    }




    }

}
