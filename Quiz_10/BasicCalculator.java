package Quiz_10;
/**
 * Make a concrete class BasicCalculator implementing necessary methods
 * If you wish you can implement new functionality in this class
 *
 * */

public class BasicCalculator extends AbstractCalculator {

public BasicCalculator(){
    super();

}
    public static void main(String[] args) {


        BasicCalculator ojbcal = new BasicCalculator();
        ojbcal.creator();
        ojbcal.design();
        ojbcal.Size();
        ojbcal.keypad();
        ojbcal.solar();
    }

    public void keypad() {
        System.out.println("They put the keypad to in the basic calculator");
    }
    public void solar(){
        System.out.println("they started make this with the solar panel when they create scientific one");
    }
}
