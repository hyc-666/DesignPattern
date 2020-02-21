package Principle.SingleResibillity;
//单一原则

public interface Vehicle {
    public void run();
}
class Bike implements Vehicle{

    @Override
    public void run() {
        System.out.println("自行车在路上跑");
    }
}
class Bus implements Vehicle{

    @Override
    public void run() {
        System.out.println("公共汽车在城市公路上跑");
    }
}
class Plane implements Vehicle{

    @Override
    public void run() {
        System.out.println("飞机在天上飞");
    }
}
class Test{
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.run();
    }
}