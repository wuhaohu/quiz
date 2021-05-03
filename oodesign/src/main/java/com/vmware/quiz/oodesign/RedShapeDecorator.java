package com.vmware.quiz.oodesign;


public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        setBoldLine(decoratedShape);
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }

    private void setBoldLine(Shape decoratedShape) {
        System.out.println("Bold line");
    }
}
