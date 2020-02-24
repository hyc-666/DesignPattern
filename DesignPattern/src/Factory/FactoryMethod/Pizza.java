package Factory.FactoryMethod;

public abstract class Pizza {
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
//加入子类又分为两类四种
class BJChessPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("准备BJChessPizza");
    }
}
class BJGreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("准备BJGreekPizza");
    }
}
class LDChessPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("准备LDChessPizza");
    }
}
class LDGreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("准备LDGreekPizza");
    }
}
