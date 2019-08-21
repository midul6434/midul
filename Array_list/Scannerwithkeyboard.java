package Array_list;


import java.util.Scanner;

public class Scannerwithkeyboard {
    public static void main(String[] args) {
        String s ="Iphone is the most populer phone";
        Scanner scanner = new Scanner(s);
        System.out.println("From  my opinion "+ scanner.hasNext());
        System.out.println(  s);
        System.out.println("--------+++----------");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.next();
        System.out.println("Build in " + name);
        System.out.println("First Iphone is ");
        String brand = scanner1.next();
        System.out.println(brand);
scanner1.close();

    }
}
