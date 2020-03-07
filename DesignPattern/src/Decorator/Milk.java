package Decorator;

public class Milk extends Decorator {
    public Milk(Drink coffee) {
        super(coffee);
        setDes("milk");
        setPrice(2.0f);
    }
}
