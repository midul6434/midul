package Quiz_10;

public class SciencetificCalculator extends BasicCalculator{
    public SciencetificCalculator(){
        super();
    }

    public static void main(String[] args) {
        SciencetificCalculator objsci = new SciencetificCalculator();
        objsci.creator();
        objsci.design();
        objsci.keypad();
        objsci.solar();
        objsci.sciene();
      objsci.pie();
    }
    public void sciene() {
        super.Size();
        System.out.println("In this calculator you can slove different kind of scientific problems");
    }
    public void pie(){
        System.out.println("Such as the big number or you can use pie also it's less time");
    }
}
