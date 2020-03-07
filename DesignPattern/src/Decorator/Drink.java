package Decorator;

public abstract class Drink {
    public String des;//对Drink的描述
    private float price = 0.0f;//价格

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用
    public abstract float cost();
}
