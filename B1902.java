public class B1902 {
    /**
     * Create a default constructor of Calculator class and provide a
     * print statement "This constructor can create Basic calculator object" in body
     *
     * */

    public B1902(){
        System.out.println("B1902 is our QA batch");
    }
    /**
     * Create a parameterized constructor of Calculator class with the String statement parameter
     * Assign description to instance variable statement using this keyword
     *
     * */

    public B1902 (String name){
        System.out.println(name);
    }

public static void main(String[]args){
        B1902 myBatch = new B1902();
        B1902 name = new B1902("There are only 6 peoples in the class");
/**
 * Create a method which can multiply two int variables
 * Remember we want to use this method again and again like add() method
 *
 * */


    int a = 2;
        int b = 5;
        int result = 2+5;
        System.out.println(result+"peoples always attend the class");
        myBatch.learn();
        name.java();
}

public void learn(){
        System.out.println("We still have a lot of thing to learn");

}
public void java(){
        System.out.println("we just started the java ");
}


}
