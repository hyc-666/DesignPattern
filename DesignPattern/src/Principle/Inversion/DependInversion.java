package Principle.Inversion;
//依赖倒置原则

/**
 * 依赖倒转原则的注意事项和细节
 * 1)低层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好.
 * 2)变量的声明类型尽量是抽象类或接口,这样我们的变量引用和实际对象间，
 *   就存在一个缓冲层，利于程序扩展和优化
 * 3) 继承时遵循里氏替换原则
 */
//细节依赖接口或者抽象类
public class DependInversion {
    //完成Person接受消息的功能
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}
class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息：Hello world!";
    }
}
class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
interface IReceiver{
    public String getInfo();
}
class WeChat implements IReceiver{
    public String getInfo(){
        return "微信消息：Hello world";
    }
}