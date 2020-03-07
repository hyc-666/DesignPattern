package Decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink coffee) {
        super(coffee);
        setDes("Chocolate");
        setPrice(3.0f);
    }
}
