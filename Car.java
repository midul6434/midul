public class Car {
    //Class is a blueprint of an object.
    public static void main(String[]args){
        //Main method is some kind of function that without main method you can't run the application.
        System.out.println("There are various car in the world");
        Car myCar = new Car();
        //Object is the represantation of the class.
        //A constructor in Java is a block of the code when an instance of an object is created
        int a=1;
        System.out.println("I just got 1 car");
        //Method is the subprogram acts of an data. Every method can have different name.
        //Method can executed outside of a main method.
        myCar.honda();

    }

public void honda(){
        System.out.println("My car brand is Honda");

    //There are 2 type of data types. one is premitive data types and object type data types.
    //Object type data types could be uncountable.
    int b=21;
    System.out.println("My age is " +b);
    // Static keyword can be before any object created in the class. Without use an object you can use the static keyword.
    String myname;
    myname="Midul Talukder";
    System.out.println("My name is "+ myname);
    int x=2;
    double y=x;
    System.out.println(y);
  //Casting is taking an object turning into the other object.
    }
}
