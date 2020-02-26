package Prototype;
//原型模式
/**
 * 1)原型模式(Prototype模式)是指: 用原型实例指定创建对象的种类，并且通过拷
 * 贝这些原型，创建新的对象
 * 2)原型模式是一种创建型设计模式，允许一个对象再创建另外一个可定制的对象，
 * 无需知道如何创建的细节
 * 3)工作原理是:通过将一个原型对象传给那个要发动创建的对象，这个要发动创建
 * 的对象通过请求原型对象拷贝它们自己来实施创建，即对象.clone()
 */
public class Prototype {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",18,"白色");
        //克隆的时候直接调clone方法，不用构造器
        Sheep sheep2 = (Sheep)sheep.clone();
        System.out.println("使用原型模式（默认的是浅拷贝）:");
        System.out.println(sheep + "sheep.hashCode:" + sheep.hashCode());
        System.out.println(sheep2 + "sheep2.hashCode:" + sheep2.hashCode());
        //两个虽然信息一样，但是只是属性上的一样，本质上是两个不同的对象实例
    }
}
//让这个类去实现clone的接口
class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
    //重写clone的方法
    //使用默认的克隆方法(浅拷贝)

    /**
     * 浅拷贝的概念：
     *1)
     * 对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将
     * 该属性值复制一份给新的对象。
     * 2)
     * 对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类
     * 的对象等，那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值(内
     * 存地址)复制一份给新的对象。因为实际上两个对象的该成员变量都指向同一个
     * 实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成
     * 员变量值
     * 3)
     * 前面我们克隆羊就是浅拷贝
     * 4)
     * 浅拷贝是使用默认的clone()方法来实现
     * sheep = (Sheep) super.clone();
     */
    @Override
    protected Object clone() {
        //为了看异常信息，不抛出异常，使用try-catch
        Sheep sheep = null;
        try{
            sheep = (Sheep)super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}