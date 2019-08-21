package Stringbuffer;

import java.io.FileReader;

public class Buffer {
    public Buffer(FileReader Contruction){

    }
    public static void main(String[] args) {
        StringBuffer now =  new StringBuffer("Construction");
        now.insert(5,"new");
        System.out.println(now);
        now.insert(5,200);
        System.out.println(now);
        now.append(100);
        System.out.println(now);


    }
}
