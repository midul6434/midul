package Stringbuffer;

public class Nothing {

    public static void main(String[] args) {
        StringBuilder life = new StringBuilder("lifecomplicated");
        life.insert(4,"is");
        System.out.println(life);
        life.insert(4,5);
        System.out.println(life);
        life.append("sohard");
        System.out.println(life);
        life.append(3.1214f);
        System.out.println(life);

        char joy[]={'n','o','t','h','i','n','g'};
        life.insert(30,joy);
        System.out.println(life);
       // for(int i=0; i<life.length();i++){
           // System.out.println(life+""+ i);
        String nai="mymatha";
        life.insert(37,nai);
        System.out.println(life);
        }

    }

