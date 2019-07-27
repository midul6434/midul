public class Heineken {
    public static void main(String[]args) {
        System.out.println("Heineken is the international beer");

        float x = 3.75f;
        System.out.println("Each double can cost $" + x);

        int y = 3;
        int z = 4;
        int abs = 3 * 4;
        System.out.println("If you buy the case it's cost $" + abs);

        Heineken myHeineken = new Heineken();

        myHeineken.bad();
    }

    public void bad(){
        System.out.println("But if you drink a lot It'll damage your liver");
    }
}
