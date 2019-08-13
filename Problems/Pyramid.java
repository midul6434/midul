package Problems;

public class Pyramid {
    public static void main(String[] args) {
        int amount=10;
        show(amount);
    }
    public static void show (int amount){
       int col= 2*amount-2;

       for(int i=0; i<amount; i++){
           for(int spa=0;spa<col;spa++){
               System.out.print(" ");

           }
           col=col-1;
               for(int spa =0;spa<=i;spa++){
                   System.out.print("* ");

               }
           System.out.println();
       }











    }
}
