package Javaio;

//Read from a file named abcd.txt and write the contents of abcd.txt file  in xyz.txt

import java.io.*;

public class Jobquestion {
    public static void main(String[] args) throws IOException {
    FileInputStream input = new FileInputStream("/Users/midul/Documents/All_QAwork/Midul/src/ALL_txt_files/abcd.txt");
    FileOutputStream out = new FileOutputStream("/Users/midul/Documents/All_QAwork/Midul/src/ALL_txt_files/xyz.txt");
    int i;
    while ((i=input.read())!=-1){
        out.write(i);
        System.out.print((char)i);
    }
    }

        }



