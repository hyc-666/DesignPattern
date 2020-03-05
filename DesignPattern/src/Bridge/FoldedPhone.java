package Bridge;

public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("FoldedPhone");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("FoldedPhone");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("FoldedPhone");
    }
}
