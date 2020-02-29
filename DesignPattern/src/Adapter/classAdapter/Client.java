package Adapter.classAdapter;
//类适配器
public class Client {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.charging(new VoltageAdapter());
    }
}
