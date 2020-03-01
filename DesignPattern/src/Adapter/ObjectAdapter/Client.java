package Adapter.ObjectAdapter;

//对象适配器，客户端需要同时拿到220V和适配器才能使用
public class Client {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
