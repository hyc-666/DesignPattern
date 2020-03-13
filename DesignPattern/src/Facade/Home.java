package Facade;

/**
 * 外观模式的注意事项和细节
 * 外观模式的注意事项和细节
 * 1)外观模式对外屏蔽了子系统的细节，因此外观模式降低了客户端对子系统使用的复
 * 杂性
 * 2)外观模式对客户端与子系统的耦合关系，让子系统内部的模块更易维护和扩展
 * 3)通过合理的使用外观模式，可以帮我们更好的划分访问的层次
 * 4)当系统需要进行分层设计时，可以考虑使用Facade模式
 * 5) 在维护一个遗留的大型系统时，可能这个系统已经变得非常难以维护和扩展，此时
 * 可以考虑为新系统开发-一个Facade类，来提供遗留系统的比较清晰简单的接口,
 * 让新系统与Facade类交互，提高复用性
 * 6)不能过多的或者不合理的使用外观模式，使用外观模式好，还是直接调用模块好。
 * 要以让系统有层次，利于维护为目的。
 */

public class Home {
    //定义子系统的对象
    private DVDPlayer dvdPlayer;
    private PopCorn popCorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private Light light;

    public Home() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.light = Light.getInstance();
    }
    //操作分4步
    public void ready(){
        popCorn.on();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        light.turnDown();
    }
    public void play(){
        dvdPlayer.play();
    }
    public void pause(){
        dvdPlayer.pause();
    }
    public void end(){
        popCorn.off();
        light.turnUp();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
