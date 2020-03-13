package Facade;
//外观模式

/**
 * 基本介绍
 * 1)外观模式(Facade) ，也叫“过程模式:外观模式为子系统中的一-组接口提供
 * 一个-致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加
 * 容易使用
 * 2)外观模式通过定义-一个一致的接口，用以屏蔽内部子系统的细节，使得调用端
 * 只需跟这个接口发生调用，而无需关心这个子系统的内部细节
 */

public class Facade {
    /**
     *
     * 影院管理项目
     * 组建一一个家庭影院:
     * DVD播放器、投影仪、自动屏幕、环绕立体声、爆米花机,要求完成使用家庭影院的
     * 功能，其过程为:
     * 直接用遥控器:统筹各设备开关
     * 开爆米花机
     * 放下屏幕
     * 开投影仪
     * 开音响
     * 开DVD，选dvd
     * 去拿爆米花
     * 调暗灯光
     * 播放
     * 观影结束后，关闭各种设备
     */
    public static void main(String[] args) {
        Home home = new Home();
        home.ready();
        System.out.println();
        home.pause();
        System.out.println();
        home.end();
    }
}
