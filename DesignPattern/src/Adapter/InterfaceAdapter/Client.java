package Adapter.InterfaceAdapter;

public class Client {
    public static void main(String[] args) {
        //在使用匿名内部类的时候只需要重写需要的方法
        IAdapter adapter = new IAdapter() {
            @Override
            public void method1() {
                //假设需要method1方法
//                super.method1();
                System.out.println("接口适配器模式，使用method1方法");
            }
        };
        //在这里调用
        adapter.method1();
    }
}
