package com.callmedev.designpatterns.creational._2factory;

public class FactoryMain {
    public static void main(String[] args) {
        IShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getInfoAboutMe();// just to showcase

        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);// i don't know the shape yet, which shape I'll get, i just simply ordered the shape factory to get me the shape of circle type

        shape1.draw();

    }
}
