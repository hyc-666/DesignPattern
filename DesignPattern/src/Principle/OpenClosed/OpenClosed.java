package Principle.OpenClosed;
//开闭原则(ocp原则)

/**
 * 1)开闭原则(Open Closed Principle) 是编程中最基础、最重要的设计原则
 * 2)一个软件实体如类，模块和函数应该对扩展开放,对修改关闭。
 * 用抽象构建框架，用实现扩展细节。
 * 3) 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，
 * 而不是通过修改已有的代码来实现变化。
 * 4)编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则。
 */
public class OpenClosed {
    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.draw(new Circle());
    }
}
//这是一个用于画图的类
class GraphEditor {
    public void draw(Shape sharp){
        sharp.draw();
    }
//    public void drawSharp(Sharp sharp) {
//        if (sharp.type == 1){
//            drawCircle(sharp);
//        }else if(sharp.type == 2){
//            drawRectangle(sharp);
//        }
//    }
//
//    public void drawCircle(Sharp sharp){
//        System.out.println("圆形");
//    }
//    public void drawRectangle(Sharp sharp){
//        System.out.println("矩形");
//    }
}
//形状,将这个类写为抽象类
abstract class Shape {
    int type;
    public abstract void draw();
}
class Circle extends Shape {
    public Circle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
class Rectangle extends Shape {
    public Rectangle() {
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}