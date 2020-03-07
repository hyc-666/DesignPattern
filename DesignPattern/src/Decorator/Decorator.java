package Decorator;
//装饰者模式

/**
 * 装饰者模式定义
 * 1)装饰者模式:动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更
 * 有弹性，装饰者模式也体现了开闭原则(ocp)
 * 2)这里提到的动态的将新功能附加到对象和ocp原则，在后面的应用实例上会以代
 * 码的形式体现，请同学们注意体会。
 */

/**
 * 星巴克咖啡订单项目(咖啡馆) :
 * 1)咖啡种类/单品咖啡: Espresso(意 大利浓咖啡)、ShortBlack、 LongBlack(美式
 * 咖啡)、Decaf(无 因咖啡)
 * 2)调料: Milk、 Soy(豆浆)、Chocolate
 * 3)要求在扩展新的咖啡种类时，具有良好的扩展性、改动方便、维护方便
 * 4)使用00的来计算不同种类咖啡的费用:客户可以点单品咖啡，也可以单品咖
 * 啡+调料组合。
 */

public class Decorator extends Drink{

    private Drink coffee;
    @Override
    public float cost() {
        return super.getPrice() + coffee.cost();
    }

    public Decorator(Drink coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDes() {
        return des + " " + getPrice() + " + " + coffee.getDes();
    }
}
