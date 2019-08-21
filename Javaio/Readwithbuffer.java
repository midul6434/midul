package Javaio;

import Stringbuffer.Buffer;

import java.io.*;

public class Readwithbuffer {
    public static void main(String[] args) {
        login();
    }


        private static void login ()  {
        try{
        File filepath = new File(System.clearProperty("user.dir") + "/src/ALL_txt_files/read_write");

            FileReader obj = new FileReader(filepath.getAbsoluteFile());
            BufferedReader br = new BufferedReader(obj);
        int i;
        while ((i=br.read())!=-1) {
            System.out.print((char)i);

        }


        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }








