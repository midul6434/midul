public class Lexus {
    public Lexus() {
        System.out.println("Its a very nice car");
    }
    public Lexus(int price){
        System.out.println(price);
    }
    public Lexus(String color){
        System.out.println(color);
    }

    public static void main(String[]args){
        Lexus myLexus = new Lexus();
        System.out.println("I wanna get a lexus");
        Lexus price =new Lexus(51000);
        Lexus color = new Lexus("GreyT");

        myLexus.pro();
        price.high();
        color.black();
    }

    public void pro(){
        System.out.println("The interior of this car is so nice ");
    }

    public void high(){
        System.out.println("But the price is kinda high");
    }
    public void black(){
        System.out.println("The black lexus RX300 is so nice ");

    }



}




