package Factory.FactoryMethod;
//工厂方法模式
public abstract class FactoryMethod {
    //就是在增加新的基础类时，将工厂做成一个抽象类，
    //提供抽象方法，具体的实现由工厂类的子类去完成相应需求的方法
    public abstract Pizza createPizza(String type);

}
class BJFactory extends FactoryMethod{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("greek")){
            pizza = new BJGreekPizza();
            pizza.setName("BJGreekPizza");
        }else if(type.equals("chess")){
            pizza = new BJChessPizza();
            pizza.setName("BJChessPizza");
        }
        return pizza;
    }
}
class LDFactory extends FactoryMethod{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("greek")){
            pizza = new LDGreekPizza();
            pizza.setName("LDGreekPizza");
        }else if(type.equals("chess")){
            pizza = new LDChessPizza();
            pizza.setName("LDChessPizza");
        }
        return pizza;
    }
}