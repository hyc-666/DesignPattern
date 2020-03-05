package Bridge;

public class Mi implements Brand {
    @Override
    public void open() {
        System.out.println("Mi.open");
    }

    @Override
    public void call() {
        System.out.println("Mi.call");
    }

    @Override
    public void close() {
        System.out.println("Mi.close");
    }
}
