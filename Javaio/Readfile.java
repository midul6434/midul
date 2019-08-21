package Javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {
    public static void main(String[] args)  {
        login();
    }




    private static void login(){
            try {

                FileReader fileReader = new FileReader ("/Users/midul/Documents/All_QAwork/Midul/src/ALL_txt_files/read_write");
            int i;
            while ((i=fileReader.read())!=-1){
                System.out.print((char)i);

            }





            } catch (IOException e) {
                e.printStackTrace();
            }

    }
    }


