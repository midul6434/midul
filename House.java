public class House {
    public static void main(String[]args){
        System.out.println("Every join family need big house to live");
        House myHouse =new House();
         String Adress;
         Adress="9567 Southrichmond hill";
         System.out.println("Our house is on" + Adress);

         long x =900000;

         System.out.println("We bought it for $"+x);

   myHouse.two();

    }
    public void two(){
        System.out.println("It is two family house");
    }
}
