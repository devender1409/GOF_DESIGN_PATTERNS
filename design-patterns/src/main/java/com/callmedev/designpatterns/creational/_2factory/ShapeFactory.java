package com.callmedev.designpatterns.creational._2factory;


public class ShapeFactory implements IShapeFactory{
    @Override
    public Shape getShape(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType){
            case SQUARE: shape = new Sqaure();
            break;

            case CIRCLE: shape = new Circle();
            break;

            case TRIANGLE: shape = new Triangle();
            break;
        }

        return shape;
    }
}
