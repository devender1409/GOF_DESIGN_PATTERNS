package com.callmedev.designpatterns.creational._2factory;


public interface IShapeFactory {
    Shape getShape(ShapeType shapeType);
    default String getInfoAboutMe(){
        return "IShape Factory";
    }
}
