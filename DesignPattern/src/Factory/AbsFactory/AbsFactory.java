package Factory.AbsFactory;

import Factory.FactoryMethod.Pizza;

//抽象工厂模式，与前面工厂方法模式有点类似。
//把简单工厂模式与工厂方法模式结合
//只不过两个Factory不再继承自一个抽象方法，而是实现一个共有的接口，
//接口里的create方法由各自的实现子类去完成
//然后将接口与PizzaSort类聚合
interface AbsFactory {
    public Pizza createPizza(String type);
}
//再定义两个类分别实现接口方法
class BJFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String type) {
        return null;
    }
}
class LDFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String type) {
        return null;
    }
}