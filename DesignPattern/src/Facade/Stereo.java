package Facade;

public class Stereo {//立体声音响
    private static Stereo instance = new Stereo();
    public static Stereo getInstance(){
        return instance;
    }
    public void on(){
        System.out.println(" stereo on");
    }
    public void off(){
        System.out.println(" stereo off");
    }
    public void turnUp(){
        System.out.println(" voice up");
    }
    public void turnDown(){
        System.out.println(" voice down");
    }
}
