import Ifelse_demo.Dealer;

public class Acura {
    public Acura(){
        System.out.println("Acura is the good brand");
    }
    public Acura(String friend){
        System.out.println(friend);
    }

    public static void main(String[] args) {
        Acura myAcura = new Acura();
        Acura friend = new Acura("The MDX is so expensive in the market");
        Dealer myCar = new Dealer();
        myCar.good(30000);
        int r=45000;
        System.out.println("The starting price is $ "+ r);

        myAcura.nice();
        friend.has();

    }
public void has(){
        System.out.println("One of my boy got the ILX");
}
public void nice(){
        System.out.println("I will get one in the future");
}






}
