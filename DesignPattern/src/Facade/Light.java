package Facade;

public class Light {//灯光
    private static Light instance = new Light();
    public static Light getInstance(){
        return instance;
    }
    public void on(){
        System.out.println(" light on");
    }
    public void off(){
        System.out.println(" light off");
    }
    public void turnUp(){
        System.out.println(" light up");
    }
    public void turnDown(){
        System.out.println(" light down");
    }
}
