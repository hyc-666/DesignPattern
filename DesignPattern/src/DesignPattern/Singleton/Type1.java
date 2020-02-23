package DesignPattern.Singleton;
//单例模式
public class Type1 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1 == s2);//同一个静态实例
    }
}
//饿汉式（静态变量）

/**
 * 优缺点说明:
 * 1)优点:这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 2)缺点:在类装载的时候就完成实例化，没有达到Lazy Loading的效果。
 *   如果从始至终从未使用过这个实例，则会造成内存的浪费
 * 3)这种方式基于classloder机制避免了多线程的同步问题，不过，instance在 类装载
 * 时就实例化，在单例模式中大多数都是调用getInstance方法，但是 导致类装载
 * 的原因有很多种，因此不能确定有其他的方式(或者其他的静态方法)导致类
 * 装载，这时候初始化instance就没有达到lazy loading的效果
 * 4)结论:这种单例模式可用，可能造成内存浪费
 */
class Singleton{
    //构造器私有化,外部不能new
    private Singleton(){

    }
    //本类内部创建对象实例
    private final static Singleton instance = new Singleton();
    //对外提供静态公有方法返回一个对象实例
    public static Singleton getSingleton(){
        return instance;
    }
}
//饿汉式（静态代码块）

/**
 * 优缺点说明:
 * 1)这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块
 * 中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优
 * 缺点和上面是一样的。
 * 2)结论:这种单例模式可用，但是可能造成内存浪费
 */
class Singleton1{
    private Singleton1(){

    }
    private static Singleton1 instance;
    static {//在静态代码块里创建对象实例
        instance = new Singleton1();
    }
    public static Singleton1 getSingleton1(){
        return instance;
    }
}