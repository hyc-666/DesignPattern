package Composite;

public class Department extends Composite {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
