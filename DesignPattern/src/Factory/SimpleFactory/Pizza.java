package Factory.SimpleFactory;
//工厂模式

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Pizza{
    protected String name;
    public abstract void prepare();

    public void bake(){
        System.out.println(name + "  baking");
    }
    public void cut(){
        System.out.println(name + "  cutting");
    }
    public void box(){
        System.out.println(name + "  boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ChessPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("准备chessPizza");
    }
}
class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("准备GreekPizza");
    }
}
class OrderPizza{

//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do{
//            orderType = getType();
//            if(orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("greekPizza");
//            }else if(orderType.equals("chess")){
//                pizza = new ChessPizza();
//                pizza.setName("chessPizza");
//            }else{
//                break;
//            }
//            //输出制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        this.setSimpleFactory(simpleFactory);
    }

    public OrderPizza() {
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = "";//由用户输入
        this.simpleFactory = simpleFactory;
        do{
            orderType = getType(); //获取用户需求
            pizza = this.simpleFactory.createPizza(orderType);
            //输出pizza
            if(pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
                System.out.println("finished !");
            }else{
                System.out.println("类型不匹配，结束");
                break;
            }
        }while (true);
    }
    //获取用户需求
    private String getType(){
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
//改进为简单工厂模式以后，这个类就可以直接和SimpleFactory做关联
//暂时使用不到
class PizzaStore{
    public static void main(String[] args) {
        OrderPizza pizza = new OrderPizza();
    }
}

//比如新增一种，只在SimpleFactory里面改动就行了
class ChinaPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("准备 ChinaPizza！");
    }
}