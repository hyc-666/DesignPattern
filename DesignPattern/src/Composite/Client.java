package Composite;

/**
 *组合模式的注意事项和细节
 * 1) 简化客户端操作。客户端只需要面对一致的对象而不用考虑整体部分或者节点叶子
 * 的问题。
 * 2)具有较强的扩展性。当我们要更改组合对象时，我们只需要调整内部的层次关系，
 * 客户端不用做出任何改动.
 * 3)方便创建出复杂的层次结构。客户端不用理会组合里面的组成细节，容易添加节点
 * 或者叶子从而创建出复杂的树形结构
 * 4)需要遍历组织机构，或者处理的对象具有树形结构时,非常适合使用组合模式.
 * 5)要求较高的抽象性，如果节点和叶子有很多差异性的话，比如很多方法和属性
 * 都不一样，不适合使用组合模式
 */
public class Client {
    //学校院校展示案例
    public static void main(String[] args) {
        //从大到小创建对象
        Composite university = new University("Thinghua","top1");
        Composite computer = new College("computer","computer");
        Composite information = new College("information","information");
        Composite internet = new Department("Internet","Internet");
        Composite safe = new Department("InternetSafe","safe");
        Composite call = new Department("通信","通信");

        university.add(computer);
        university.add(information);

        computer.add(internet);
        computer.add(safe);

        information.add(call);

        university.print();

        computer.print();
    }
}
