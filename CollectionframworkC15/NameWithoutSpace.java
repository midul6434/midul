package CollectionframworkC15;

public  class NameWithoutSpace {
    public static void main(String[] args) {
        NameWithoutSpace obj = new NameWithoutSpace();
        obj.now();

        obj.roll();
    }


    public String roll() {
        String hisname = "abul kuddus";
        hisname= hisname.replaceAll("\\s","");
        System.out.println(hisname);
        return hisname;
    }

public String now(){
    String myname = "Midul   Talukder";
    myname = myname.replaceAll("\\s", "");
    System.out.println(myname);

    return myname;
}






}

















/**
 * Instead of returning newLengthOfArray return new String without space.
 *
 *
 * */

