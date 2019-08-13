package Quiz_10;
/**
 * Do necessary changes to create abstract class AbstractClaculator
 * You are thinking about adding Keypad in the calculator
*/
public  abstract class AbstractCalculator implements Calculator {



    public void creator() {

        System.out.println("Blaise Pascal was first calculator creator");

    }

    public void Size() {
        System.out.println("The first calculator size were so big");

    }

    public void design() {
        System.out.println("It was look like kinda typing machine");

    }

    // Declare a method to add Keypad in that calculator
    public abstract void keypad();

}