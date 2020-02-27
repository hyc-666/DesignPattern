package Builder.BuilderPattern;

/**
 * 建造者模式解决盖房需求应用实例
 * 1)需要建房子:这一过程为打桩、砌墙、封顶。不管是普通房子也好，别墅也好都
 * 需要经历这些过程，下 面我们使用建造者模式(Builder Pattern)来完成
 */

/**
 *  建造者模式的四个角色
 * 1) Product (产品角色) : -个具体的产品对象。
 * 2) Builder (抽象建造者) :创建- -一个Product对象的各个部件指定的接口/抽象类。
 * 3) ConcreteBuilder (具体建造者) :实现接口，构建和装配各个部件。
 * 4) Director (指挥者) :构建- - -个使用Builder接口的对象。它主要是用于创建一一个复 杂的对象。它主要有两个作
 * 用，一是:隔离了客户与对象的生产过程，二是:负责控制产品对象的生产过程。
 */
public class Client {
    public static void main(String[] args) {
        //建造普通房
        CommonHouse commonHouse = new CommonHouse();
        //创建指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //返回产品
        House house = houseDirector.constructHouse();

        System.out.println();

        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        House highHouse = houseDirector.constructHouse();
    }
}
