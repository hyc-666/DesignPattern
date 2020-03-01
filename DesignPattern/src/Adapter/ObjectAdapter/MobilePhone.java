package Adapter.ObjectAdapter;

public class MobilePhone {
    //给手机充电
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output() == 5){
            System.out.println("电压5V，可以充电");
        }else if(voltage5V.output() > 5){
            System.out.println("电压大于5V，不能充电");
        }
    }
}
