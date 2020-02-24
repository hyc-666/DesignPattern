package Factory.FactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PizzaStore {
    public static void main(String[] args) {
        FactoryMethod pizza = null;
        PizzaStore sort = null;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("输入地区(bj or ld):");
            String type = scanner.next();
            if(type.equals("bj")){
                pizza = new BJFactory();
                sort = new PizzaStore(pizza);

            }else if(type.equals("ld")){
                pizza = new LDFactory();
                sort = new PizzaStore(pizza);
            }else{
                System.out.println("无法匹配,退出 !");
                break;
            }

        }while (true);
        scanner.close();
    }


    //定义工厂
    FactoryMethod factoryMethod;
    Pizza pizza = null;

    public PizzaStore(FactoryMethod factoryMethod) {
        this.setFactoryMethod(factoryMethod);
    }

    public void setFactoryMethod(FactoryMethod factoryMethod){
        String orderType = "";//由用户输入
        this.factoryMethod = factoryMethod;
        do{
            orderType = getType(); //获取用户需求
            pizza = this.factoryMethod.createPizza(orderType);
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
