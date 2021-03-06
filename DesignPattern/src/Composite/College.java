package Composite;

import java.util.ArrayList;
import java.util.List;

public class College extends Composite {
    List<Composite> compositeList = new ArrayList<Composite>();
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println("--------------" + getName() +  "------------");
        for (Composite composite : compositeList){
            composite.print();
        }
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void setDes(String des) {
        super.setDes(des);
    }

    @Override
    public void add(Composite composite) {
        compositeList.add(composite);
    }

    @Override
    public void remove(Composite composite) {
        compositeList.remove(composite);
    }
}
