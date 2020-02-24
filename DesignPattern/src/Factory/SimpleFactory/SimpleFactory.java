package Factory.SimpleFactory;

import Factory.*;

public class SimpleFactory {
    //简单工厂模式
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("简单工厂模式:");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greekPizza");
        } else if (orderType.equals("chess")) {
            pizza = new ChessPizza();
            pizza.setName("chessPizza");
        } else if(orderType.equals("china")){
            pizza = new ChinaPizza();
            pizza.setName("chinaPizza");
        }
        return pizza;
        //输出制作过程
    }
    //简单工厂模式也叫做静态工厂模式，就是把上面的代码写成静态的方法
    //在其他类里面调用的时候也就不用一些set和get方法，直接用类名调用即可
    public static Pizza createPizza1(String orderType) {
        Pizza pizza = null;
        System.out.println("简单工厂模式:");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greekPizza");
        } else if (orderType.equals("chess")) {
            pizza = new ChessPizza();
            pizza.setName("chessPizza");
        } else if(orderType.equals("china")){
            pizza = new ChinaPizza();
            pizza.setName("chinaPizza");
        }
        return pizza;
        //输出制作过程
    }

    public static void main(String[] args) {
        OrderPizza pizza = new OrderPizza(new SimpleFactory());
    }
}