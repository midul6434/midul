package Javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Scanner_Demo {
    public static void main(String[] args) {
        try {


            Scanner scanner = new Scanner(System.in);
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String name = bufferedReader.readLine();
            System.out.println(name);
        }
    catch (IOException e){
            e.printStackTrace();
    }




    }
}
