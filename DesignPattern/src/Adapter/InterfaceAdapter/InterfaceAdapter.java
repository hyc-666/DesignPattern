package Adapter.InterfaceAdapter;
//接口适配器模式
/**
 * 接口适配器模式介绍
 * 1) -些书籍称为:适配器模式(Default Adapter Pattern)或缺省适配器模式。
 * 2)当不需要全部实现接口提供的方法时，可先设计-一个抽象类实现接口，并为该接
 * 口中每个方法提供一个默认实现(空方法)，那么该抽象类的子类可有选择地覆
 * 盖父类的某些方法来实现需求
 * 3)适用于一个接口不想使用其所有的方法的情况。
 */
//如果一个接口有很多方法，而我们只需要其中的一个或几个
//那么就可以设计一个抽象类，让这个抽象类去默认实现（空实现）接口的所有方法
//在使用时new一个接口的匿名类，然后只需要把需要使用到的方法重写
public interface InterfaceAdapter {
    //假设这个接口有四个方法
    public void method1();
    public void method2();
    public void method3();
    public void method4();
}
