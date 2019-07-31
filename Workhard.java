public class Workhard {
   public Workhard(){
       System.out.println("Nobody wanna work hark");
   }

    public static void main(String[]args){

        Workhard myWork = new Workhard();

        System.out.println("Hard work pay of all the time");
        int hours=14;
        System.out.println("Every saturday I work "+ hours + "hours");

        myWork.pro();
        myWork.hard();
    }

    public void pro() {
        System.out.println("While work in the restaurent,You gotta face a lot of problem.");
    }

    public void hard(){
        System.out.println("Construction work is way more hard than restaurent.");
    }

}
