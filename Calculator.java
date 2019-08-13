import sun.awt.geom.AreaOp;

public class Calculator {
    String statement;

    public Calculator() {
        System.out.println("This constructor can create Basic calculator object");
    }

    public Calculator (String statement) {
        System.out.println(statement);

}

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Calculator statement = new Calculator("Basic Calculator");
        int a=4;
        int b=5;
        int x=a*b;
        int u=a/b;
        System.out.println(x);
        System.out.println(u);

        Calculator add = new Calculator("Scientific Calculator");
        int c=4;
        int y=5;
        int f =c+y;
        int g= c+y;
        System.out.println(f);
        System.out.println(g);

    }
    }