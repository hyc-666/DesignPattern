package Prototype;
//原型模式

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * 深拷贝:
 * 1)
 * 复制对象的所有基本数据类型的成员变量值
 * 2)
 * 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变
 * 量所引用的对象，直到该对象可达的所有对象。也就是说，对象进行深拷贝要对
 * 整个对象进行拷贝
 * 3) 深拷贝实现方式1:重写clone方法来实现深拷贝(就是单独处理引用类型的类)
 * 4)
 * 深拷贝实现方式2:通过对象序列化实现深拷贝
 */
public class DeepClone {
    public static void main(String[] args) throws Exception{
        DeepTarget2 dt = new DeepTarget2("timo",new DeepTarget("小莫",150));
//        DeepTarget2 dt2 = (DeepTarget2) dt.clone();
//        System.out.println("使用方式一看引用类型是否拷贝：");
//        System.out.println("dt.deepTarget:" + dt.target.hashCode());
//        System.out.println("dt2.deepTarget:" + dt2.target.hashCode());
//        //Deeptarget2的两个引用类型的hashcode的值并不相同

        System.out.println("使用方式二完成深拷贝：");
        DeepTarget2 dt2 = (DeepTarget2) dt.deepClone();
        System.out.println("dt.deepTarget:" + dt.target.hashCode());
        System.out.println("dt2.deepTarget:" + dt2.target.hashCode());


    }
}
//写第一个基类
class DeepTarget implements Cloneable,Serializable{
    String name;
    int id;

    public DeepTarget(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() {
        DeepTarget target = null;
        try{
            target = (DeepTarget) super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return target;
    }
}
//第二个类，这个和类里面又一个引用类型
class DeepTarget2 implements Cloneable, Serializable {
    String name;
    DeepTarget target;

    public DeepTarget2(String name, DeepTarget target) {
        this.name = name;
        this.target = target;
    }

    public DeepTarget2(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeepTarget2{" +
                "name='" + name + '\'' +
                '}';
    }
    //方式一实现深拷贝
    /**
     * 其实是把属性分开来考虑，引用类型单独拿出来拷贝，调用引用类型的clone方法
     * 所以需要引用类型也要有clone方法，直到所有的类型都是基本类型
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成基本数据类型的拷贝
        deep = super.clone();
        //对引用类型单独处理
        DeepTarget2 deepTarget2 = (DeepTarget2)deep;//把Object强转成DeepTarget2
        deepTarget2.target = (DeepTarget)target.clone();
        //注意前面要在构造器里加上DeepTarget的参数，至少要被值拷贝，不然这里就会为空
        return deep;
    }
    //方式二：使用序列化完成深拷贝
    public Object deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//当前这个对象以对象流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepTarget2 copyObject = (DeepTarget2)ois.readObject();
            return copyObject;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }
    }

}