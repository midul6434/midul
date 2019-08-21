package Stringbuffer;

public class Hours {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("people");
        sb.append(" never build in oneday");
        System.out.println(sb);
        sb.insert(28," It takes time");
        System.out.println(sb);
        String no = " Successfully man have always a sad story";
        sb.insert(42,no);
        System.out.println(sb);
    }
}
