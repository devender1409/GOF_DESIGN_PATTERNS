package com.callmedev.designpatterns.creational._3abstractfactory.indian;

import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.Drink;

public class ButterMilk implements Drink {
    @Override
    public void serve() {
        System.out.println("Serving Butter Milk");
    }
}
