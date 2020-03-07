package Decorator;

public class Soy extends Decorator {
    public Soy(Drink coffee) {
        super(coffee);
        setDes("soy");
        setPrice(1.5f);
    }
}
