package Inheritance;

public class Samsung extends PreSamsung {
    public Samsung(){
        super();
    }
    public static void main(String[] args) {


        Samsung objsam = new Samsung();
        objsam.games();
        objsam.contract();
        objsam.games(2);
        objsam.text();
    }

        public void games () {
            System.out.println("I can puzzel now ");
        }
        public void games(int x){
        x=2;
            System.out.println(x);
        }
        public  void text(){
            System.out.println("Nothing to say");
        }
        public void contract () {
        super.phone();
            System.out.println("I got all my buddy numbers");

            //  objsam.phone();
            // objsam.text();

        }
    }



