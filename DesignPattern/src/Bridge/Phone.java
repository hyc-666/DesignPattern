package Bridge;

public abstract class Phone {
    //类似一个桥的作用
    //把品牌组合进来
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }
    protected void open(){
        this.brand.open();
    }
    protected void call(){
        this.brand.call();
    }
    protected void close(){
        this.brand.close();
    }
}
