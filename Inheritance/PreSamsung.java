package Inheritance;

public abstract class PreSamsung implements Lee{
    public PreSamsung(){
        super();
    }
    public void   phone(){
        System.out.println("I can call now");
    }
    public void  text(){
        System.out.println("I can text now");
    }
    public abstract void games();
    public abstract void  contract();
}
