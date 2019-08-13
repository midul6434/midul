public class Gf {
    public static void main(String[] args) {
        System.out.println("Gf are the most annoying thing in the world");
        Gf lot = new Gf();
        lot.staff();
        boolean iseverygirlannoying = true;
        System.out.println(iseverygirlannoying);

        Gf myGf = new Gf();
        myGf.a();
    }

    public void a() {
        System.out.println("They like to make their bf mad");

        int x = 99;
        System.out.println(x + "percent girl are like that");

    }

    public void staff() {
        String[] thing = new String[4];
        try {


            thing[0] = "no friend";
            thing[1] = "no drink";
            thing[2] = "no smoke";
            thing[3] = "be loyal";
            thing[4]= "ntng to say";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(thing.length + " things you gotta do when you gf");
            int b = 0;
            for (b = 0; b < thing.length; b++) {
                System.out.println(thing[b]);
                System.out.println("That's all i wanna say ");
            }
        }
    }
}