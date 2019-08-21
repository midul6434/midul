package Javaio;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Beefeater {


    public static void main(String[] args) {

            File filepath = new File(System.clearProperty("user.dir") + "/src/ALL_txt_files/read_write");
            try {
            FileReader obj = new FileReader(filepath.getAbsoluteFile());
            BufferedReader nob = new BufferedReader(obj);
            int i;
            while((i=nob.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("nothing to say");
        }
    }

}
