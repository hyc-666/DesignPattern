package Bridge;

/**
 * 桥接模式的注意事项和细节
 * 桥接模式的注意事项和细节
 * 1)实现了抽象和实现部分的分离，从而极大的提供了系统的灵活性，让抽象部分和实
 * 现部分独立开来，这有助于系统进行分层设计，从而产生更好的结构化系统。
 * 2)对于系统的高层部分，只需要知道抽象部分和实现部分的接口就可以了，其它的部
 * 分由具体业务来完成。
 * 3)桥接模式替代多层继承方案，可以减少子类的个数，降低系统的管理和维护成本。
 * 4) 桥接模式的引入增加了系统的理解和设计难度，由于聚合关联关系建立在抽象层，
 * 要求开发者针对抽象进行设计和编程
 * 5)桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围有一定的局
 * 限性，即需要有这样的应用场景。
 */

public class Client {
    public static void main(String[] args) {
        FoldedPhone phone = new FoldedPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("=========================");

        FoldedPhone phone1 = new FoldedPhone(new Mi());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("=========================");

        UpRightPhone phone2 = new UpRightPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
        System.out.println("=========================");

        UpRightPhone phone3 = new UpRightPhone(new Mi());
        phone3.open();
        phone3.call();
        phone3.close();
    }
}
