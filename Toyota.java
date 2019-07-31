public class Toyota {
    public Toyota(){
        System.out.println("Its a international brand");
    }
    public Toyota(boolean drivermoremiles){
        System.out.println(drivermoremiles);
    }
    public Toyota(int cheap){
        System.out.println(cheap);
    }
    public Toyota(String light){
        System.out.println(light);
    }
public static void main(String[]args){
    Toyota myToyota = new Toyota();
        System.out.println("In the nyc all the taxi driver drive toyota");


        Toyota cheap = new Toyota(22000);
        Toyota light = new Toyota("Back then they made is car so light ");
        Toyota drivemoremiles=new Toyota(true);
        boolean x = true;
        System.out.println("It's "+x+" that it has good resale value");

        myToyota.dd();
        cheap.cc();
        light.ee();
        drivemoremiles.ff();

}

   public void dd(){
        System.out.println("The 2020 Toyota camry they made it so nice");
}
   public void cc(){
        System.out.println("This car is kinda cheap if you compare with the other car");
}
   public void ee(){
        System.out.println("But this car is kinda light");
}
   public void ff(){
        System.out.println("It's driver more miles");
}













}
