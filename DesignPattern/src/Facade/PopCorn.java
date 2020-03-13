package Facade;

public class PopCorn {//爆米花机
    private static PopCorn instance = new PopCorn();
    public static PopCorn getInstance(){
        return instance;
    }
    public void on(){
        System.out.println(" popcorn on");
    }
    public void off(){
        System.out.println(" popcorn off");
    }
    public void run(){
        System.out.println(" popcorn is running");
    }
}
