package Facade;

public class Projector {
    private static Projector instance = new Projector();
    public static Projector getInstance(){
        return instance;
    }
    public void on(){
        System.out.println(" projector on");
    }
    public void off(){
        System.out.println(" projector off");
    }
    public void play(){
        System.out.println( " projector is playing");
    }
}
