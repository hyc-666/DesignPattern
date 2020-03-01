package Adapter.ObjectAdapter;

//对象适配器，其中适配器不再继承自220V
//由继承变为聚合，遵守合成复用原则
public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;//拥有一个220V的对象实例

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output() {
        int src = 0;
        int dst = 0;
        if(voltage220V != null) {
            //获取到220V的电压
            src = voltage220V.output220V();
            dst = src / 44;
        }
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
