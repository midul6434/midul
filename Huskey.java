public class Huskey {
    public Huskey() {
        System.out.println("Huskey is the best dog that's what i think");
    }

    public Huskey(String color) {
        System.out.println(color);
    }

    public Huskey(int pet) {
        System.out.println(pet);
    }

    public static void main(String[] args) {
        Huskey myHuskey = new Huskey();
        Huskey pet = new Huskey(1);
        Huskey color = new Huskey("The black huskey is looks nice");
        System.out.println("I wanna get one Huskey");
        boolean a = true;
        System.out.println(a+" that they are so brave dog");

        myHuskey.as();
        pet.bs();
        color.cs();
    }

    public void as(){
        System.out.println("They are very friendly with the cold weather");
    }
    public void bs(){
        System.out.println("They always try to protect they are owner");
    }
    public void cs(){
        System.out.println("My brother likes the huskey to ");
    }
}