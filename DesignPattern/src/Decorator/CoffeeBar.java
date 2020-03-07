package Decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        //两份chocolate + 一份milk 的longblack
        //单品longblack
        Drink longBlack = new LongBlack();
        System.out.println("费用 = " + longBlack.cost());
        System.out.println("详单 = " + longBlack.getDes());
        //加一份milk
        longBlack = new Milk(longBlack);
        System.out.println();
        System.out.println("费用 = " + longBlack.cost());
        System.out.println("详单 = " + longBlack.getDes());
        //再加一份chocolate
        longBlack = new Chocolate(longBlack);
        System.out.println();
        System.out.println("费用 = " + longBlack.cost());
        System.out.println("详单 = " + longBlack.getDes());
        //再加一份chocolate
        longBlack = new Chocolate(longBlack);
        System.out.println();
        System.out.println("费用 = " + longBlack.cost());
        System.out.println("详单 = " + longBlack.getDes());

    }
}
