package Games;

public class Hand {
    public void kick(int x, int y ){
        if (x==y){
            System.out.println("They are equal");
        }
        else if (x<y){
            System.out.println("y is greater than x");
        }
        else {
            System.out.println("x is greater than y");

        }



    }
}
