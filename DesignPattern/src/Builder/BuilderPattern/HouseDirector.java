package Builder.BuilderPattern;

/**
 * 建造者模式
 * 1)建造者模式(Builder Pattern)又叫生成器模式， 是一种对象构建模式。它可以
 * 将复杂对象的建造过程抽象出来(抽象类别)，使这个抽象过程的不同实现方
 * 法可以构造出不同表现(属性)的对象。
 * 2)建造者模式是一步一步创建一一个复 杂的对象，它允许用户只通过指定复杂对象
 * 的类型和内容就可以构建它们，用户不需要知道内部的具体构建细节。
 */
//指挥者，动态指定制作流程，返回具体的产品
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //建造房子的细节由指挥者完成
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.build();
    }

}
