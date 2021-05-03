package com.vmware.quiz.oodesign;

public class Demo {

    /**
     * 抽象类将shape对象作为实例变量，因此对使用者而言，draw的前后置处理全部有抽象类完成了，
     * 仅需在实例化抽象类子类时传入想要完成的图形，前后置处理完全透明
     * @param args
     */
    public static void main(String[] args) {
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redCircle.draw();
        redRectangle.draw();
    }
}
