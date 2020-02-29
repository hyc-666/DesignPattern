package Adapter.classAdapter;
//适配器类
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output() {
        //获取到220V的电压
        int src = output220V();
        int dst = src / 44;//转成5V
        return dst;
    }
    /**
     * 类适配器模式注意事项和细节
     * 1) Java是单继承机制，所以类适配器需要继承src类这一-点算是一个缺点，因为这要
     * 求dst必须是接口，有一-定局限性;
     * 2) src类的方法在Adapter中都会暴露出来，也增加了使用的成本。
     * 3)由于其继承了src类，所以它可以根据需求重写src类的方法，使得Adapter的灵
     * 活性增强了。
     */
}
