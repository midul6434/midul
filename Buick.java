public class Buick {
    public Buick(){
        System.out.println("Buick was my first car");
    }
public Buick(String color){
        System.out.println(color);
}
public Buick (long price){
        System.out.println(price);
}

        public static void main(String[]args){
            Buick myBuick = new Buick();
        System.out.println("It's an American car");

Buick color = new Buick("red" + " was my car color");
Buick price = new Buick(32000 + " is the market price ");

color.hobby();
myBuick.gas();
price.much();

    }
public void hobby(){
        System.out.println("I love to use the america car");

}
public void gas(){
        System.out.println("But American car takes a lot of gas ");
}

public  void much(){
        System.out.println("It's to much expensive as a American car");
}

}
