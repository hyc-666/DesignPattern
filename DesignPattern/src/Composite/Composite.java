package Composite;
//组合模式
/**
 * 基本介绍
 * 1)组合模式(Composite Pattern) ，又叫部分整体模式，它创建了对象组的树形结
 * 构，将对象组合成树状结构以表示“整体-部分”的层次关系。
 * 2)组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 * 3)这种类型的设计模式属于结构型模式。
 * 4)组合模式使得用户对单个对象和组合对象的访问具有-致性，即:组合能让客
 * 户以一致的方式处理个别对象以及组合对象
 */
//这个类可以是任意的，可以是普通类，可以是抽象类，还可以是接口
public abstract class Composite {
    private String name;//在机构的名字
    private String des;//描述

    public Composite(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    //add方法
    public void add(Composite composite){
        //默认实现，即空实现
    }
    //remove方法
    public void remove(Composite composite){
        //空实现
    }
    public abstract void print();
}
