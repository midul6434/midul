package Super;

public class Macbook extends Iphone {
    public void lap() {
        super.color();
        super.size();
        System.out.println("matha");
    }

    public static void main(String[] args) {
Macbook di = new Macbook();
di.lap();
    }
}
