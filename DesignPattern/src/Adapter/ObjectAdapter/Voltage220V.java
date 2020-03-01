package Adapter.ObjectAdapter;
//被适配者
public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("输出电压 = " + src + " V");
        return src;
    }
}
