package Principle.Segregation;
//接口分离原则
public class Segregation1 {
    public static void main(String[] args) {
        A aa = new A();
        aa.operation1(new B());//A类通过接口依赖(使用)B类
        aa.operation2(new B());
        aa.operation3(new B());

        C cc = new C();
        cc.operation1(new D());//C类通过接口依赖D类
        cc.operation4(new D());//C类通过接口依赖D类
        cc.operation5(new D());//C类通过接口依赖D类
    }
}
interface Interface1{
    public void operation1();
}
interface Interface2{
    public void operation2();
    public void operation3();
}
interface Interface3{
    public void operation4();
    public void operation5();
}
class B implements Interface1,Interface2{

    @Override
    public void operation1() {
        System.out.println("B类实现了接口1");
    }

    @Override
    public void operation2() {
        System.out.println("B类实现了接口2");
    }

    @Override
    public void operation3() {
        System.out.println("B类实现了接口2");
    }
}
class D implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("D类实现了接口1");
    }

    @Override
    public void operation4() {
        System.out.println("D类实现了接口3");
    }

    @Override
    public void operation5() {
        System.out.println("D类实现了接口3");
    }
}
class A{
    public void operation1(Interface1 i){
        i.operation1();
    }
    public void operation2(Interface2 i){
        i.operation2();
    }
    public void operation3(Interface2 i){
        i.operation3();
    }
}
class C {
    public void operation1(Interface1 i){
        i.operation1();
    }
    public void operation4(Interface3 i){
        i.operation4();
    }
    public void operation5(Interface3 i){
        i.operation5();
    }
}