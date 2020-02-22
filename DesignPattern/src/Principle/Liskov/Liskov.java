package Principle.Liskov;
//里氏替换原则
/**
 * 1)里氏替 换原则(Principle.Liskov Substitution Principle)在1988年，由麻省理工学院的以为姓里的女士提出的。
 * 2)如果对每个类型为 T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都代换成o2时，
 *   程序P的行为没有发生变化，那么类型T2是类型T1的子类型。换句话说，
 *   所有引用基类的地方必须能透明地使用其子类的对象。
 * 3)在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
 * 4)里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，
 *   可以通过聚合，组合，依赖来解决问题。.
 */
public class Liskov {
    public static void main(String[] args) {

    }
}
class A extends Base{
    public int fun1(int n1,int n2){
        return n1 - n2;
    }
}
class B extends Base{
    //如果想在B类里使用A类，则可以使用组合的方式
    //增加一个成员变量
    private A a = new A();
    public int fun1(int n1,int n2){
        return n1 + n2;
    }
    public int fun2(int n1,int n2){
        return fun1(n1,n2) + 9;
    }
    public int fun3(int n1,int n2){
        //使用A 类的方法
        return this.a.fun1(n1,n2);
    }
}
class Base{
    //把更加基础的方法和属性写在一个更基础的类
}