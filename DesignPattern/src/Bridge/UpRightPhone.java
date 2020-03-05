package Bridge;

public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("UpRightPhone");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("UpRightPhone");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("UpRightPhone");
    }
}
