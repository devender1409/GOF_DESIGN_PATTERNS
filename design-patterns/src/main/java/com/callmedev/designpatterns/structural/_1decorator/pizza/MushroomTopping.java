package com.callmedev.designpatterns.structural._1decorator.pizza;

public class MushroomTopping extends PizzaDecorator{
    @Override
    double getPrice() {
        return 0;
    }
}
