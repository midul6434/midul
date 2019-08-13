public class Income {
    public static void main(String[] args) {
        int[] money = new int[4];

     try{
        money[0] = 2000;
        money[1] = 15000;
        money[2] = 40000;
        money[3] = 35000;}
     catch (ArrayIndexOutOfBoundsException e) {
         e.printStackTrace();
       int x=0;
        for(x=0;x<money.length;x++){
           System.out.println(money[x]);
            System.out.println("There is no problem without");
        }
        }
    }
}